package pizza;

import java.util.List;

public class VegePizza extends Pizza {
    public VegePizza(double cost, List<String> components) {
        super(PizzaType.VEGE, cost, components);
    }
}
