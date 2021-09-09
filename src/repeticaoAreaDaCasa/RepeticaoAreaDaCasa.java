package repeticaoAreaDaCasa;

import java.util.Scanner;

public class RepeticaoAreaDaCasa {

	public static void main(String[] args) {
	
		
		// s é diferente de S, o mesmo serve para o n
		// estrutura de comparação = "respostas.equals("")" e não "=="
		
		
		 double area,largura,comprimento,areaTotal=0; //contador de area= areaTotal
		 String comodo, resposta="sim";
		 
		 Scanner teclado= new Scanner(System.in); //fora do while
		 
		 while(resposta.equals("sim")) {
								
			System.out.println("Qual o cômodo?  "); 
			comodo=teclado.next(); 
			System.out.println("Qual a largura? "); 
			largura=teclado.nextDouble();
			System.out.println("Qual comprimento? "); 
			comprimento=teclado.nextDouble();
			
			area=largura*comprimento; //não dá para com essa sintaxe na declaração de variavel 
			System.out.println("A área do cômodo é: "+ area); 
			
			System.out.println("************************************************************************************* ");	
			System.out.println("Deseja calcular mais cômodos? Se SIM, digite sim ou se NÃO, digite nao. "); //sim ou não
			resposta=teclado.next();
					
			areaTotal=areaTotal+area;
												
		}
		
			teclado.close(); //fora do while
			System.out.println("A área total da casa é: "+ areaTotal);
					
		

	}

}
