import java.util.Scanner;

public class Comissao {

    public static void main(String[] args){

        String nome;
        double salariofixo, totalvendas, comissao, salariototal;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println(" Qual o valor do salario fixo: R$ ");
        salariofixo = leia.nextDouble();

        System.out.println(" Qual o valor total de vendas no mes: R$");
        totalvendas = leia.nextDouble();

        comissao = totalvendas * 0.15;
        salariototal = salariofixo + comissao;

        System.out.println(" Funcionario: " + nome);
        System.out.println(" Salario Fixo: R$ " + salariofixo);
        System.out.println(" Salario Final (com comissão): R$ " + salariototal);







    }
}
