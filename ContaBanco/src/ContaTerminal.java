import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o seu nome, por favor");
		String nomeCliente = teclado.nextLine();
		
		System.out.println("Por favor, digite o número da Agência !");
		int numeroAgencia = teclado.nextInt();
		
		System.out.println("Por favor, digite o número da Conta !");
		int numeroConta = teclado.nextInt();
		
		System.out.println("Por favor, digite o seu saldo !");
		double saldoCliente = teclado.nextDouble();
		
		System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ","
				+ "conta " + numeroConta + " e seu saldo " + saldoCliente + " está disponível para saque.");
		
		
		teclado.close();
	}

}
