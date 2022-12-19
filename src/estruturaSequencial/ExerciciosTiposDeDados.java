package estruturaSequencial;

/*
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <nome>, na idade de <idade> anos, com o sexo <sexo char>, residente no endereço <endereço>, com numero de telefone <telefone>,
identificador de funcionario <id> e status de colaborador <status bool> confirmo que recebi a quantia salarial de <salario>
junto a um adicional de <adicinal> na data de <data>.
 */
public class ExerciciosTiposDeDados {
    public static void main(String[] args) {
        byte numByte = 127;
        short numShort = 32767;
        int idade = 21;
        long id = 98765432109876L;
        float adicional = 300.00F;
        double salario = 2500.00;
        boolean status = true;
        char sexo = 'M';
        String nome = "Matheus Henrique";
        String data = "22/12/2022";
        String endereco = "Recife - PE";
        String telefone = "1234-1234";

        System.out.printf("""
                Eu, %s, na idade de %d anos, com o sexo %c, residente no endereço %s \s
                com numero de telefone %s,\s
                identificador de funcionario %d \s
                e status de colaborador %b \s
                confirmo que recebi a quantia salarial de %.2f \s
                junto a um adicional de %.2f na data de %s. \s
                Consulta código %d, numero %d""",
                nome, idade, sexo, endereco, telefone, id, status, salario, adicional, data, numShort, numByte);
    }
}
