package repeticaoAreaDaCasa;

import java.util.Scanner;

public class RepeticaoAreaDaCasa {

	public static void main(String[] args) {
	
		
		// s � diferente de S, o mesmo serve para o n
		// estrutura de compara��o = "respostas.equals("")" e n�o "=="
		
		
		 double area,largura,comprimento,areaTotal=0; //contador de area= areaTotal
		 String comodo, resposta="sim";
		 
		 Scanner teclado= new Scanner(System.in); //fora do while
		 
		 while(resposta.equals("sim")) {
								
			System.out.println("Qual o c�modo?  "); 
			comodo=teclado.next(); 
			System.out.println("Qual a largura? "); 
			largura=teclado.nextDouble();
			System.out.println("Qual comprimento? "); 
			comprimento=teclado.nextDouble();
			
			area=largura*comprimento; //n�o d� para com essa sintaxe na declara��o de variavel 
			System.out.println("A �rea do c�modo �: "+ area); 
			
			System.out.println("************************************************************************************* ");	
			System.out.println("Deseja calcular mais c�modos? Se SIM, digite sim ou se N�O, digite nao. "); //sim ou n�o
			resposta=teclado.next();
					
			areaTotal=areaTotal+area;
												
		}
		
			teclado.close(); //fora do while
			System.out.println("A �rea total da casa �: "+ areaTotal);
					
		

	}

}
