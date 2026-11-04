import java.util.Scanner;

public class Atividade6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu vetor:");
        int[] vetor = new int[sc.nextInt()];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o valor da posição " + i + " do seu vetor:");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {

                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }


            }
        }
        exibirVariavelCrescente(vetor);

        System.out.println("Digite uma palavra para ter as vogais contadas:");
        String palavra1 = sc.next().toLowerCase();
        char[] letras2 = palavra1.toCharArray();

        int contador = 0;
        for (int d = 0; d < palavra1.length(); d++) {
            if ("aeiouáàâãéêíóôõú".indexOf(letras2[d]) != -1) {
                contador++;
            }

        }
        System.out.println("Está palavra tem " + contador + " Vogais!");

//vogais contadas


    }

    public static void exibirVariavelCrescente(int[] variavel) {
        for (int i = 0; i < variavel.length; i++) {
            System.out.println(variavel[i]);
        }
    }
    //programa1
}











