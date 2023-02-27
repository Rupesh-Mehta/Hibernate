package org.jsp.constructor_injector;


	public class Mouse{
		private String bname;
		private String type;
		private int price;
		private String Colour;
		
		public Mouse(String bname, String type, int price, String colour) {
			this.bname = bname;
			this.type = type;
			this.price = price;
			this.Colour = colour;
			
		}
	

	public void details() {
		// TODO Auto-generated method stub
		System.out.println(bname);
		System.out.println(type);
		System.out.println(price);
		System.out.println(Colour);
		
	}

}

