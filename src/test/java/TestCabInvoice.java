import org.junit.*;

public class TestCabInvoice {
    CabInvoice c=new CabInvoice();

    @Test
    public void test1_WhenCabCostLessThanLimit(){
        Assert.assertEquals(5,c.generateInvoice(0.2,1),0);
    }
    @Test
    public void test2_WhenCabCostMoreThanLimit(){
        Assert.assertEquals(11,c.generateInvoice(1,1),0);
    }
    @Test
    public void test3_InvalidInput(){
        Assert.assertEquals(-1,c.generateInvoice(15,0),0);
    }
    @Test
    public void test4_MultipleRide(){
        Ride[] rides={new Ride(2,4),new Ride(5,2)};
        Assert.assertEquals(76,  c.generateInvoice(rides),0);
    }
}
