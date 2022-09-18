
package MediaNotas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float media = 0.0f;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media e: " + media);
        media = leitor.nextFloat();
    }
}
