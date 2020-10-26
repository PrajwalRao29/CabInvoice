public class CabInvoice {
    double distance;
    double time;

    public double generateInvoice(double distance, double time)
    {
        if(distance <=0 || time<=0)
        {
            return -1;
        }
        return (10*distance+1*time<5)?5:(10*distance+1*time);
    }
    public double generateInvoice(Ride[] rides)
    {
        double sum=0;
        for(Ride r:rides)
        {
            sum=sum+this.generateInvoice(r.distance,r.time);
        }
        return sum;
    }
}
