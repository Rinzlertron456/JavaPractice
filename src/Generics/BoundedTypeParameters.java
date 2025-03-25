package Generics;

public class BoundedTypeParameters<T extends Number>{

    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public static void main(String[] args) {
        BoundedTypeParameters<Long> btp = new BoundedTypeParameters<>();
        btp.setNumber(102L);
        System.out.println(btp.getNumber());
    }
}
