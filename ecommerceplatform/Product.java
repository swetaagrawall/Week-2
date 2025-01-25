package encapsulationandpolymorphism.ecommerceplatform;

abstract class Product implements Taxable{
    private int productId;
    private String name;
    private double price;
    private double dicount;
    private double tax;
    private double finalPrice;

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        finalPrice=price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0) this.price = price;
        else System.out.println("Assign correct amount");
    }

    public double getDicount() {
        return dicount;
    }

    public void setDicount(double dicount) {
        this.dicount = dicount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


    @Override
    public void calculateTax(double tax) {
        setTax(tax);
        finalPrice=finalPrice+(finalPrice*tax)/100;
    }

    @Override
    public double getTaxDetails() {
           return tax;
    }

    public abstract void calculateDiscount(double discount);

    public void display(){
        System.out.println("Name : "+name+"\nId : "+productId+"\nPrice : "+price);


    }
}
