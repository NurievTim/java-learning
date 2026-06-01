package practice_8.generics;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box<String> strBox = new Box<>();

        intBox.setItem(2);
        System.out.println(intBox.getItem());

        strBox.setItem("asd");
        System.out.println(strBox.getItem());
    }

}


