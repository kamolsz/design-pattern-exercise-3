package pizza;

import java.util.List;

public class PizzaFactory {

    public Pizza createPizza(PizzaType pizzaType, double cost, List<String> components) {

        if (PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(cost, components);
        }
        if (PizzaType.HAWAI.equals(pizzaType)) {
            return new HawaiPizza(cost, components);
        }
        if (PizzaType.MARGHERITA.equals(pizzaType)) {
            return new MargheritaPizza(cost, components);
        }
        if (PizzaType.VEGE.equals(pizzaType)) {
            return new VegePizza(cost, components);
        }
        throw new IllegalArgumentException("Wrong Pizza Type");

    }
}
