import java.util.ArrayList;

class Customer{
    private String name;
    private ArrayList<Product> products;
    private double billAmount;
    public Customer(String name){
        this.name=name;
        products=new ArrayList<>();
        System.out.println("Customer "+name+" created!");
    }
    public String getName(){
        return name;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    public void addProduct(String name,int quantity,double price){
        products.add(new Product(name,quantity,price));
        System.out.println("Product "+name+" added"); //composition
    }
    public void generateBill(){
        BillGenerator bill=new BillGenerator();
        billAmount=bill.computeBill(this);
    }
    public void showDetails(){
        System.out.println("Customer name is "+name);
        System.out.println("Products details : ");
        for(Product product : products){
            System.out.println("Product name : "+product.getName()+", quantity : "+product.getQuantity()+", price : "+product.getPrice());
        }
        System.out.println("Total amount to be paid : "+billAmount);
    }

}
class Product{
    private String name;
    private int quantity;
    private double price;
    public Product(String name,int quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

}
class BillGenerator{
    private double totalAmount;
    public double computeBill(Customer customer){ //dependency
        ArrayList<Product> products=customer.getProducts();
        for(Product product:products){
            double amount=product.getPrice()*product.getQuantity();
            totalAmount+=amount;
        }
        return totalAmount;
    }
}
public class BillGenerationApplication {
    public static void main(String[] args) {
        Customer customer=new Customer("Alice");
        customer.addProduct("Apple",2,3);
        customer.addProduct("Milk",1,2);
        customer.generateBill();
        customer.showDetails();
    }
}



