public class CheeseDec extends BaseDecorator {
    double newprice;
    public CheeseDec(PlainPizza pizza) {
        super(pizza);
        this.newprice = pizza.getPrice() + 2;
        pizza.price = this.newprice;
    }
}
