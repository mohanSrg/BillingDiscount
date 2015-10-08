import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer {

	

	public static void main(String args[]) throws Exception {
		
		Discount discount;
		GoldCustomer gCustomer = new GoldCustomer();
		SilverCustomer sCustomer = new SilverCustomer();
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		System.out
				.println("Enter Customer Type:\n 1 : GoldCustomer \n 2 : Silvercustomer");

		String type = input.readLine();

		int customerType = Integer.parseInt(type);
		System.out
				.println("Enter Customer TotalSales");

		String sales = input.readLine();

		double totalSales = Double.parseDouble(sales);
		
		double afterDisc;
		if(customerType== 1){
			afterDisc = gCustomer.getDiscount(totalSales);
		}else{
			afterDisc = sCustomer.getDiscount(totalSales);
		}
		
		
		System.out.println("Total Amount with Discount: "+ afterDisc);

	}
}
