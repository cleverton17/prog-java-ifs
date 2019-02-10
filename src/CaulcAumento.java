import java.util.Scanner;


public class CaulcAumento {

	public static void main(String[] args) {
	// Criação de variaveis
		float valorProd;
		float porcentAumento;
		float ValAumentReal;
		float valAumentPorcent;
		float valFinalProd;
	// Criação de objeto da classe Scanner
		Scanner scan = new Scanner(System.in);
	// Solicitando dados ao usuario
		System.out.println("digite o valor do produto");	
		valorProd = scan.nextFloat();
		System.out.println("qual porcentagem de aumento?");
		porcentAumento = scan.nextFloat();
	// Cauculando novo valor de aumento e valor final do produto
        valAumentPorcent = porcentAumento / 100 ;
        ValAumentReal = valAumentPorcent *  valorProd;
        valFinalProd = valorProd + ValAumentReal;
    //Exibindo resultados 
        System.out.printf("O valor final do produto foi, %.2f\n", valFinalProd);
        System.out.printf("Esse produto teve um aumento de %.2f %% " ,porcentAumento);
        System.out.printf("Valor do aumento em reais, %.2f R$", ValAumentReal);
        
        
		
		
		
		
		

	}

}
