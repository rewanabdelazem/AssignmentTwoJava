public class Number {
    private int number;

    private void setValue(int number)
    {
        this.number = number;
    }
    public int getValue()
    {
        return number;
    }
    public Number(int number) // constructor
    {
        setValue(number);
    }
    public Number(){} // parameterless constructor
}
