package orm_mapping.bi_onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    //@GeneratedValue(generator = "auto")
    private int pid;
    private String pname;
    private double pprice;

    @OneToOne(mappedBy="product", fetch = FetchType.EAGER, cascade =CascadeType.ALL)
    private Customer customer;

    public Product() {}
    public Product(int pid, String pname, double pprice) {
        this.pid=pid;
        this.pname=pname;
        this.pprice=pprice;
    }

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public double getPprice() {
        return pprice;
    }
    public void setPprice(double pprice) {
        this.pprice = pprice;
    }


    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        //return pid+" "+pname+" "+pprice;
        return pid+" "+pname+" "+pprice+" "+customer.getCid()+" "+customer.getCname()+" "+customer.getCphone();
        //accessing customer details is possible only when bidirectional mapping
    }
}
