 import java.util.Scanner;
 
public class Diferenca {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Digite um Valor: ");
        Integer NumeroUm =scanner.nextInt();
        
        System.out.print("Digite o Segundo Valor: ");
        Integer NumeroDois =scanner.nextInt();
        
        
        
        Boolean resultado= NumeroUm != NumeroDois;
        
        if (resultado) {
        	
        	System.out.println("Os números são Diferentes");
        	      	
        }
        
        else {
        	System.out.println("Os números são iguais");
        }
        
        
				
		scanner.close();
		
	}
	}
		
		