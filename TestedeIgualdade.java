import java.util.Scanner;

public class TestedeIgualdade {
	
		public static void main (String[] args) {
			Scanner scanner= new Scanner(System.in);
			
		System.out.print("Digite o Primeiro Valor: ");
			Double Primeiro= scanner.nextDouble();
		System.out.print("Digite o Segundo Valor: ");
			Double Segundo= scanner.nextDouble();
		
			
		
			Boolean Resultado = Primeiro != Segundo;
			
			
		     if (Resultado= true) {
			
			System.out.println("Os Valores " + Primeiro +" e "+ Segundo+ " s�o iguais");
			
		     }
			else {
				
		    System.out.println("Os Valores " + Primeiro +" e "+ Segundo+ " n�o s�o iguais");
			    }
				
				scanner.close();
		
	}
				
}	


