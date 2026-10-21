public class PineappleDec extends BaseDecorator {
    double newprice;
    public PineappleDec(PlainPizza pizza) {
        super(pizza);
        this.newprice = (double)pizza.getPrice()+1.5;
        pizza.price = newprice;
    }
}
