package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*01
        Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou Bli] = AÍil.
         */
        System.out.println("\n---------- EXERCICIO 1 ----------");
        int[] A = new int[5];
        int[] B = new int[5];

        for (int i = 0; i < A.length; i++) {
            A[i] = i;
        }

        for (int i = 0; i < B.length; i++){
            B[i] = A[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        /*02
        Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
        e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
        */
        System.out.println("\n---------- EXERCICIO 2 ----------");
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] += 2 * i;
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        /*03
        Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
        sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:

        Bi] = Afi] * A
        */
        System.out.println("\n---------- EXERCICIO 3 ----------");
        int[] vetA = new int[15];
        int[] vetB = new int[15];

        for (int i = 0; i < vetA.length; i++) {
            vetA[i] += i;
        }

        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = vetA[i] * vetA[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        /*04
        Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
        sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja:

        B[i] = sqrt(Afil).
         */
        System.out.println("\n---------- EXERCICIO 4 ----------");
        double[] vectA = new double[15];
        double[] vectB = new double[15];

        for (int i = 0; i < vectA.length; i++) {
            vectA[i] += i;
        }

        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = (int) Math.sqrt(vectA[i]);
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            System.out.print(vectA[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print(vectB[i] + " ");
        }

        /*05
        Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
        sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição

        Bil = Af) * i.
         */
        System.out.println("\n---------- EXERCICIO 5 ----------");
        int[] vectorA = new int[15];
        int[] vectorB = new int[15];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] += i;
        }

        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] + 1;
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }

        /*06
        Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
        onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:

        Cli] = Afi] + B[l.
        */
        System.out.println("\n---------- EXERCICIO 6 ----------");
        int[] veA = new int[10];
        int[] veB = new int[10];

        for (int i = 0; i < veA.length; i++) {
            veA[i] += i;
        }

        for (int i = 0; i < veB.length; i++) {
            veB[i] = vectorA[i] + 2;
        }

        int[] veC = new int[10];

        for (int i = 0; i < veC.length; i++) {
            veC[i] = veA[i] + veB[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < veA.length; i++) {
            System.out.print(veA[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < veB.length; i++) {
            System.out.print(veB[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor C: ");
        for (int i = 0; i < veC.length; i++) {
            System.out.print(veC[i] + " ");
        }

        /*07
        Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
        sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois)

        B[i] := Afi) % 2.
        */
        System.out.println("\n---------- EXERCICIO 7 ----------");
        int[] vectora = new int[15];
        int[] vectorb = new int[15];

        for (int i = 0; i < vectora.length; i++) {
            vectora[i] += i;
        }

        for (int i = 0; i < vectorb.length; i++) {
            vectorb[i] = vectora[i] % 2;
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vectora.length; i++) {
            System.out.print(vectora[i] + " ");
        }

        System.out.println("-");

        System.out.print("Vetor B: ");
        for (int i = 0; i < vectorb.length; i++) {
            System.out.print(vectorb[i] + " ");
        }

        /*08
        Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva
        a soma de todos os elementos armazenados neste vetor.
         */
        System.out.println("\n---------- EXERCICIO 8 ----------");
        int[] vetoraA = new int[10];

        int soma = 0;
        for (int i = 0; i < vetoraA.length; i++){
            vetoraA[i] = i + 1;
            soma += vetoraA[i];
        }

        System.out.println("Valores do vetor: ");
        for (int i = 0; i < vetoraA.length; i++){
            System.out.print(vetoraA[i] + " ");
        }
        System.out.println("\nSOMA: " + soma);

        /*09
        Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos
        armazenados neste vetor que são múltiplos de 5.
         */
        System.out.println("\n---------- EXERCICIO 9 ----------");
        int[] vetoraaA = new int[10];

        int somar = 0;
        for (int i = 0; i < vetoraaA.length; i++){
            vetoraaA[i] = i + 10;
            if (vetoraaA[i] % 5 == 0) {
                somar += vetoraaA[i];
            }
        }
        System.out.println("Valores do vetor: ");
        for (int i = 0; i < vetoraaA.length; i++){
            if (vetoraaA[i] % 5 == 0) {
                System.out.print(vetoraaA[i] + " ");
            }
        }
        System.out.println("\nSOMA: " + somar);

        /*10
        Criar um vetor AÀ com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética
        dos elementos ímpares armazenados neste vetor.
         */
        System.out.println("\n---------- EXERCICIO 10 ----------");
        int[] vetoraaaA = new int[10];

        int somarr = 0;
        for (int i = 0; i < vetoraaaA.length; i++){
            vetoraaaA[i] = i;
            if (vetoraaaA[i] % 2 != 0) {
                somarr += vetoraaaA[i];
            }
        }

        System.out.println("Valores do vetor: ");
        for (int i = 0; i < vetoraaaA.length; i++){
            if (vetoraaaA[i] % 2 != 0) {
                System.out.print(vetoraaaA[i] + " ");
            }
        }
        System.out.println("\nSOMA: " + somarr);

        /*11
        Criar um vetor B com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos
        pares e ímpares, respectivamente, armazenados neste vetor.
         */
        System.out.println("\n---------- EXERCICIO 11 ----------");
        int[] b = new int[10];

        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            b[i] = sc.nextInt();
            sc.nextLine();
        }
        int par = 0, impar = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.printf("TOTAL PARES: %d - PORCENTAGEM: %.2f%n", par, (double) (100 * par / b.length));
        System.out.printf("TOTAL IMPAR: %d - PORCENTAGEM: %.2f%n", impar, (double) (100 * impar / b.length));

        /*12
        Criar um vetor D com 10 elementos inteiros. Escrever um programa que calcule e escreva:

        a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        b) a quantidade de elementos armazenados no vetor que são iguais a 15;
        c) a média dos elementos armazenados no vetor que são superiores a 15.
        */
        System.out.println("\n---------- EXERCICIO 12 ----------");
        int[] d = new int[10];

        for (int i = 0; i < d.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            d[i] = sc.nextInt();
            sc.nextLine();
        }

        int qtdElementos = 0, qtdElementosAcima = 0, somaElementos = 0, somaElementosAcima = 0, avgElementos;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 15){
                qtdElementos++;
            }
            if (d[i] < 15){
                somaElementos += d[i];
            } else {
                qtdElementosAcima++;
                somaElementosAcima += d[i];
            }
        }
        avgElementos = somaElementosAcima / qtdElementosAcima;

        System.out.println("\nSOMA MENORES QUE 15: " + somaElementos);
        System.out.println("NUMEROS IGUAIS A 15: " + qtdElementos);
        System.out.println("MEDIA VALORES MAIORES QUE 15: " + avgElementos);

        /*13
        Ler um vetor G com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
        Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
        */
        System.out.println("\n---------- EXERCICIO 13 ----------");
        int[] g = new int[10];

        for (int i = 0; i < g.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            g[i] = sc.nextInt();
            sc.nextLine();
        }

        int qtdMaior35 = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] > 35){
                qtdMaior35++;
            }
        }
        System.out.println("Maiores de 35: " + qtdMaior35);

        /*14
        Gerar aleatoriamente um vetor M com 10 elementos inteiros e iguais a 0 e 1

        sugestão: Mfi] = (int)Math.round(Math.random() * 1);
        Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor M.
        */
        System.out.println("\n---------- EXERCICIO 14 ----------");
        int[] m = new int[10];

        for (int i = 0; i < m.length; i++) {
            m[i] = (int) Math.round(Math.random() * 1);
        }

        int qtd0 = 0, qtd1 = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 0){
                qtd0++;
            }else {
                qtd1++;
            }
        }
        System.out.printf("TOTAL 0: %d - PORCENTAGEM: %.2f%n", qtd0, (double) (100 * qtd0 / m.length));
        System.out.printf("TOTAL 1: %d - PORCENTAGEM: %.2f%n", qtd1, (double) (100 * qtd1 / m.length));

        /*15
        Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando
        escritos da esquerda para a direita.

        Exemplo: 545; 789987; 97379; 123454321; etc.

        Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja,
        se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim
        por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
        */
        System.out.println("\n---------- EXERCICIO 15 ----------");
        int[] palindromo = new int[10];

        for (int i = 0; i < palindromo.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            palindromo[i] = sc.nextInt();
            sc.nextLine();
        }

        boolean palindromo1 = true;
        for (int i = 0; i < palindromo.length; i++) {
            if (palindromo[i] != palindromo[palindromo.length - 1 - i]){
                palindromo1 = false;
                break;
            }
        }

        for (int i = 0; i < palindromo.length; i++) {
            System.out.print(palindromo[i] + " ");
        }

        if (palindromo1){
            System.out.println("\nÉ um polindromo!");
        } else {
            System.out.println("\nNão é um polindromo!");
        }

        /*16
        Ler um vetor Z com 10 elementos e construir um vetor X de mesmo tipo e tamanho e com os mesmos elementos de A,
        sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B,
        o segundo elemento de A passa a ser o penúltimo de B e assim por diante.
        */
        System.out.println("\n---------- EXERCICIO 16 ----------");
        int[] z = new int[10];
        int[] x = new int[10];

        for (int i = 0; i < z.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            z[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < x.length; i++) {
            x[x.length - 1 - i] = z[i];
        }

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        /*17
        Ler dois vetores J e K com 10 elementos cada. Construir um vetor L, sendo este a junção dos dois outros vetores.
        Os primeiros 10 elementos de L deverão receber os elementos de J e os últimos
        elementos L deverão receber os elementos de K. Desta forma, L deverá ter o dobro de elementos de J e K
        */
        System.out.println("\n---------- EXERCICIO 17 ----------");
        int[] j = new int[5];
        int[] k = new int[5];
        int[] l = new int[10];

        for (int i = 0; i < j.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            j[i] = sc.nextInt();
            sc.nextLine();

            l[i] = j[i];
        }

        for (int i = 0; i < k.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            k[i] = sc.nextInt();
            sc.nextLine();

            l[k.length + i] = k[i];
        }

        System.out.println("VETOR J: ");
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i] + " ");
        }

        System.out.println("\n");

        System.out.println("VETOR K: ");
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }

        System.out.println("\n");

        System.out.println("VETOR L: ");
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }

        /*18
        Ler um vetor O com 20 elementos. Construir dois vetores P e Q, sendo que nos vetores P e Q serão armazenados
        os valores pares e ímpares de A, respectivamente.
        */
        System.out.println("\n---------- EXERCICIO 18 ----------");
        int[] o = new int[20];
        int[] p = new int[10];
        int[] q = new int[10];

        for (int i = 0; i < o.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            o[i] = sc.nextInt();
            sc.nextLine();
        }

        int contador = 0, contador2 = 0;
        for (int i = 0; i < o.length; i++) {
            if (o[i] % 2 == 0){
                p[contador] = o[i];
                contador++;
            }else {
                q[contador2] = o[i];
                contador2++;
            }
        }

        System.out.println("TOTAL:");
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }

        System.out.println("\n");

        System.out.println("PARES:");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }

        System.out.println("\n");

        System.out.println("IMPAR:");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");
        }

        /*19
        Criar um vetor F com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.
        */
        System.out.println("\n---------- EXERCICIO 19 ----------");
        int[] f = new int[5];

        for (int i = 0; i < f.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            f[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < f.length; i++) {
            System.out.println("\n");
            System.out.println("TABUADA DO " + f[i] + ": ");

            for (int y = 1; y <= 10; y++) {
                System.out.println(y + " * " + f[i] + " = " + (f[i] * y));
            }
        }

        /*20
        Criar um vetor H com 5 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A
        e uma mensagem indicando se o respectivo elemento é um número primo ou não.
         */
        System.out.println("\n---------- EXERCICIO 20 ----------");
        int[] h = new int[5];

        for (int i = 0; i < h.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            h[i] = sc.nextInt();
            sc.nextLine();
        }

        boolean primo;
        String msg;
        for (int i = 0; i < h.length; i++) {
            primo = true;
            for (int n = 2; n < h[i]; n++) {
                if (h[i] % n == 0){
                    primo = false;
                    break;
                }
            }

            if (primo){
                msg = " = Primo";
            } else {
                msg = " = Não primo";
            }

            System.out.println(h[i] + msg);
        }
        sc.close();
    }
}