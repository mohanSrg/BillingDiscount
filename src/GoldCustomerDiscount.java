
public class GoldCustomerDiscount extends Discount{

	@Override
	public double getDiscount(double totalSales) {
		// TODO Auto-generated method stub
		
		return totalSales - 100;
	}

}
