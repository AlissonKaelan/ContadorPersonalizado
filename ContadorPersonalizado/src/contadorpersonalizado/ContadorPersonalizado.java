
package contadorpersonalizado;

import java.util.Scanner;

/**
 *
 * @author Alisson Kaelan
 */
public class ContadorPersonalizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        // Solicita ao usuário o número de início
        System.out.print("Digite o número de início: ");
        int inicio = teclado.nextInt();

        // Solicita ao usuário o número de fim
        System.out.print("Digite o número de fim: ");
        int fim = teclado.nextInt();

        // Solicita ao usuário a quantidade de casas a pular
        System.out.print("Digite a quantidade de casas que deseja pular: ");
        int pulo = teclado.nextInt();

        // Contador que pula a quantidade especificada
        for (int i = inicio; i <= fim; i += pulo) {
            System.out.println(i);
        }

        teclado.close();
    }
    
}
