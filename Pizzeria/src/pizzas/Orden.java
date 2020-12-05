package pizzas;

import java.util.Scanner;

public class Orden {
	Menu menu= new Menu();
	Scanner teclado = new Scanner(System.in);
	int numero;
	String tipoPizza, res;
	
	
	
	public void bienvenida() {
		//Opciones iniciales
		System.out.println("Buen día a la pizzería 'La gran pizza' \n ¿Desea realizar?(Por favor indicar el número de la acción)"
				+ " \n 1.- Ordenar una pizza \n 2.-Ver el menú ");
		
		 numero= teclado.nextInt();
		 teclado.nextLine();//se limpia buffer de entrada
		 
		 //condición para saber que opción se ha elegido
		 if(numero== 1) {
			 
			 do {
				 
				 System.out.println("¿Que desea ordenar? (Ingresar el nombre de la pizza)");
				 tipoPizza= teclado.nextLine();
				 
				 //Condición para saber si se ha ingresado el nombre correcto de la pizza
				 if(tipoPizza.equalsIgnoreCase("chicago") || 
						 tipoPizza.equalsIgnoreCase("hawaii") ||
						 tipoPizza.equalsIgnoreCase("mexicana") ||
						 tipoPizza.equalsIgnoreCase("clasica")) 
				 {
					 //Se manda a llamar el metodo estado de la clase menu, recibiendo como parametro el nombre de la pizza
					 menu.estado(tipoPizza);
					 System.out.println("¿Desea ordenar otra vez?");
					 res= teclado.nextLine();
					 
				 }else {
					 //Si el usuario ingresa mal el nombre de la pizza se mostrará una alerta
					 System.out.println("No contamos con esa pizza en el menú, revise su orden por favor \n");
					 res= "si";
				 }
				 
				 //ciclo para repetir la orden si se quiere hacer otra
			 }while(res.equalsIgnoreCase("si"));
			 
			 System.out.println("Gracias por comer aquí, vuelva pronto");
			 
			 
		 }else if(numero== 2) {
			 //En la opción número 2 se muestra el menú
			 menu.menu();
		 }
		
	}
	
	

}
