import java.util.Arrays;
import java.util.Scanner;

public class Atividade6parte3 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma plavra para ser invertida:");
        String palavra = sc.next();
        char[] letras = palavra.toCharArray();
        int ultimaLetra = (letras.length)-1;
        for (int i = 0; i < ultimaLetra; i++) {
            {

                char far = letras[i];
                letras[i] = letras[ultimaLetra];
                letras[ultimaLetra] = far;
                ultimaLetra--;
            }

        }
        System.out.println(letras);
//invertido
        //programa3
    }
}
