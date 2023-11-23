package nl.tudelft.simulation.housinggame.admin.form.table;

import org.jooq.TableField;

public class TableEntryInt extends AbstractTableEntry<TableEntryInt, Integer>
{

    int min;

    int max;

    int step;

    String pattern;

    public TableEntryInt(final TableField<?, Integer> tableField)
    {
        super(tableField);
        this.min = -Integer.MAX_VALUE;
        this.max = Integer.MAX_VALUE;
        this.step = 1;
        this.pattern = "\\d+";
    }

    public int getMin()
    {
        return this.min;
    }

    public TableEntryInt setMin(final int min)
    {
        this.min = min;
        return this;
    }

    public int getMax()
    {
        return this.max;
    }

    public TableEntryInt setMax(final int max)
    {
        this.max = max;
        return this;
    }

    public int getStep()
    {
        return this.step;
    }

    public TableEntryInt setStep(final int step)
    {
        this.step = step;
        return this;
    }

    public String getPattern()
    {
        return this.pattern;
    }

    public TableEntryInt setPattern(final String pattern)
    {
        this.pattern = pattern;
        return this;
    }

    @Override
    public String codeForEdit(final Integer value)
    {
        if (value == null)
            return "";
        return value.toString();
    }

    @Override
    public Integer codeForType(final String s)
    {
        return Integer.valueOf(s);
    }

    @Override
    protected void validate(final String value)
    {
        super.validate(value);
        try
        {
            int v = Integer.valueOf(value);
            if (v < getMin())
                addError("Value lower than minimum " + getMin());
            if (v > getMax())
                addError("Value larger than maximum " + getMin());
            // TODO: step, pattern
        }
        catch (Exception exception)
        {
            addError("Exception: " + exception.getMessage());
        }
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
            s.append(getLastEnteredValue() == null ? "" : getLastEnteredValue());
            s.append("\" />\n");
            return s.toString();
        }

        s.append("    <tr>\n");
        String labelLength = getForm().getLabelLength() == null ? "25%" : getForm().getLabelLength();
        s.append("      <td width=\"" + labelLength + "\">");
        s.append(getLabel());
        if (isRequired())
            s.append(" *");
        s.append("      </td>");
        String fieldLength = getForm().getFieldLength() == null ? "75%" : getForm().getFieldLength();
        s.append("      <td width=\"" + fieldLength + "\">");
        s.append("<input type=\"number\" min=\"");
        s.append(getMin());
        s.append("\" max=\"");
        s.append(getMax());
        s.append("\" step=\"");
        s.append(getStep());
        s.append("\" pattern=\"");
        s.append(getPattern());
        if (isRequired())
            s.append("\" required name=\"");
        else
            s.append("\" name=\"");
        s.append(getTableField().getName());
        s.append("\" value=\"");
        s.append(getLastEnteredValue() == null ? "" : getLastEnteredValue());
        if (isReadOnly())
            s.append("\" readonly />");
        else
            s.append("\" />");
        s.append("</td>\n");
        s.append("    </tr>\n");
        return s.toString();
    }

}
