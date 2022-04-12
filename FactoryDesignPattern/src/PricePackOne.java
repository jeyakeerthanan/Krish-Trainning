public class PricePackOne extends Price {

    @Override
    protected void createPrice() {
        topping.add(new Bacon());
        topping.add(new Chicken());
    }
}
