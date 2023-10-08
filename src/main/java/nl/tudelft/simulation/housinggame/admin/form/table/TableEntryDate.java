package nl.tudelft.simulation.housinggame.admin.form.table;

import java.time.LocalDate;

import org.jooq.TableField;

public class TableEntryDate extends AbstractTableEntry<TableEntryDate, LocalDate>
{

    public TableEntryDate(final TableField<?, LocalDate> tableField)
    {
        super(tableField);
    }

    @Override
    public String codeForEdit(final LocalDate value)
    {
        if (value == null)
            return "";
        return value.toString().replaceFirst("T", ", ");
    }

    @Override
    public LocalDate codeForType(final String s)
    {
        if (s != null && s.length() > 0)
        {
            return LocalDate.parse(s);
        }
        return null;
    }

    @Override
    protected void validate(final String value)
    {
        super.validate(value);
        if (value != null && value.length() > 0)
        {
            try
            {
                LocalDate.parse(value);
            }
            catch (Exception exception)
            {
                addError("Exception: " + exception.getMessage());
            }
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
        s.append("      <td width=\"25%\">");
        s.append(getLabel());
        if (isRequired())
            s.append(" *");
        s.append("      </td>");
        s.append("      <td width=\"75%\">");
        s.append("<input class=\"form-control\" ");
        if (isRequired())
            s.append("required name=\"");
        else
            s.append("name=\"");
        s.append(getTableField().getName());
        s.append("\" value=\"");
        s.append(getLastEnteredValue() == null ? "" : getLastEnteredValue());
        if (isReadOnly())
            s.append("\" readonly />");
        else
            s.append("\" />");
        s.append("</td>\n");
        s.append("    </tr>\n");

        if (!isReadOnly())
        {
            s.append("    <script>\n");
            s.append("      instance = new dtsel.DTS('input[name=\"");
            s.append(getTableField().getName());
            s.append("\"]', { direction: 'BOTTOM', dateFormat: \"yyyy-mm-dd\", showTime: false});");
            s.append("    </script>\n");
        }
        return s.toString();
    }

}
