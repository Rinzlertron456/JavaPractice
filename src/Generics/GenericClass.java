package Generics;

public class GenericClass<T> implements GenericInterface<T>{
    public T content;

    public GenericClass() {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public void create() {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }
}

class Ordinary{
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<>();
        gc.setContent("Hello World");
        String content = gc.getContent();
        System.out.println(content);
        GenericKeyValuePair<Character,Integer> gcollect = new GenericKeyValuePair<>('c',20);
        System.out.println(gcollect.getKey());
        System.out.println(gcollect.getValue());
    }
}
