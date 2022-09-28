class Colors
{
	static String[] colorNames={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String color)
	{
		if(position>=7)
		{
			System.out.println("colors name exceeded");
		}
		
		if(color!=null && color.length()>3)
		{
			System.out.println("START");
			colorNames[position]=color;
			System.out.println("colorNames in position"+position+":"+colorNames[position]);
			position++;
			System.out.println("next position"+position);
			System.out.println("END");
		}
		else
		{
			System.out.println("COLOR NAME IS NOT VALID"+color);
		}
	}
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int index=0; index<colorNames.length; index++)
		{
			System.out.println("color name:"+colorNames[index]);
		}
	}
	static boolean findcolor(String name)
	{
		if(name!=null && name.length()>3)
		{
			System.out.println("valid name");
			for(int num=0; num<colorNames.length; num++)
			{
				String ref=colorNames[num];
				if(ref==name)
				{
					System.out.println("color found"+name);
				return true;
			
				}
			}
		}
	
	else
	{
		System.out.println("not valid name"+name);
	}
	return false;
}
}