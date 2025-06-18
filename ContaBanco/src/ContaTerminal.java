import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
//		int numero = 1021;
//		String agencia = "067-8";
//		String nomeCliente = "Mario Andrade";
//		double saldo = 237.38;
		
		var  entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número do Banco: ");
		
		int numeroBanco = entrada.nextInt();
		
		System.out.println("Por favor, digite o número da Agência: ");
		
		String agencia = entrada.next();
		
		System.out.println("Por favor, digite seu nome: ");
		
		String nomeCliente = entrada.next();

		System.out.println("Por favor, digite seu saldo: ");
		
		double saldo = entrada.nextDouble();
		
        	System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",nomeCliente,agencia,numeroBanco,saldo);
                entrada.close();
		
		
		
		
		
		
	}
}
