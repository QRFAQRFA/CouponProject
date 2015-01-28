package interfaces;

import java.util.Collection;

import beans.CouponBean;
import beans.CouponType;

public interface CouponDAO 
{

	public void createCoupon(CouponBean coupBean);
	public void removeCoupon(CouponBean coupBean);
	public void updateCoupon(CouponBean coupBean);
	public CouponBean getCoupon(long id);
	public Collection<CouponBean> getAllCoupons();
	public Collection<CouponBean> getCouponByType(CouponType type);

}
