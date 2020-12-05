package pizzas;

public class Pizza {
	private String nombrePizza;
	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	
	Pizza(){
		nombrePizza=" ";
		ingrediente1= " ";
		ingrediente2= " ";
		ingrediente3= " ";
	}
	
	private void setNombrePizza(String nomPizza) {
		nombrePizza= nomPizza;
	}
	
	
	private void setIgrediente1(String ing1) {
		ingrediente1= ing1;
	}
	
	private void setIgrediente2(String ing2) {
		ingrediente2= ing2;
	}
	
	private void setIgrediente3(String ing3) {
		ingrediente3= ing3;
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
