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
import nl.tudelft.simulation.housinggame.data.tables.records.QuestionscoreRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class Questionscore extends TableImpl<QuestionscoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.questionscore</code>
     */
    public static final Questionscore QUESTIONSCORE = new Questionscore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuestionscoreRecord> getRecordType() {
        return QuestionscoreRecord.class;
    }

    /**
     * The column <code>housinggame.questionscore.id</code>.
     */
    public final TableField<QuestionscoreRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.questionscore.score</code>.
     */
    public final TableField<QuestionscoreRecord, Integer> SCORE = createField(DSL.name("score"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.questionscore.playerround_id</code>.
     */
    public final TableField<QuestionscoreRecord, UInteger> PLAYERROUND_ID = createField(DSL.name("playerround_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.questionscore.question_id</code>.
     */
    public final TableField<QuestionscoreRecord, UInteger> QUESTION_ID = createField(DSL.name("question_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private Questionscore(Name alias, Table<QuestionscoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Questionscore(Name alias, Table<QuestionscoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.questionscore</code> table reference
     */
    public Questionscore(String alias) {
        this(DSL.name(alias), QUESTIONSCORE);
    }

    /**
     * Create an aliased <code>housinggame.questionscore</code> table reference
     */
    public Questionscore(Name alias) {
        this(alias, QUESTIONSCORE);
    }

    /**
     * Create a <code>housinggame.questionscore</code> table reference
     */
    public Questionscore() {
        this(DSL.name("questionscore"), null);
    }

    public <O extends Record> Questionscore(Table<O> child, ForeignKey<O, QuestionscoreRecord> key) {
        super(child, key, QUESTIONSCORE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.QUESTIONSCORE_FK_QUESTIONSCORE_PLAYERROUND1_IDX, Indexes.QUESTIONSCORE_FK_QUESTIONSCORE_QUESTION1_IDX);
    }

    @Override
    public Identity<QuestionscoreRecord, UInteger> getIdentity() {
        return (Identity<QuestionscoreRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<QuestionscoreRecord> getPrimaryKey() {
        return Keys.KEY_QUESTIONSCORE_PRIMARY;
    }

    @Override
    public List<UniqueKey<QuestionscoreRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_QUESTIONSCORE_ID_UNIQUE, Keys.KEY_QUESTIONSCORE_ID_PLAYERROUND_QUESTION);
    }

    @Override
    public List<ForeignKey<QuestionscoreRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_QUESTIONSCORE_PLAYERROUND1, Keys.FK_QUESTIONSCORE_QUESTION1);
    }

    private transient Playerround _playerround;
    private transient Question _question;

    /**
     * Get the implicit join path to the <code>housinggame.playerround</code>
     * table.
     */
    public Playerround playerround() {
        if (_playerround == null)
            _playerround = new Playerround(this, Keys.FK_QUESTIONSCORE_PLAYERROUND1);

        return _playerround;
    }

    /**
     * Get the implicit join path to the <code>housinggame.question</code>
     * table.
     */
    public Question question() {
        if (_question == null)
            _question = new Question(this, Keys.FK_QUESTIONSCORE_QUESTION1);

        return _question;
    }

    @Override
    public Questionscore as(String alias) {
        return new Questionscore(DSL.name(alias), this);
    }

    @Override
    public Questionscore as(Name alias) {
        return new Questionscore(alias, this);
    }

    @Override
    public Questionscore as(Table<?> alias) {
        return new Questionscore(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Questionscore rename(String name) {
        return new Questionscore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Questionscore rename(Name name) {
        return new Questionscore(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Questionscore rename(Table<?> name) {
        return new Questionscore(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<UInteger, Integer, UInteger, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super UInteger, ? super Integer, ? super UInteger, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super UInteger, ? super Integer, ? super UInteger, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
