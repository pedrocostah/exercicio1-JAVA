import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        //Criar o objeto para ler os dados do usuário
        Scanner leitor = new Scanner(System.in);

        //Ler as notas dos 3 cps
        System.out.println("Digite a nota da cp1");
        aluno.cp1 = leitor.nextFloat();

        System.out.println("Digite a nota da cp2");
        aluno.cp2 = leitor.nextFloat();

        System.out.println("Digite a nota da cp3");
        aluno.cp3 = leitor.nextFloat();

        //Ler a nota do challenge
        System.out.println("Digite a nota do challenge");
        aluno.challenge = leitor.nextFloat();

        //Ler a nota da global solution
        System.out.println("Digite a nota da GS");
        aluno.gs = leitor.nextFloat();

        //Ler o nome do aluno
        System.out.println("Digite o nome do aluno");
        aluno.nome = leitor.next() + leitor.nextLine(); //Para receber um texto mais de uma palavra

        //Calcular a média do semestre (média aritmética das cps) somar os 3 cps e dividir por 3

        float mediaCp = (float) aluno.calcularMediaCp();
        float mediaSemestral = (float) aluno.calcularMediaSemestral();
        System.out.println("O nome do aluno é " + aluno.nome);
        System.out.println("A média do CP de Pedro é " + mediaCp + " e a média total semestral de Pedro é " + mediaSemestral);
        System.out.printf("Média CP do aluno: %.2f", mediaCp);
        System.out.printf("A média do semestre é: %.2f", mediaSemestral);

    }
}