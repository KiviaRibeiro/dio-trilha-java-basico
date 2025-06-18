import java.util.Scanner;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? : ");
		
		int age = scanner.nextInt();
		
		boolean canDrive = age > 17;
		
		System.out.printf("Você pode dirigir? (%s) \n", canDrive);
		
		
		
		
	}

}
