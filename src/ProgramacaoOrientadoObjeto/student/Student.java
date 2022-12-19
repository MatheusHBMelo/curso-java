package ProgramacaoOrientadoObjeto.student;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public void media(){
        double total = nota1 + nota2 + nota3;

        if (total >= 60){
            System.out.printf("FINAL GRADE: %.2f%n", total);
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE: %.2f%n", total);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - total);
        }
    }
}
