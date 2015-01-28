package managers;

import java.util.Collection;

import beans.CouponBean;
import beans.CustomerBean;
import interfaces.CustomerDAO;

public class CustomerDBDAO implements CustomerDAO
{

	@Override
	public void createCustomer(CustomerBean custBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(CustomerBean custBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(CustomerBean custBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerBean getCustomer(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CouponBean> getCoupons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String custName, String Password) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
