public class Main {

    public static void main(String[] args) {
        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        OliveToppings oliveToppings = new OliveToppings(pepperoniPizza);
        printPizza(oliveToppings);
        CheesePizza cheesePizza = new CheesePizza();
        PepperToppings pepperToppings = new PepperToppings(cheesePizza);
        printPizza(pepperToppings);
        ChickenPizza chickenPizza = new ChickenPizza();
        MushroomToppings mushroomToppings = new MushroomToppings(chickenPizza);
        printPizza(mushroomToppings);
    }

    private static void printPizza(BasePizza pizza){
        System.out.println(pizza.getDescription() + " costs $" + pizza.getPrice());
        System.out.println();
    }
}