//Question2

public class Product implements Taxable {
    private int pid;
    private int price;
    private int quantity;

    public Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public double calcTax() {
        return (double) Math.round(price*salesTax * 100) /100;
    }
}
