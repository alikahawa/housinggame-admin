package nl.tudelft.simulation.housinggame.admin.form;

import org.jooq.Record;
import org.jooq.TableField;

public class FormEntryBoolean extends AbstractFormEntry<FormEntryBoolean, Byte>
{

    // assumes boolean is coded as TINYINT
    public FormEntryBoolean(final TableField<?, Byte> tableField)
    {
        super(tableField);
    }

    @Override
    public String codeForEdit(final Byte value)
    {
        if (value == null)
            return "0";
        return value.byteValue() == 1 ? "1" : "0";
    }

    @Override
    public Byte codeForDatabase(final String s)
    {
        return "1".equals(s) ? (byte) 1 : (byte) 0;
    }

    @Override
    public String makeHtml()
    {
        StringBuilder s = new StringBuilder();

        if (isHidden())
        {
            s.append("    <input type=\"hidden\" name=\"");
            s.append(getTableField().getName());
            s.append("\" value=\"");
            s.append(getLastEnteredValue() == null ? "0" : getLastEnteredValue());
            s.append("\" />\n");
            return s.toString();
        }

        s.append("    <tr>\n");
        s.append("      <td width=\"25%\">");
        s.append(getLabel());
        if (isRequired())
            s.append(" *");
        s.append("      </td>");
        s.append("      <td width=\"75%\">");
        s.append("<input type=\"checkbox\" name=\"");
        s.append(getTableField().getName());
        s.append("\" ");
        s.append(getLastEnteredValue() == null || "0".equals(getLastEnteredValue()) ? "" : "checked");
        s.append(" value=\"1\"");
        if (isReadOnly())
            s.append(" readonly />");
        else
            s.append(" />");
        s.append("</td>\n");
        s.append("    </tr>\n");
        return s.toString();
    }

    @Override
    public String setRecordValue(final Record record, final String value)
    {
        String v = value == null ? "0" : value; // field is NOT returned when not ticked...
        return super.setRecordValue(record, v);
    }

}