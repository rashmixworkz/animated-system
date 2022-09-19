class Spicejet
{
	static void Flightnos(String[] Flightno)
	{
		System.out.println("stating");
		System.out.println("Total no of flights:"+Flightno.length);
		
		for(int index=0; index<Flightno.length; index++)
		{
			String ref=Flightno[index];
			System.out.println(ref);
		}
	}
}