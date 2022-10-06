public class Pair<A, B> {
    private A a;
    private B b;

    /**
     * Constructor to force instantiation of first & second
     */
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }

    public A getA() { return a; }
    public B getB() { return b; }

}
