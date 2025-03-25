package Generics;

public class CustomLayeredImplementation extends Number implements Display{
    
    private final int value;

    public CustomLayeredImplementation(int value) {
        this.value = value;
    }

    @Override
    public void show() {
        System.out.println(value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
