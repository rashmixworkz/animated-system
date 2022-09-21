class Card{
	
	static String type;
	static int height;
	static double weight;
	static int price;
	static String[] colors;
	
	
	static void displayDetails()
	{
		
		System.out.println(type);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(price);
		System.out.println(colors);
		
		if(colors!=null)
		{
			
		System.out.println("array is point to memory");
		
		for(int index=0; index<colors.length; index++)
		{
			String ref=colors[index];
			System.out.println(ref);
		}
	}
	else
	{
		System.out.println("array is not pointing to memory");
	}
}
}