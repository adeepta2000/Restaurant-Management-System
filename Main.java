public class Main {

	public static void main(String[] args) {
		
		
		ShopDetail s = new ShopDetail("Moinul Islam", "Puran Dhaka 1205");
		s.ShowShopDetail();
		//Voucher code FoodKing321
		Choice c1 = new Choice();
		c1.displayItem();
		c1.choiceItem();
		VoucherCode vc=new VoucherCode();
		vc.displayVoucher();
		
	}
	
}