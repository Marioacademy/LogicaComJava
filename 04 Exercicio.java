 import java.util.Scanner;
 
public class DataNascimento {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Digite Seu Nome: ");
		String Nome = scanner.next();
		
		
		System.out.print("Data de Nascimento: ");
		Integer Data = scanner.nextInt();
		
		
		Integer Ano = 2022;
		
		Integer  Resultado = Ano - Data ;
		
		System.out.println(" Nome: "+ Nome);
		System.out.println(" A Sua Idade é "+ Resultado);
		
		
		scanner.close();
		
		