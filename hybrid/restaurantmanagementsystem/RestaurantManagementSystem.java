package inheritance.hybrid.restaurantmanagementsystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef c=new Chef("Ankit" , 101 );
        c.performDuties();
        System.out.println();
        Waiter w=new Waiter("Anush" , 201);
        w.performDuties();
    }
}
