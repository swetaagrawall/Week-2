package inheritance.multilevel.onlineretailordermanagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o;
        o= new Order(101, "26/04/2024", "order Confirmed");
        o.getOrderDetails();
        o=new ShippedOrder(101, "26/04/2024","Order Shipped" , 100001110);
        o.getOrderDetails();
        o=new DeliveredOrder(101, "26/04/2024","Order Delivered" ,100001110,"30/04/2024"  );
        o.getOrderDetails();

    }
}
