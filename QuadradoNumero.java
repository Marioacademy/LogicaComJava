
import java.util.Scanner;

public class Exercicios {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("informe um n�mero ");
		Integer numero = scanner.nextInt();
		
		Integer quadrado= numero* numero;
		
		System.out.println("O quadrado de  " + numero + " � " + quadrado + ".");
	

	
	scanner.close();
		}
	}