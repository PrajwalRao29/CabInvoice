
public class InvoiceSummary {
    public int rides;
    public double totalFare;
    public double averageFare;
    public InvoiceSummary(int count, double sum) {
        rides=count;
        totalFare=sum;
        averageFare=totalFare/rides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return rides == that.rides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
}
