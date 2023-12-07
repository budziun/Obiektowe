import java.time.LocalDate;

public class Order implements Comparable<Order> {
    int id;
    String customerName;
    LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "[ " + id + " " + customerName + " " + orderDate + " ]";
    }

    @Override
    public int compareTo(Order o) {
        if(.compare(this.orderDate,o.orderDate)==0){
            return Integer.compare(this.id,o.id);
        }
        return .compare(this.orderDate,o.orderDate);
    }
}
