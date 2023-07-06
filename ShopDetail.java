class ShopDetail {

	private String name;
	private String location;
	
	public ShopDetail(String n,String loc) {
		name = n;
		location = loc;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	void ShowShopDetail() {
		System.out.println("   ___Welcome to Food King Resturant___");
		System.out.println("============================================");
		System.out.println("Owner Name: "+name);
		System.out.println("Location  : "+location);
	}

	
}
