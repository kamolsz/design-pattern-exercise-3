package pizza;

import java.util.List;

public abstract class Pizza {

    private PizzaType pizzaType;
    private double cost;
    private List<String> components;

    public Pizza(PizzaType pizzaType, double cost, List<String> components) {
        this.pizzaType = pizzaType;
        this.cost = cost;
        this.components = components;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public double getCost() {
        return cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }
    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", cost=" + cost +
                ", components=" + components +
                '}';
    }
}
