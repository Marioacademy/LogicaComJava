import java.util.Scanner;


public class prova {
	
	public static void main(String[] args) {

	Scanner scanner= new Scanner(System.in);

	System.out.print("Digita Sua Nota ");
	
	Integer Nota= scanner.nextInt();
	
	Boolean Prova = Nota>=10; 
	
	if (Prova) {
		System.out.println("O Sr. está aprovado.");
	} else {
		System.out.println("O Sr está reprovado.");
	}
}
	

}
