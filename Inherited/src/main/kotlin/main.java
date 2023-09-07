public class main {
    public static void main(String[] args) {
        C c = new C("text");
        c.doOne();
    }

    interface B {
        default void doOne() {
            System.out.println("default B call");
        }
    }
}