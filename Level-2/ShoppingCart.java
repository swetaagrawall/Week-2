
  class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class Cart {
    private CartItem[] cartItems;
    private int itemCount;

    // Constructor to initialize the cart with a fixed size
    public Cart(int size) {
        cartItems = new CartItem[size];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equals(itemName)) {
                // Shift elements to remove the item
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; // Clear the last item
                itemCount--;
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to calculate and display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].price * cartItems[i].quantity;
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display the cart contents
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println("Item: " + cartItems[i].itemName + ", Price: $" + cartItems[i].price + ", Quantity: " + cartItems[i].quantity);
            }
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Creating a Cart object with a fixed size of 5
        Cart cart = new Cart(5);

        // Creating CartItem objects
        CartItem item1 = new CartItem("Laptop", 1000.00, 1);
        CartItem item2 = new CartItem("Mouse", 25.50, 2);
        CartItem item3 = new CartItem("Keyboard", 45.75, 1);

        // Adding items to the cart
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Display cart contents and total cost
        cart.displayCart();
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Mouse");

        // Display updated cart and total cost
        cart.displayCart();
        cart.displayTotalCost();
    }
}
