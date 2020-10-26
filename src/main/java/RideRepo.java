import java.util.*;

public class RideRepo {

    Map<String,InvoiceSummary> repo=new HashMap<String,InvoiceSummary>();

    public void add(String s,InvoiceSummary i)
    {
        repo.put(s,i);
    }
    public InvoiceSummary get(String r)
    {
        return repo.get(r);
    }
}
