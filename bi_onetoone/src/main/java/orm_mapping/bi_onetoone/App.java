package orm_mapping.bi_onetoone;

public class App 
{
    public static void main( String[] args )
    {
    	Customer cust = new Customer();
    	Product prod = new Product();
    	
    	prod.setPid(102);
    	prod.setPname(" Phone");
    	prod.setPprice(40000);
    	
    	cust.setCid(2);
    	cust.setCname("Rima");
    	cust.setCphone("9000898754");
    	cust.setProduct(prod);
    	
    	CustomerImpl cimpl=new CustomerImpl();
    	ProductImpl pimpl = new ProductImpl();
    	
    	cimpl.insert(cust);
    	
    	cimpl.getAll();
    }
}
