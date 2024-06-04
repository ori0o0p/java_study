package design_pattern.template_method_pattern;

public class Cappuccino extends Coffee {

    @Override
    protected void boilWater() {
        System.out.println("끓는 물 준비");
    }

    @Override
    protected void brewCoffeeGrinds() {
        System.out.println("카푸치노를 위해 커피를 간다.");
    }

    @Override
    protected void pourInCup() {
        System.out.println("커피를 컵에 넣는다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("카푸치노에 거품을 추가한다.");
    }

}