package Generics;

class Box<T extends Number & Display>{
    public T item;

    public Box(T item) {
        this.item = item;
    }
    public void display(){
        item.show();
    }
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class Test{
    public static void main(String[] args) {
        CustomLayeredImplementation custom = new CustomLayeredImplementation(300);
        Box<CustomLayeredImplementation> box = new Box<>(custom);
        box.display();
    }
}
