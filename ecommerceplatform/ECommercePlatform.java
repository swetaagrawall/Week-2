package encapsulationandpolymorphism.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product p;
        p = new Groceries(101, "Rice", 2000);
        p.calculateTax(10);
        p.calculateDiscount(10);
        products.add(p);

        System.out.println();
        p = new Clothing(201, "Shirt", 5000);
        p.calculateTax(10);
        p.calculateDiscount(10);
        products.add(p);

        System.out.println();
        p = new Electronics(301, "Earphones", 3000);
        p.calculateTax(10);
        p.calculateDiscount(10);
        products.add(p);
        for(Product product : products){
            product.display();
            System.out.println();
        }



    }
}

