package beans;

import java.util.Collection;

public class CompanyBean 
{
	private long id;
	private String compName;
	private String password;
	private String email;
	private Collection<CouponBean> coupons;
	
	
    public CompanyBean() 
    {
    	
    }


	public long getId() {
		return id;
	}


	public String getCompName() {
		return compName;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail() {
		return email;
	}


	public Collection<CouponBean> getCoupons() {
		return coupons;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setCompName(String compName) {
		this.compName = compName;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setEmail(String email) {
		this.email = email;
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
