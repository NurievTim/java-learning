package practice_8.generics;

public class Pair<A, B> {
    private A a;
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();

        pair.setA("a");
        pair.setB(1);

        System.out.println(pair.getA());
        System.out.println(pair.getB());
    }
}
