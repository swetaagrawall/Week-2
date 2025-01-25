package inheritance.multilevel.onlineretailordermanagement;

public class Order {
    protected int orderId;
        protected String orderDate;
        protected String status;

        public Order(int orderId, String orderDate,String status) {
            this.orderId = orderId;
            this.orderDate = orderDate;
            this.status=status;
        }
        public void getOrderDetails(){
            System.out.println("The order id is "+orderId +" and the order date is "+orderDate);
            System.out.println("The status is : " +status);
        }
        public String getOrderStatus(){
            return status;
        }

}
