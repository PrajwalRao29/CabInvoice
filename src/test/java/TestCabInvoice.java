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
    public void test4_InvoiceSummary(){
        Ride[] rides={new Ride(2,5),new Ride(0.1,1)};
        InvoiceSummary outcome=c.generateInvoice(rides);
        InvoiceSummary expected=new InvoiceSummary(2,30);
        Assert.assertEquals(expected,outcome);
    }
}
