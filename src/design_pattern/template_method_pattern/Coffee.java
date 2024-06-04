package design_pattern.template_method_pattern;

public abstract class Coffee {
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    protected abstract void boilWater();
    protected abstract void brewCoffeeGrinds();
    protected abstract void pourInCup();
    protected abstract void addCondiments();
}