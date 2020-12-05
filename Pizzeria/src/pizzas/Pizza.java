package pizzas;

import java.util.ArrayList;

public class Pizza {
	private static String nombrePizza;
	private static String ingrediente1;
	private static String ingrediente2;
	private static String ingrediente3;
	private static int CantidadPizza;
	
	
	static ArrayList<String> ArrayPizza = new ArrayList();
	static ArrayList<String> ArrayIngrediente1 = new ArrayList();
	static ArrayList<String> ArrayIngrediente2 = new ArrayList();
	static ArrayList<String> ArrayIngrediente3 = new ArrayList();
	
	
	Pizza(){
		nombrePizza=" ";
		ingrediente1= " ";
		ingrediente2= " ";
		ingrediente3= " ";
	}
	
	
	protected static void setNombrePizza(String nomPizza) {
		nombrePizza= nomPizza;
		ArrayPizza.add(nomPizza);
	}
	
	
	protected static void setIngrediente1(String ing1) {
		ingrediente1= ing1;
		ArrayIngrediente1.add( ingrediente1);
	}
	
	protected static void setIngrediente2(String ing2) {
		ingrediente2= ing2;
		ArrayIngrediente2.add( ingrediente2);
	}
	
	protected static void setIngrediente3(String ing3) {
		ingrediente3= ing3;
		ArrayIngrediente3.add( ingrediente3);
	}
	
	String getIngrediente1() {
		return ingrediente1;
		
	}
	
	String getIngrediente2() {
		return ingrediente2;
		
	}
	
	String getIngrediente3() {
		return ingrediente3;
		
	}
	
	String getNombrePizza() {
		return nombrePizza;
		
	}
	
	

}
