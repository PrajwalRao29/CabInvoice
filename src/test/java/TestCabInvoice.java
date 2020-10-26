import org.junit.*;

public class TestCabInvoice {
    CabInvoice c;

    @Test
    public void test1_WhenCabCostLessThanLimit(){
        c=new CabInvoice(0.2,1);
        Assert.assertEquals(5,c.generateInvoice(),0);
    }
    @Test
    public void test2_WhenCabCostMoreThanLimit(){
        c=new CabInvoice(1,1);
        Assert.assertEquals(11,c.generateInvoice(),0);
    }
    @Test
    public void test3_InvalidInput(){
        c=new CabInvoice(15,0);
        Assert.assertEquals(-1,c.generateInvoice(),0);

    }
}
