package inheritance.multilevel.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String status, long trackingNumber, String deliveryDate) {
        super(orderId, orderDate, status, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public void getOrderDetails(){
        System.out.println("The status is : " +status+" and the delivery date is : " +deliveryDate);


    }
}
