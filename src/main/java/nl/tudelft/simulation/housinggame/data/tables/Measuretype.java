/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Indexes;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Measuretype extends TableImpl<MeasuretypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.measuretype</code>
     */
    public static final Measuretype MEASURETYPE = new Measuretype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeasuretypeRecord> getRecordType() {
        return MeasuretypeRecord.class;
    }

    /**
     * The column <code>housinggame.measuretype.id</code>.
     */
    public final TableField<MeasuretypeRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.measuretype.name</code>.
     */
    public final TableField<MeasuretypeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.description</code>.
     */
    public final TableField<MeasuretypeRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.price</code>.
     */
    public final TableField<MeasuretypeRecord, UInteger> PRICE = createField(DSL.name("price"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.satisfaction</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> SATISFACTION = createField(DSL.name("satisfaction"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.pluvial_protection_level</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> PLUVIAL_PROTECTION_LEVEL = createField(DSL.name("pluvial_protection_level"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.fluvial_protection_level</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> FLUVIAL_PROTECTION_LEVEL = createField(DSL.name("fluvial_protection_level"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.gameversion_id</code>.
     */
    public final TableField<MeasuretypeRecord, UInteger> GAMEVERSION_ID = createField(DSL.name("gameversion_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private Measuretype(Name alias, Table<MeasuretypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Measuretype(Name alias, Table<MeasuretypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.measuretype</code> table reference
     */
    public Measuretype(String alias) {
        this(DSL.name(alias), MEASURETYPE);
    }

    /**
     * Create an aliased <code>housinggame.measuretype</code> table reference
     */
    public Measuretype(Name alias) {
        this(alias, MEASURETYPE);
    }

    /**
     * Create a <code>housinggame.measuretype</code> table reference
     */
    public Measuretype() {
        this(DSL.name("measuretype"), null);
    }

    public <O extends Record> Measuretype(Table<O> child, ForeignKey<O, MeasuretypeRecord> key) {
        super(child, key, MEASURETYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.MEASURETYPE_FK_MEASURETYPE_GAMEVERSION1_IDX);
    }

    @Override
    public Identity<MeasuretypeRecord, UInteger> getIdentity() {
        return (Identity<MeasuretypeRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<MeasuretypeRecord> getPrimaryKey() {
        return Keys.KEY_MEASURETYPE_PRIMARY;
    }

    @Override
    public List<UniqueKey<MeasuretypeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MEASURETYPE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<MeasuretypeRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_MEASURETYPE_GAMEVERSION1);
    }

    private transient Gameversion _gameversion;

    /**
     * Get the implicit join path to the <code>housinggame.gameversion</code>
     * table.
     */
    public Gameversion gameversion() {
        if (_gameversion == null)
            _gameversion = new Gameversion(this, Keys.FK_MEASURETYPE_GAMEVERSION1);

        return _gameversion;
    }

    @Override
    public Measuretype as(String alias) {
        return new Measuretype(DSL.name(alias), this);
    }

    @Override
    public Measuretype as(Name alias) {
        return new Measuretype(alias, this);
    }

    @Override
    public Measuretype as(Table<?> alias) {
        return new Measuretype(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Measuretype rename(String name) {
        return new Measuretype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Measuretype rename(Name name) {
        return new Measuretype(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Measuretype rename(Table<?> name) {
        return new Measuretype(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<UInteger, String, String, UInteger, Integer, Integer, Integer, UInteger> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super UInteger, ? super String, ? super String, ? super UInteger, ? super Integer, ? super Integer, ? super Integer, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super UInteger, ? super String, ? super String, ? super UInteger, ? super Integer, ? super Integer, ? super Integer, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
