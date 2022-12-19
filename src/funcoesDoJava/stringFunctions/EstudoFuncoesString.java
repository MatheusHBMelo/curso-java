package funcoesDoJava.stringFunctions;

public class EstudoFuncoesString {
    public static void main(String[] args) {
        String codigo = "ABCD abcd fghi JKLM ABCD mnop   ";
        String codigoDois = "abcd abcd fghi JKLM ABcd mnoP   ";
        String nome = "Matheus";
        String sobrenome = "Barbosa";

        System.out.println("Original: -" + codigo + "-");

        // String toda em minusculo
        System.out.println("toLowerCase: -" + codigo.toLowerCase() + "-");

        // String toda em maiusculo
        System.out.println("toUpperCase: -" + codigo.toUpperCase() + "-");

        // Remove os espaços
        System.out.println("trim: -" + codigo.trim() + "-");

        // Recortar a String desde o espaço indexado de um caractere
        System.out.println("Substring(inicio): -" + codigo.substring(4) + "-");

        // Recortar a String desde o espaço indexado de um caractere com um espaço indexado como fim
        System.out.println("Substring(inicio|fim): -" + codigo.substring(6, 13) + "-");

        // Substituir uma unidade ou grupo de char por outro char
        System.out.println("replace(char, char): -" + codigo.replace('A', 'm') + "-");

        // Substituir uma unidade ou grupo de String por outro String
        System.out.println("replace(String, String): -" + codigo.replace("ABCD", "RSTU") + "-");

        // Encontrar a primeira posição do char escolhido
        System.out.println("IndexOf: -" + codigo.indexOf('f') + "-");

        // Encontrar a ultima posição do char escolhido
        System.out.println("LastIndexOf: -" + codigo.lastIndexOf('D') + "-");

        // Encontrar a posição de um determinado caractere na String
        System.out.println("charAt: -" + codigo.charAt(7) + "-");

        // Comparando duas Strings { 0 == iguais | 0 < == menor | 0 > == maior }
        System.out.println("compareTo: " + codigo.compareTo(codigoDois));

        // Comparando duas Strings ignorando letras maiusculas { 0 == iguais | 0 < == menor | 0 > == maior }
        System.out.println("compareToIgnoreCase: " + codigo.compareToIgnoreCase(codigoDois));

        // Concatenando String no final de outra String
        System.out.println("concat: " + nome.concat(sobrenome) );
    }
}
