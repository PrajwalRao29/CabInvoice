import org.junit.*;

public class TestCabInvoice {
    CabInvoice c=new CabInvoice();
    RideRepo r=new RideRepo();
    @Before
    public void initiateRepoData()
    {
        Ride[] rides={new Ride(2,5,false),new Ride(0.1,1,false)};
        InvoiceSummary outcome=c.generateInvoice(rides);
        r.add("Prajwal",outcome);
        Ride[] rides2={new Ride(18,2,true),new Ride(0.1,5,false),new Ride(5,8,true)};
        InvoiceSummary outcome2=c.generateInvoice(rides2);
        r.add("Sachin",outcome2);
    }

    @Test
    public void test1_WhenCabCostLessThanLimit(){
        Assert.assertEquals(5,c.generateInvoice(0.2,1,false),0);
    }
    @Test
    public void test2_WhenCabCostMoreThanLimit(){
        Assert.assertEquals(11,c.generateInvoice(1,1,false),0);
    }
    @Test
    public void test3_WhenCabCostLessThanLimitPremium(){
        Assert.assertEquals(20,c.generateInvoice(0.2,1,true),0);
    }
    @Test
    public void test4_WhenCabCostMoreThanLimitPremium(){
        Assert.assertEquals(152,c.generateInvoice(10,1,true),0);
    }
    @Test
    public void test5_InvalidInput(){
        Assert.assertEquals(-1,c.generateInvoice(15,-1,false),0);
    }
    @Test
    public void test6_InvoiceSummary(){
        Ride[] rides={new Ride(2,5,false),new Ride(0.1,1,false)};
        InvoiceSummary outcome=c.generateInvoice(rides);
        InvoiceSummary expected=new InvoiceSummary(2,30);
        Assert.assertEquals(expected,outcome);
    }
    @Test
    public void test7_RideRepository(){
        InvoiceSummary expected=new InvoiceSummary(2,30);
        Assert.assertEquals(expected,r.get("Prajwal"));
    }
    @Test
    public void test8_RideRepositoryNull(){
        InvoiceSummary expected=null;
        Assert.assertEquals(expected,r.get("Ashwin"));
    }
}

