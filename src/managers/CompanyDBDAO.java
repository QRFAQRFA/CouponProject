package managers;

import java.util.Collection;

import beans.CompanyBean;
import beans.CouponBean;
import interfaces.CompanyDAO;

public class CompanyDBDAO implements CompanyDAO
{

	@Override
	public void createCompany(CompanyBean compBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCompany(CompanyBean compBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompany(CompanyBean compBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompanyBean getCompany(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CompanyBean> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CouponBean> getCoupons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String compName, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

}
