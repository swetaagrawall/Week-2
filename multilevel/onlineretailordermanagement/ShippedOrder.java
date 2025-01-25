package inheritance.multilevel.onlineretailordermanagement;

public class ShippedOrder extends Order{
    private long trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String status, long trackingNumber) {
        super(orderId, orderDate, status);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public void getOrderDetails(){
        System.out.println("The status is : " +status+" and the  tracking number : " +trackingNumber);


    }

}
