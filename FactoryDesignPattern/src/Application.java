public class Application {

    public static void main (String[] args){

        Price price =  PriceFactory.createPricePack(Pack.Basic);
        System.out.println(price);
        Price price_2 =  PriceFactory.createPricePack(Pack.FullToppings);
        System.out.println(price_2);

        
    }
}
 