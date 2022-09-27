class TempleDataOperator
{
	static String[] templeNames={null,null,null,null,null};
	static int position=0;
	
	static void save(String templeName)
	{
		System.out.println("Start");
		templeNames[position]=templeName;
		System.out.println("templeName in position"+position+":"+templeNames[position]);
		position++;
		System.out.println("End");
		
	}
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int index=0; index<templeNames.length; index++)
		{
			System.out.println("temple name:"+templeNames[index]);
		}
	}
}