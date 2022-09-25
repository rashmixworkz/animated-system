class Product 
{
	public static void main(String[] pointer)
	
	{
		System.out.println("ENTRY");
		
		String name= pointer[0];
		String type=pointer[1];
	    System.out.println("product name:"+name);
		System.out.println("product type:"+type);
		
		
		String price=pointer[2];
		int convertedPrice=Integer.parseInt(price);
		System.out.println("product price:"+price);
		
		String  quantity=pointer[3];
		int convertedQuantity=Integer.parseInt(quantity);
		System.out.println("product quantity:"+quantity);
		
		String quality=pointer[4];
		
		boolean convertedquality= Boolean.parseBoolean(quality);
		System.out.println("Converted quality:"+convertedquality);
	
		if(convertedquality==true)
		{
			System.out.println("product quality is good");
		}
		else
		{
			System.out.println("product quality is not good");
		}
		
		int totalprice=convertedPrice*convertedQuantity;
		System.out.println("Total Price:"+totalprice);
		
		
		System.out.println("EXIT");	
		
	}
}