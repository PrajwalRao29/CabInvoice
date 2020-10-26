public class CabInvoice {
    double distance;
    double time;

    public double generateInvoice(double distance, double time,boolean flag)
    {
        if(distance <=0 || time<=0)
        {
            return -1;
        }
        if(!flag)
        return (10*distance+1*time<5)?5:(10*distance+1*time);
        else
            return (15*distance+2*time<20)?20:(15*distance+2*time);
    }


    public InvoiceSummary generateInvoice(Ride[] rides)
    {
        double sum=0;
        int count=0;

        for(Ride r:rides)
        {
            count++;
            sum=sum+this.generateInvoice(r.distance,r.time,r.flag);
        }
        return new InvoiceSummary(count,sum);
    }
}
