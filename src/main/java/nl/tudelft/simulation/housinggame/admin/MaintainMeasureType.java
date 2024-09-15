package nl.tudelft.simulation.housinggame.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.admin.form.table.TableEntryBoolean;
import nl.tudelft.simulation.housinggame.admin.form.table.TableEntryDouble;
import nl.tudelft.simulation.housinggame.admin.form.table.TableEntryInt;
import nl.tudelft.simulation.housinggame.admin.form.table.TableEntryPickRecord;
import nl.tudelft.simulation.housinggame.admin.form.table.TableEntryString;
import nl.tudelft.simulation.housinggame.admin.form.table.TableEntryText;
import nl.tudelft.simulation.housinggame.admin.form.table.TableForm;
import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;

public class MaintainMeasureType
{

    public static void handleMenu(final HttpServletRequest request, final String click, int recordId)
    {
        HttpSession session = request.getSession();
        AdminData data = SessionUtils.getData(session);

        if (click.equals("measuretype"))
        {
            data.clearColumns("20%", "GameVersion", "20%", "MeasureType");
            data.clearFormColumn("60%", "Edit Properties");
            showGameVersion(session, data, 0);
        }

        else if (click.contains("MeasureTypeGameVersion"))
        {
            showGameVersion(session, data, recordId);
        }

        else if (click.contains("MeasureType"))
        {
            if (click.startsWith("save"))
                recordId = data.saveRecord(request, recordId, Tables.MEASURETYPE, "measuretype");
            else if (click.startsWith("delete"))
            {
                MeasuretypeRecord measureType = SqlUtils.readRecordFromId(data, Tables.MEASURETYPE, recordId);
                if (click.endsWith("Ok"))
                    data.deleteRecordOk(measureType, "measuretype");
                else
                    data.askDeleteRecord(measureType, "MeasureType", String.valueOf(measureType.getName()),
                            "deleteMeasureTypeOk", "measuretype");
                recordId = 0;
            }
            if (!data.isError())
            {
                showMeasureType(session, data, recordId, true, !click.startsWith("view"));
                if (click.startsWith("new"))
                    editMeasureType(session, data, 0, true);
            }
        }

        AdminServlet.makeColumnContent(data);
    }

    /*
     * *********************************************************************************************************
     * ****************************************** GAMEVERSION **************************************************
     * *********************************************************************************************************
     */

    public static void showGameVersion(final HttpSession session, final AdminData data, final int recordId)
    {
        data.showColumn("MeasureTypeGameVersion", 0, recordId, false, Tables.GAMEVERSION, Tables.GAMEVERSION.NAME, "name",
                false);
        data.resetColumn(1);
        data.resetFormColumn();
        if (recordId != 0)
        {
            data.showDependentColumn("MeasureType", 1, 0, true, Tables.MEASURETYPE, Tables.MEASURETYPE.NAME, "name",
                    Tables.MEASURETYPE.GAMEVERSION_ID, true);
        }
    }

    /*
     * *********************************************************************************************************
     * ***************************************** MEASURETYPE **********************************************
     * *********************************************************************************************************
     */

    public static void showMeasureType(final HttpSession session, final AdminData data, final int recordId,
            final boolean editButton, final boolean editRecord)
    {
        data.showColumn("MeasureTypeGameVersion", 0, data.getColumn(0).getSelectedRecordId(), false, Tables.GAMEVERSION,
                Tables.GAMEVERSION.NAME, "name", false);
        data.showDependentColumn("MeasureType", 1, recordId, true, Tables.MEASURETYPE, Tables.MEASURETYPE.NAME, "name",
                Tables.MEASURETYPE.GAMEVERSION_ID, true);
        data.resetFormColumn();
        if (recordId != 0)
        {
            editMeasureType(session, data, recordId, editRecord);
        }
    }

    public static void editMeasureType(final HttpSession session, final AdminData data, final int measureTypeId,
            final boolean edit)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        MeasuretypeRecord measureType = measureTypeId == 0 ? dslContext.newRecord(Tables.MEASURETYPE)
                : dslContext.selectFrom(Tables.MEASURETYPE).where(Tables.MEASURETYPE.ID.eq(measureTypeId)).fetchOne();
        int gameVersionId = measureTypeId == 0 ? data.getColumn(0).getSelectedRecordId() : measureType.getGameversionId();
        //@formatter:off
        TableForm form = new TableForm()
                .setEdit(edit)
                .setCancelMethod("measuretype", data.getColumn(0).getSelectedRecordId())
                .setEditMethod("editMeasureType")
                .setSaveMethod("saveMeasureType")
                .setDeleteMethod("deleteMeasureType", "Delete", "<br>Note: MeasureType can only be deleted when it "
                        + "<br>has not been used in a scenario")
                .setRecordNr(measureTypeId)
                .startForm()
                .addEntry(new TableEntryString(Tables.MEASURETYPE.SHORT_ALIAS)
                        .setRequired()
                        .setInitialValue(measureType.getShortAlias(), "")
                        .setLabel("Short alias")
                        .setMaxChars(24))
                .addEntry(new TableEntryString(Tables.MEASURETYPE.NAME)
                        .setRequired()
                        .setInitialValue(measureType.getName(), "")
                        .setLabel("Name")
                        .setMaxChars(255))
                .addEntry(new TableEntryText(Tables.MEASURETYPE.DESCRIPTION)
                        .setRequired()
                        .setInitialValue(measureType.getDescription(), "")
                        .setLabel("Description"))
                .addEntry(new TableEntryPickRecord(Tables.MEASURETYPE.MEASURECATEGORY_ID)
                        .setPickTable(data, Tables.MEASURECATEGORY,
                                Tables.MEASURECATEGORY.ID, Tables.MEASURECATEGORY.NAME)
                        .setInitialValue(measureType.getMeasurecategoryId(), 0)
                        .setLabel("House start of round"))
                .addEntry(new TableEntryDouble(Tables.MEASURETYPE.CATEGORY_SEQUENCE_NR)
                        .setRequired()
                        .setInitialValue(measureType.getCategorySequenceNr(), 1.0)
                        .setLabel("Category sequence nr")
                        .setMin(0.0))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.COST_ABSOLUTE)
                        .setRequired()
                        .setInitialValue(measureType.getCostAbsolute(), 0)
                        .setLabel("Absolute cost")
                        .setMin(0))
                .addEntry(new TableEntryDouble(Tables.MEASURETYPE.COST_PERCENTAGE_HOUSE)
                        .setRequired()
                        .setInitialValue(measureType.getCostPercentageHouse(), 0.0)
                        .setLabel("Cost as % of house value")
                        .setMin(0.0))
                .addEntry(new TableEntryDouble(Tables.MEASURETYPE.COST_PERCENTAGE_INCOME)
                        .setRequired()
                        .setInitialValue(measureType.getCostPercentageIncome(), 0.0)
                        .setLabel("Cost as % of income")
                        .setMin(0.0))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.SATISFACTION_DELTA_ONCE)
                        .setRequired()
                        .setInitialValue(measureType.getSatisfactionDeltaOnce(), 0)
                        .setLabel("Satisfaction delta once"))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.SATISFACTION_DELTA_PERMANENT)
                        .setRequired()
                        .setInitialValue(measureType.getSatisfactionDeltaPermanent(), 0)
                        .setLabel("Satisfaction delta permanent"))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.FLUVIAL_PROTECTION_DELTA)
                        .setRequired()
                        .setInitialValue(measureType.getFluvialProtectionDelta(), 0)
                        .setLabel("Fluvial protection delta"))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.PLUVIAL_PROTECTION_DELTA)
                        .setRequired()
                        .setInitialValue(measureType.getPluvialProtectionDelta(), 0)
                        .setLabel("Pluvial protection delta"))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.HOUSE_VALUE_DELTA)
                        .setRequired()
                        .setInitialValue(measureType.getHouseValueDelta(), 0)
                        .setLabel("House value delta"))
                .addEntry(new TableEntryBoolean(Tables.MEASURETYPE.VALID_ONE_ROUND)
                        .setRequired()
                        .setInitialValue(measureType.getValidOneRound(), (byte) 0)
                        .setLabel("Valid for one round only?"))
                .addEntry(new TableEntryBoolean(Tables.MEASURETYPE.HOUSE_MEASURE)
                        .setRequired()
                        .setInitialValue(measureType.getHouseMeasure(), (byte) 1)
                        .setLabel("House measure [T] / personal [F]"))
                .addEntry(new TableEntryInt(Tables.MEASURETYPE.GAMEVERSION_ID)
                        .setInitialValue(gameVersionId, 0)
                        .setLabel("Scenario id")
                        .setHidden(true))
                .endForm();
        //@formatter:on
        data.getFormColumn().setHeaderForm("Edit MeasureType", form);
    }

}
