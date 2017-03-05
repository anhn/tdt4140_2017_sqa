import java.awt.Dimension;
/**
 * Example class.  The height and width values should never
 * be negative.
 */
public class Task4
{
    static final public int TOTAL_VALUES = 10;
    private Dimension[] d = new Dimension[TOTAL_VALUES];
    public Example ()
    {
    }
    /**
     * Set height and width.  Both height and width must be nonnegative
     * or an exception will be thrown.
     */
    public synchronized void setValues (int index, int height, int width)
        throws IllegalArgumentException
    {
        if (height < 0 || width < 0)
            throw new IllegalArgumentException();
        if (d[index] == null)
            d[index] = new Dimension();
        d[index].height = height;
        d[index].width = width;
    }
    public synchronized Dimension[] getValues() 
        throws CloneNotSupportedException
    {
        return (Dimension[])d.clone();
    }
}