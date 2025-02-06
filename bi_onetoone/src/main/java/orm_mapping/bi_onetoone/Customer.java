package orm_mapping.bi_onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    //@GeneratedValue(generator = "auto")
    private int cid;
    private String cname;
    private String cphone;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    private Product product;

    public Customer() {}
    public Customer(int cid, String cname, String cphone, Product prod) {
        this.cid=cid;
        this.cname=cname;
        this.cphone=cphone;
        this.product=prod;
    }

    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCphone() {
        return cphone;
    }
    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    @Override
    public String toString() {
        return cid+" "+cname+" "+cphone+" "+product;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}
