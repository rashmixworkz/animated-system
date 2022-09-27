class FoodItemsDataOperator
{
	static String[] foodItems={null,null,null,null,null};
	static int position=0;
	
	static void save(String food)
	{
		System.out.println("START");
		foodItems[position]=food;
		System.out.println("foodItems in position"+position+":"+foodItems[position]);
		position++;
		System.out.println("END");
	}
	
	static void displayDetails()
{
	for(int num=0; num<foodItems.length; num++)
	{
		System.out.println("foodItems name:"+foodItems[num]);
	}
}
}