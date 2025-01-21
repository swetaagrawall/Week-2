public class Product {

    private  String productName;
    private  double price;
    private  int quantity;
    private static double discount =10.0;
    private final  int productId;

    public Product(String productName, double price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    public  static double updateDiscount(int newDiscount) {
        discount = newDiscount;
        return discount;
    }

    public void displayProducts(){
        System.out.println("The name of product is "+productName);
        System.out.println("The price of product is "+ price);
        System.out.println("The quantity of product is "+quantity);
        System.out.println("The Total Selling price of products after "+discount+" discount is "+(quantity*(price-price*(discount/100.0))));
    }
    public static void main(String[] args) {
     Product p1=new Product("pen" , 20 , 2 , 1001  );
     Product p2=new Product("book" , 200 , 3 , 3001  );
     if(p1 instanceof Product){
         System.out.println("Product 1");
         System.out.println("yes p1 is instance of product");
         updateDiscount(20);
         p1.displayProducts();

     }
        if(p2 instanceof Product){
            System.out.println("\nProduct 2");
            System.out.println("yes p2 is instance of product");
            updateDiscount(20);
            p2.displayProducts();

        }
    }
}
