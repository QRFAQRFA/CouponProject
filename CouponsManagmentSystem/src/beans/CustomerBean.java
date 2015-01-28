package beans;

import java.util.Collection;

public class CustomerBean 
{
	private long id;
	private String custName;
    private String password;
    private Collection<CouponBean> coupons;
    
    
    public CustomerBean() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public String getCustName() {
		return custName;
	}


	public String getPassword() {
		return password;
	}


	public Collection<CouponBean> getCoupons() {
		return coupons;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setCoupons(Collection<CouponBean> coupons) {
		this.coupons = coupons;
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
