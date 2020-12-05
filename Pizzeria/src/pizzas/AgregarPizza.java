package pizzas;

public class AgregarPizza extends Pizza{
	
	private String nombrePizza;
	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	
	//Metodo para que manda los datos de la pizza a los Arrays
	
	public void Agregar(String nom, String ingre1, String ingre2, String ingre3){
		nombrePizza= nom;
		ingrediente1= ingre1;
		ingrediente2= ingre2;
		ingrediente3= ingre3;
		
		Pizza.setNombrePizza(nombrePizza);
		Pizza.setIngrediente1(ingrediente1);
		Pizza.setIngrediente2(ingrediente2);
		Pizza.setIngrediente3(ingrediente3);
		
	}
	
	//metodos para agregar las pizzas exisentes con sus ingredientes
	
	public void PizzaChicago() {
		Agregar("Chicago", "Queso", "Carne especial", "Jalapeño");
	}
	
	public void PizzaHawaii() {
		Agregar("Hawaii", "Queso", "Piña", "Cereza");
	}
	
	public void PizzaMexicana() {
		Agregar("Mexicana", "Queso", "Chile", "Cebolla");
	}
	
	public void PizzaClasica() {
		Agregar("Clasica", "Queso", "Elote", "Peperoni");
	}
	
	

}
