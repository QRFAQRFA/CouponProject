package beans;

import java.util.Date;

public class CouponBean 
{
	private long id;
	private String title;
	private Date startDate;
	private Date endDate;
	private int amount;
	private CouponType type = new CouponType();
    private String message;
    private double price;
    private String image;
    
    
    
    public CouponBean() {
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public String getTitle() {
		return title;
	}



	public Date getStartDate() {
		return startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public int getAmount() {
		return amount;
	}



	public CouponType getType() {
		return type;
	}



	public String getMessage() {
		return message;
	}



	public double getPrice() {
		return price;
	}



	public String getImage() {
		return image;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public void setType(CouponType type) {
		this.type = type;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void setImage(String image) {
		this.image = image;
	}
    
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
