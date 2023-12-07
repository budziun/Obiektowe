import java.time.LocalDate;
import java.util.Comparator;
class Order {
    public int id;
    public String customerName;
    public LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "[ "+ id + " " + customerName + " " + orderDate + " ]";
    }
}
class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int dateComparison = o1.orderDate.compareTo(o2.orderDate);
        if (dateComparison != 0) {
            return dateComparison;
        }
        return Integer.compare(o1.id, o2.id);
    }
}