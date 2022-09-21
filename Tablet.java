class Tablet{

	
	static String type;
	static int height;
	static double weight;
	static int price;
	static String material;
	static int noOfTabletSlots;
	static String color;
	static int manufactureDate;
	static String shape;
	static int expireDate;
	static String name;
	static int dose;
	static double thickness;
	static String[] contents;
	
	
	static void printDetails()
	{
		
		System.out.println(type);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(price);
		System.out.println(material);
		System.out.println(noOfTabletSlots);
		System.out.println(manufactureDate);
		System.out.println(shape);
		System.out.println(expireDate);
		System.out.println(name);
		System.out.println( dose);
		System.out.println(thickness);
		
		if(contents!=null)
		{
			
		System.out.println("array is point to memory");
		
		for(int num=0; num<contents.length; num++)
		{
			String ref=contents[num];
			System.out.println(ref);
		}
	}
	else{
		System.out.println("array is not pointing to memory");
	}
}
}
