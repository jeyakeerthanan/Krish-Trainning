public class PriceFactory {

    public static Price createPricePack(Pack pack){
        switch (pack){
            case Basic:
                return new PricePackOne();
            case HalfToppings:
                return new PricePackTwo();
            case FullToppings:
                return new PricePackThree();
            default:
                return null;

        }
    }
}
