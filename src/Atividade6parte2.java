import java.util.Scanner;

public class Atividade6parte2 {
    static void main() {   Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tam = sc.nextInt();
        int[] vetor2 = new int[tam];
        for (int e = 0; e < vetor2.length; e++) {
            System.out.println("Digite o valor da posição " + e + " Do seu vetor");
            vetor2[e] = sc.nextInt();
        }

        for (int f = 0; f < vetor2.length; f++) {
//            numero = vetor2[f];

            if (vetor2[f] % 2 == 0 ){
                System.out.println(vetor2[f] + " é par, e agora sera multiplicado por 2:");
                vetor2[f]= vetor2[f] * 2;
                System.out.println(vetor2[f]);

            }else{
                System.out.println(vetor2[f] + " é impar, e agora sera elevado ao quadrado:");
              vetor2[f] =(int)Math.pow(vetor2[f],2);
                System.out.println(vetor2[f]);
            }
        }

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Os numeros finais são: ");

        for (int i =0; i< vetor2.length;i++){
            System.out.println(vetor2[i]);
        }

//programa2
    }
}
