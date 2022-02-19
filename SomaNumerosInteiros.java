import java.util.Scanner;


public class SomaNumerosInteiros {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		Integer Valor1= null;
		Integer Valor2= null;
		
		System.out.println("Seja bem Vindo");
		System.out.print("Digite o Primeiro Valor: ");
		Double  PrimeiroValor = scanner.nextDouble();
		
		System.out.print("Digite o Segundo Valor: ");
		Double SegundoValor= scanner.nextDouble();
		
		Double Soma = PrimeiroValor + SegundoValor;
		Double Subtracao = PrimeiroValor - SegundoValor;
		Double Multiplicacao = PrimeiroValor * SegundoValor;
		Double Divisão = PrimeiroValor / SegundoValor;
		
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::RESULTADOS:::::::::::::");
		System.out.println("Resultado da Soma: "+ Soma);
		System.out.println("Resultado da Subtração: "+ Subtracao);
		System.out.println("Resultado da Multiplicação: "+ Multiplicacao);
		System.out.println("Resultado da Divisão: "+ Divisão);
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::FIM:::::::::::::::::");
		
		
		
		scanner.close();
		
	}

}
