/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Languages;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguagesRecord extends UpdatableRecordImpl<LanguagesRecord> implements Record6<UInteger, String, UInteger, UInteger, UInteger, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.languages.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.languages.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>housinggame.languages.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.languages.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.languages.language_id1</code>.
     */
    public void setLanguageId1(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.languages.language_id1</code>.
     */
    public UInteger getLanguageId1() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>housinggame.languages.language_id2</code>.
     */
    public void setLanguageId2(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.languages.language_id2</code>.
     */
    public UInteger getLanguageId2() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>housinggame.languages.language_id3</code>.
     */
    public void setLanguageId3(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.languages.language_id3</code>.
     */
    public UInteger getLanguageId3() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>housinggame.languages.language_id4</code>.
     */
    public void setLanguageId4(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.languages.language_id4</code>.
     */
    public UInteger getLanguageId4() {
        return (UInteger) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, String, UInteger, UInteger, UInteger, UInteger> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UInteger, String, UInteger, UInteger, UInteger, UInteger> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Languages.LANGUAGES.ID;
    }

    @Override
    public Field<String> field2() {
        return Languages.LANGUAGES.NAME;
    }

    @Override
    public Field<UInteger> field3() {
        return Languages.LANGUAGES.LANGUAGE_ID1;
    }

    @Override
    public Field<UInteger> field4() {
        return Languages.LANGUAGES.LANGUAGE_ID2;
    }

    @Override
    public Field<UInteger> field5() {
        return Languages.LANGUAGES.LANGUAGE_ID3;
    }

    @Override
    public Field<UInteger> field6() {
        return Languages.LANGUAGES.LANGUAGE_ID4;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UInteger component3() {
        return getLanguageId1();
    }

    @Override
    public UInteger component4() {
        return getLanguageId2();
    }

    @Override
    public UInteger component5() {
        return getLanguageId3();
    }

    @Override
    public UInteger component6() {
        return getLanguageId4();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public UInteger value3() {
        return getLanguageId1();
    }

    @Override
    public UInteger value4() {
        return getLanguageId2();
    }

    @Override
    public UInteger value5() {
        return getLanguageId3();
    }

    @Override
    public UInteger value6() {
        return getLanguageId4();
    }

    @Override
    public LanguagesRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public LanguagesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public LanguagesRecord value3(UInteger value) {
        setLanguageId1(value);
        return this;
    }

    @Override
    public LanguagesRecord value4(UInteger value) {
        setLanguageId2(value);
        return this;
    }

    @Override
    public LanguagesRecord value5(UInteger value) {
        setLanguageId3(value);
        return this;
    }

    @Override
    public LanguagesRecord value6(UInteger value) {
        setLanguageId4(value);
        return this;
    }

    @Override
    public LanguagesRecord values(UInteger value1, String value2, UInteger value3, UInteger value4, UInteger value5, UInteger value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LanguagesRecord
     */
    public LanguagesRecord() {
        super(Languages.LANGUAGES);
    }

    /**
     * Create a detached, initialised LanguagesRecord
     */
    public LanguagesRecord(UInteger id, String name, UInteger languageId1, UInteger languageId2, UInteger languageId3, UInteger languageId4) {
        super(Languages.LANGUAGES);

        setId(id);
        setName(name);
        setLanguageId1(languageId1);
        setLanguageId2(languageId2);
        setLanguageId3(languageId3);
        setLanguageId4(languageId4);
        resetChangedOnNotNull();
    }
}