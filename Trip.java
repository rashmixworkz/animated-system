class Trip{
	
	static double transport(String source, String destination)
	{
		System.out.println("entered transport");
		if(source=="bangloor" && destination=="koppal")
		{
			System.out.println("stating location="+source);
			System.out.println("end location="+destination);
			System.out.println("distance from source to destination is");
			return 500;
		}
		return 0.0;
	}
	static double transport(String source, String destination, boolean ontime)
	{
		if(source=="mantralaya" && destination=="raichur" && ontime==true)
		{
			System.out.println("stating location="+source);
			System.out.println("end location="+destination);
			System.out.println("reached ontime from mantralaya to raichur");
			return 50.4;
		}
		return 0.0;
	}
	static boolean transport( String destination)
	{
		if(destination=="hospet")
		{
		System.out.println("destination is hospet");
return false;		
		}
	return true;
	}
	
	static boolean transport(String destination, boolean ontime)
	{
		if(destination=="baglkot" && ontime==false)
		{
			
			System.out.println("destination is baglkot & not reached ontime ");
			return true;
		}
		return false;
	}
	static boolean transport(boolean ontime)
	{
		ontime=true;
		return false;
	}
	
}