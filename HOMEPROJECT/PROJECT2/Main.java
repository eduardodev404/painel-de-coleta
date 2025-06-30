
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;
        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(a):");
        nome = teclado.nextLine();
        System.out.println("Digite a 1 nota do aluno(a) " + nome);
        nota1 = teclado.nextDouble();
        System.out.println("Digite a 1 nota do aluno(a) " + nome);
        nota2 = teclado.nextDouble();
        System.out.println("Digite a 1 nota do aluno(a) " + nome);
        nota3 = teclado.nextDouble();

        // processamento de dados

        media = (nota1 + nota2 + nota3) / 3 ;

        // saída de dados

        System.out.println("Nome: " + nome + "\nMédia:" + media);

        if( media >= 7) {
            System.out.println(nome + " Aprovado(a)");
        
        } else {
            System.out.println(nome + " Reprovado(a)");
        }

        teclado.close();
 
    }

    
}
