import java.util.Scanner;

class Product  {
	//instance variables
    private String productName;
	private double price;
	private static int totalProducts = 0;
	//parametrised constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  
    }
	
	//method to display result
	public void displayProductDetails(){
		System.out.println("The Product Name is " +productName);
		System.out.println("The price is " +price);
    }
	public static void displayTotalProducts() {
        System.out.println("Total Products Created are " + totalProducts);
    }

// main methods
    public static void main(String[] args) {
		//objects 
		Product product1 = new Product("Cloths", 900);
        Product product2 = new Product("Shoes", 500);
        Product product3 = new Product("Headphones", 150);
		System.out.println("First Product :");
        product1.displayProductDetails();
		System.out.println("\nSecound Product :");
        product2.displayProductDetails();
		System.out.println("\nThird Product :");
        product3.displayProductDetails();
		
		Product.displayTotalProducts();
		 
         
        
     }
  }
  