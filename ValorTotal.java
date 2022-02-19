import java.util.*;

public class ValorTotal {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("Digite o valor do producto: ");
		Integer ValorDoProduto= scanner.nextInt();
		
		System.out.print("Digite a Quantidade do Producto: ");
		Integer QuantidadeDoProducto= scanner.nextInt();
		
		
		Integer SubTotal= ValorDoProduto * QuantidadeDoProducto;
		Integer Desconto=  (SubTotal*10)/100;
		Integer Total= SubTotal-Desconto;
		
		if (SubTotal >=100) {
			
			System.out.println(" O SubTotal da Conta : " + SubTotal);
			System.out.println("O Sr Tem um Desconto de 10%");
			System.out.println("Total a Pagar: "+ Total);
		}
		
		else {
			
			System.out.println(" O SubTotal da Conta : " + SubTotal);
			System.out.println("O Sr Não tem desconto%");
			System.out.println("Total a Pagar: "+ SubTotal);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
