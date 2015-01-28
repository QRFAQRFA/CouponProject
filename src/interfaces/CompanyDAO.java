package interfaces;

import java.util.Collection;

import beans.CompanyBean;
import beans.CouponBean;

public interface CompanyDAO 
{
	public void createCompany(CompanyBean compBean);
	public void removeCompany(CompanyBean compBean);
	public void updateCompany(CompanyBean compBean);
	public CompanyBean getCompany(long id);
	public Collection<CompanyBean> getAllCompanies();
	public Collection<CouponBean> getCoupons();
	public boolean login(String compName, String Password);

}
