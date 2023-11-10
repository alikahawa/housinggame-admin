/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Indexes;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerroundRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class Playerround extends TableImpl<PlayerroundRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.playerround</code>
     */
    public static final Playerround PLAYERROUND = new Playerround();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayerroundRecord> getRecordType() {
        return PlayerroundRecord.class;
    }

    /**
     * The column <code>housinggame.playerround.id</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.playerround.satisfaction</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> SATISFACTION = createField(DSL.name("satisfaction"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.saving</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> SAVING = createField(DSL.name("saving"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.mortgage</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> MORTGAGE = createField(DSL.name("mortgage"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.living_costs</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> LIVING_COSTS = createField(DSL.name("living_costs"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.income</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> INCOME = createField(DSL.name("income"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.debt</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> DEBT = createField(DSL.name("debt"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.current_wealth</code>.
     */
    public final TableField<PlayerroundRecord, Integer> CURRENT_WEALTH = createField(DSL.name("current_wealth"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.preferred_house_rating</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> PREFERRED_HOUSE_RATING = createField(DSL.name("preferred_house_rating"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_cost_per_point</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> SATISFACTION_COST_PER_POINT = createField(DSL.name("satisfaction_cost_per_point"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.house_price_sold</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> HOUSE_PRICE_SOLD = createField(DSL.name("house_price_sold"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.house_price_bought</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> HOUSE_PRICE_BOUGHT = createField(DSL.name("house_price_bought"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.spent_savings_for_buying_house</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> SPENT_SAVINGS_FOR_BUYING_HOUSE = createField(DSL.name("spent_savings_for_buying_house"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.paid_off_debt</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> PAID_OFF_DEBT = createField(DSL.name("paid_off_debt"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.measure_bought</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> MEASURE_BOUGHT = createField(DSL.name("measure_bought"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.pluvial_damage</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> PLUVIAL_DAMAGE = createField(DSL.name("pluvial_damage"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.fluvial_damage</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> FLUVIAL_DAMAGE = createField(DSL.name("fluvial_damage"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.repaired_damage</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> REPAIRED_DAMAGE = createField(DSL.name("repaired_damage"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_point_bought</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> SATISFACTION_POINT_BOUGHT = createField(DSL.name("satisfaction_point_bought"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.create_time</code>.
     */
    public final TableField<PlayerroundRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>housinggame.playerround.moving_reason</code>.
     */
    public final TableField<PlayerroundRecord, String> MOVING_REASON = createField(DSL.name("moving_reason"), SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.CLOB)), this, "");

    /**
     * The column <code>housinggame.playerround.house_id</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> HOUSE_ID = createField(DSL.name("house_id"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>housinggame.playerround.player_id</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> PLAYER_ID = createField(DSL.name("player_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.groupround_id</code>.
     */
    public final TableField<PlayerroundRecord, UInteger> GROUPROUND_ID = createField(DSL.name("groupround_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private Playerround(Name alias, Table<PlayerroundRecord> aliased) {
        this(alias, aliased, null);
    }

    private Playerround(Name alias, Table<PlayerroundRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.playerround</code> table reference
     */
    public Playerround(String alias) {
        this(DSL.name(alias), PLAYERROUND);
    }

    /**
     * Create an aliased <code>housinggame.playerround</code> table reference
     */
    public Playerround(Name alias) {
        this(alias, PLAYERROUND);
    }

    /**
     * Create a <code>housinggame.playerround</code> table reference
     */
    public Playerround() {
        this(DSL.name("playerround"), null);
    }

    public <O extends Record> Playerround(Table<O> child, ForeignKey<O, PlayerroundRecord> key) {
        super(child, key, PLAYERROUND);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PLAYERROUND_FK_PLAYERROUND_GROUPROUND1_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_HOUSE1_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_PLAYER1_IDX);
    }

    @Override
    public Identity<PlayerroundRecord, UInteger> getIdentity() {
        return (Identity<PlayerroundRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<PlayerroundRecord> getPrimaryKey() {
        return Keys.KEY_PLAYERROUND_PRIMARY;
    }

    @Override
    public List<UniqueKey<PlayerroundRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PLAYERROUND_ID_UNIQUE, Keys.KEY_PLAYERROUND_ID_PLAYER_GROUPROUND);
    }

    @Override
    public List<ForeignKey<PlayerroundRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PLAYERROUND_HOUSE1, Keys.FK_PLAYERROUND_PLAYER1, Keys.FK_PLAYERROUND_GROUPROUND1);
    }

    private transient House _house;
    private transient Player _player;
    private transient Groupround _groupround;

    /**
     * Get the implicit join path to the <code>housinggame.house</code> table.
     */
    public House house() {
        if (_house == null)
            _house = new House(this, Keys.FK_PLAYERROUND_HOUSE1);

        return _house;
    }

    /**
     * Get the implicit join path to the <code>housinggame.player</code> table.
     */
    public Player player() {
        if (_player == null)
            _player = new Player(this, Keys.FK_PLAYERROUND_PLAYER1);

        return _player;
    }

    /**
     * Get the implicit join path to the <code>housinggame.groupround</code>
     * table.
     */
    public Groupround groupround() {
        if (_groupround == null)
            _groupround = new Groupround(this, Keys.FK_PLAYERROUND_GROUPROUND1);

        return _groupround;
    }

    @Override
    public Playerround as(String alias) {
        return new Playerround(DSL.name(alias), this);
    }

    @Override
    public Playerround as(Name alias) {
        return new Playerround(alias, this);
    }

    @Override
    public Playerround as(Table<?> alias) {
        return new Playerround(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Playerround rename(String name) {
        return new Playerround(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Playerround rename(Name name) {
        return new Playerround(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Playerround rename(Table<?> name) {
        return new Playerround(name.getQualifiedName(), null);
    }
}
