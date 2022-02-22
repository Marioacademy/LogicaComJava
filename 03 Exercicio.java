import java.util.Scanner;

public class TestedeIgualdade {
	
		public static void main (String[] args) {
			Scanner scanner= new Scanner(System.in);
			
		System.out.print("Digite o Primeiro Valor: ");
					Integer Primeiro = scanner.nextInt();
					
		System.out.print("Digite o Segundo Valor: ");
			Integer Segundo = scanner.nextInt();
			
			
					
		    boolean Igualdade = Primeiro == Segundo;
				
				if (Igualdade) {
					System.out.println("Primeiro Valor: "+ Primeiro);
					System.out.println("Segundo Valor: "+ Segundo);
					System.out.println("Os Resultados São Iguais");
				} else {
					
					System.out.println("Primeiro Valor: "+ Primeiro);
					System.out.println("Segundo Valor: "+ Segundo);
					System.out.println("Os Resultados Não São Iguais");
				}
				
				scanner.close();
			}
		}


		     
		     
