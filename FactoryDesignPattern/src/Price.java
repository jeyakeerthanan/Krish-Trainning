import java.util.ArrayList;
import java.util.List;

public abstract class Price {

    protected List<Toppings> topping=new ArrayList<>();

    public Price(){
        createPrice();
    }

    protected  abstract void createPrice();

    @Override
    public String toString() {
        return "Price (" + "toppings {" + topping +"}";
    }
}
