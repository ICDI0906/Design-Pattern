package factory_method;

public class test {
	public static void main(String args[]) {
	Store store = new PizzaStore();
	Pizza pizza = store.orderPizza("muscle");
	System.out.println(pizza.getPizza());
}
}
