package pizzas;

public class Menu{
	
	Pizza pizza = new Pizza();
	
	public void menu() {
		//Men� de la pizzer�a
		
		System.out.println("Men� \n*Pizza Chicago: Queso, carne especial, jalape�o\n"
				+ "*Pizza Hawaii: Queso, pi�a, carne\n "
				+ "*Pizza Mexicana: Queso, carne, cebolla\n"
				+ "*Pizza clasica: Queso, cane,  peperoni ");
		
	}
	
	public String estado(String pedido) {
		
		//Se muestra en pantalla el estado del pedido solicitado
		System.out.println("Estado: En pedido  ");
		//Este delay marca el tiempo que debe tardar para mostrar el siguiente mensaje
		delay(1000);
		System.out.println("Estado: En armado  ");
		
		//Condici�n para mostrar los ingredientes dependiendo de la pizza
		
		if(pedido.equalsIgnoreCase("hawaii")) 
		{
			
			System.out.println(" Queso \n Pi�a \n Carne \n");
			
		}else if(pedido.equalsIgnoreCase("chicago")) 
		{
			
			System.out.println(" Queso \n Carne especial \n");
			
		}else if(pedido.equalsIgnoreCase("Mexicana")) 
		{
			
			System.out.println(" Queso \n Carne \n Cebolla"  );
			
		}else if(pedido.equalsIgnoreCase("clasica"))
		{
			
			System.out.println(" Queso \n Carne \n Peperoni"  );
		}
		
		delay(1000);
		System.out.println("Estado: En horno  ");
		delay(1000);
		System.out.println("Estado: En empacado  ");
		delay(1000);
		System.out.println("Estado: Entregado al cliente  ");
		delay(1000);
		return pedido;
	}
	
	//Metodo para hacer funcionar el delay

	private void delay(long milis)
	{
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
