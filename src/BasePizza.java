interface Pizza {
    String getDescription();
    double getPrice();
}

class BasePizza implements Pizza {

    protected String description;
    protected double price;

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }
}

class ToppingDecorator extends BasePizza {

    private BasePizza pizza;
    protected String description;
    protected double price;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return this.pizza.getDescription() + " with " + this.description;
    }

    public double getPrice() {
        return this.pizza.getPrice() + this.price;
    }
}

class CheesePizza extends BasePizza {
    
    public CheesePizza(){
        this.price = 10.99;
        this.description = "Cheese Pizza";
    }
}

class PepperoniPizza extends BasePizza {

    public PepperoniPizza(){
        this.price = 12.99;
        this.description = "Pepperoni Pizza";
    }
}

class ChickenPizza extends BasePizza {

    public ChickenPizza(){
        this.price = 11.99;
        this.description = "Chicken Pizza";
    }
}

class OliveToppings extends ToppingDecorator {

    public OliveToppings(BasePizza pizza) {
        super(pizza);
        this.price = 0.99;
        this.description = "Olives";
    }
}

class MushroomToppings extends ToppingDecorator {

    public MushroomToppings(BasePizza pizza) {
        super(pizza);
        this.price = 0.99;
        this.description = "Mushrooms";
    }
}

class PepperToppings extends ToppingDecorator {

    public PepperToppings(BasePizza pizza) {
        super(pizza);
        this.price = 0.99;
        this.description = "Peppers";
    }
}