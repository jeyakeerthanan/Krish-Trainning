public class PricePackThree extends Price {


    @Override
    protected void createPrice() {
        topping.add(new Bacon());
        topping.add(new Chicken());
        topping.add(new Beef());
        topping.add(new Sausage());
    }
}
