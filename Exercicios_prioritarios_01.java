import java.util.Arrays;
import java.util.Scanner;
public class Exercicios_prioritarios_01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
            int n = 3;
            int v[] = new int[n];
            int i;

            for (i=0; i<n; i++) {
                System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
                v[i] = leia.nextInt();
            }

            Arrays.sort(v);
            int ultimo = v[v.length -1];

            System.out.println("O Maior número digitado foi: " + ultimo);
            System.out.println("A ordem crescente é: " + Arrays.toString(v));

        }
    }

