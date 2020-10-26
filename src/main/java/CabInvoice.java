public class CabInvoice {
    double distance;
    double time;

    public CabInvoice(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }
    public double generateInvoice()
    {
        if(distance <=0 || time<=0)
        {
            return -1;
        }
        return (10*distance+1*time<5)?5:(10*distance+1*time);
    }
}
