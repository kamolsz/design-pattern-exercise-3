package pizza;

import java.util.List;

public class MargheritaPizza extends Pizza{
    public MargheritaPizza(double cost, List<String> components) {
        super(PizzaType.MARGHERITA, cost, components);
    }
//pola i metody dla klasy bez PizzaFactory
  /*  private double cost;
    private List<String> components;

    public MargheritaPizza(double cost, List<String> components) {
        this.cost = cost;
        this.components = components;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MargheritaPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }*/
}
