package interfaces;

import static interfaces.EstudoInterface.a;

public class Main {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println("Printando o atributo public, static final da interface: " + a);
    }
}
