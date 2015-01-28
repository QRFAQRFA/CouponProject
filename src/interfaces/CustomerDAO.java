package interfaces;

import java.util.Collection;

import beans.CouponBean;
import beans.CustomerBean;

public interface CustomerDAO 
{
	
	public void createCustomer(CustomerBean custBean);
	public void removeCustomer(CustomerBean custBean);
	public void updateCustomer(CustomerBean custBean);
	public CustomerBean getCustomer(long id);
	public Collection<CustomerBean> getAllCustomers();
	public Collection<CouponBean> getCoupons();
	public boolean login(String custName, String Password);

}
