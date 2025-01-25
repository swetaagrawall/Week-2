package encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product{
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public void calculateDiscount(double discount) {
        setDicount(discount);
        setFinalPrice(getFinalPrice()-(getFinalPrice()*discount)/100);
    }
    public void display(){
        super.display();
        System.out.println("Discount : "+getDicount()+"% \nTax : "+getTax()+"% \nFinal Price : "+getFinalPrice());
    }
}
