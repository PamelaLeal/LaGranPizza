package pizzas;

public class Menu{
	
	public void menu() {
		System.out.println("Menú \n *Pizza Chicago: Queso, carne especial\n"
				+ "*Pizza Hawaii: Queso, piña, carne\n "
				+ "*Pizza Mexicana: Queso, carne, cebolla\n"
				+ "*Pizza clasica: Queso, cane,  peperoni ");
		
	}
	
	public String estado(String pedido) {
		
		System.out.println("Estado: En pedido  ");
		delay(1000);
		System.out.println("Estado: En armado  ");
		
		if(pedido.equalsIgnoreCase("hawaii")) 
		{
			
			System.out.println(" Queso \n Piña \n Carne \n");
			
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

	private void delay(long milis)
	{
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
