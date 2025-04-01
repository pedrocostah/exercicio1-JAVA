import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar o objeto para ler os dados do usuário
        Scanner leitor = new Scanner(System.in);

        //Ler as notas dos 3 cps
        System.out.println("Digite a nota da cp1");
        float cp1 = leitor.nextFloat();

        System.out.println("Digite a nota da cp2");
        float cp2 = leitor.nextFloat();

        System.out.println("Digite a nota da cp3");
        float cp3 = leitor.nextFloat();

        //Ler a nota do challenge
        System.out.println("Digite a nota do challenge");
        float challenge = leitor.nextFloat();

        //Ler a nota da global solution
        System.out.println("Digite a nota da GS");
        float gs = leitor.nextFloat();

        //Ler o nome do aluno
        System.out.println("Digite o nome do aluno");
        String nome = leitor.next() + leitor.nextLine(); //Para receber um texto mais de uma palavra

        Aluno aluno = new Aluno();

        aluno.cp1 = cp1;
        aluno.cp2 = cp2;
        aluno.cp3 = cp3;
        aluno.challenge = challenge;
        aluno.gs = gs;
        aluno.nome = nome;

        //Calcular a média do semestre (média aritmética das cps) somar os 3 cps e dividir por 3

        float caneta = (float) aluno.mediaTotal();
        System.out.println("O nome do aluno é " + aluno.nome);
        System.out.println("A média total de Pedro é " + caneta);

    }
}