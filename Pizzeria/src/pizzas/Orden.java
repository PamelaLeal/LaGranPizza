package pizzas;

import java.util.Scanner;

public class Orden {
	Menu menu= new Menu();
	Scanner teclado = new Scanner(System.in);
	int numero;
	String tipoPizza, res;
	
	
	
	public void bienvenida() {
		System.out.println("Buen d�a a la pizzer�a 'La gran pizza' \n �Desea realizar?(Por favor indicar el n�mero de la acci�n)"
				+ " \n 1.- Ordenar una pizza \n 2.-Ver el men� ");
		
		 numero= teclado.nextInt();
		 teclado.nextLine();//Limpiamos buffer de entrada
		 
		 if(numero== 1) {
			 
			 do {
				 
				 System.out.println("�Que desea ordenar? (Ingresar el nombre de la pizza)");
				 tipoPizza= teclado.nextLine();
				 
				 if(tipoPizza.equalsIgnoreCase("chicago") || 
						 tipoPizza.equalsIgnoreCase("hawaii") ||
						 tipoPizza.equalsIgnoreCase("mexicana") ||
						 tipoPizza.equalsIgnoreCase("clasica")) 
				 {
					 
					 menu.estado(tipoPizza);
					 System.out.println("�Desea ordenar otra vez?");
					 res= teclado.nextLine();
					 
				 }else {
					 System.out.println("No contamos con esa pizza en el men�, revise su orden por favor");
					 res= "si";
				 }
				 
			 }while(res.equalsIgnoreCase("si"));
			 
			 System.out.println("Gracias por comer aqu�, vuelva pronto");
			 
			 
		 }else if(numero== 2) {
			 menu.menu();
		 }
		
	}
	
	

}
