public class OlivesDec extends BaseDecorator {
    double newprice;
    public OlivesDec(PlainPizza pizza) {
        super(pizza);
        this.newprice = pizza.getPrice()+1;
        pizza.price = this.newprice;
    }
}
