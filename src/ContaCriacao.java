import java.util.Scanner;

public class ContaCriacao {
  ContaModel contaModel = new ContaModel();

  Scanner ler = new Scanner(System.in);

  public void iniciar() {
    System.out.println("Bem vindo ao banco");

    System.out.print("Digite seu nome: ");
    contaModel.setNome(ler.next());

    System.out.print("Digite sua agencia: ");
    contaModel.setAgencia(ler.next());

    System.out.print("Digite sua conta: ");
    contaModel.setConta(ler.nextInt());

    System.out.print("Digite seu saldo: ");
    contaModel.setSaldo(ler.nextFloat());

    System.out.println("SUA CONTA ESTÁ CRIADA");
    System.out.println("SUAS INFORMAÇÕES SÃO: ");

    System.out.println("Nome: " + contaModel.getNome());
    System.out.println("Agencia: " + contaModel.getAgencia());
    System.out.println("Conta: " + contaModel.getConta());
    System.out.println("Saldo: R$" + contaModel.getSaldo());
  }
}
