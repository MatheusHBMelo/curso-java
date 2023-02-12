package interfaces.herancamultipla;

public class Program {
    public static void main(String[] args) {
        ComboDevice cd = new ComboDevice("1234");
        System.out.println(cd.print("Olá"));
        System.out.println(cd.scan());
        cd.processDoc("Documento processado");
    }
}
