public class PricePackTwo extends Price {
    @Override
    protected void createPrice() {
        topping.add(new Bacon());
        topping.add(new Chicken());
        topping.add(new Beef());

    }
}
