/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.LanguageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class Language extends TableImpl<LanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.language</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguageRecord> getRecordType() {
        return LanguageRecord.class;
    }

    /**
     * The column <code>housinggame.language.id</code>.
     */
    public final TableField<LanguageRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.language.language1</code>.
     */
    public final TableField<LanguageRecord, String> LANGUAGE1 = createField(DSL.name("language1"), SQLDataType.VARCHAR(2).nullable(false).defaultValue(DSL.field(DSL.raw("'EN'"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>housinggame.language.language2</code>.
     */
    public final TableField<LanguageRecord, String> LANGUAGE2 = createField(DSL.name("language2"), SQLDataType.VARCHAR(2).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>housinggame.language.language3</code>.
     */
    public final TableField<LanguageRecord, String> LANGUAGE3 = createField(DSL.name("language3"), SQLDataType.VARCHAR(2).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>housinggame.language.language4</code>.
     */
    public final TableField<LanguageRecord, String> LANGUAGE4 = createField(DSL.name("language4"), SQLDataType.VARCHAR(2).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>housinggame.language.lock</code>.
     */
    public final TableField<LanguageRecord, String> LOCK = createField(DSL.name("lock"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'X'"), SQLDataType.VARCHAR)), this, "");

    private Language(Name alias, Table<LanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Language(Name alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.language</code> table reference
     */
    public Language(String alias) {
        this(DSL.name(alias), LANGUAGE);
    }

    /**
     * Create an aliased <code>housinggame.language</code> table reference
     */
    public Language(Name alias) {
        this(alias, LANGUAGE);
    }

    /**
     * Create a <code>housinggame.language</code> table reference
     */
    public Language() {
        this(DSL.name("language"), null);
    }

    public <O extends Record> Language(Table<O> child, ForeignKey<O, LanguageRecord> key) {
        super(child, key, LANGUAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public Identity<LanguageRecord, UInteger> getIdentity() {
        return (Identity<LanguageRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<LanguageRecord> getPrimaryKey() {
        return Keys.KEY_LANGUAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<LanguageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_LANGUAGE_ID_UNIQUE, Keys.KEY_LANGUAGE_LOCK_UNIQUE);
    }

    @Override
    public Language as(String alias) {
        return new Language(DSL.name(alias), this);
    }

    @Override
    public Language as(Name alias) {
        return new Language(alias, this);
    }

    @Override
    public Language as(Table<?> alias) {
        return new Language(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(String name) {
        return new Language(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Name name) {
        return new Language(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Table<?> name) {
        return new Language(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super UInteger, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super UInteger, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
