import java.util.Scanner;

public class CalcularValorTroco {
	
public static void main(String[] args) {
		
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Digite o Valor do Cliente: ");
	
	Double ValorDoCliente = scanner.nextDouble();
	
	System.out.print("Digite Quantidade da Unidade  " );
	Double QuantidadeUnidade= scanner.nextDouble();
	
	Double ValorProduto= (double) 150 ;
	
	Double resultado= ValorProduto * QuantidadeUnidade ; 
	
	Double Troco=  ValorDoCliente - resultado;
	
	
	
	System.out.println("Pago Pelo Cliente "    + ValorDoCliente);
	System.out.println("Valor do Producto  "   +  ValorProduto);
	System.out.println("Quantidade de Unidade " + QuantidadeUnidade);
	System.out.println("Total da Compra " + resultado);
	System.out.println("Troco  " + Troco+"$");
	scanner.close();
	
	
		
	}
}
