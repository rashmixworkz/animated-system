class TripRunner{
	
	public static void main(String[] args)
	{
		System.out.println("Running main method")
		double total=Trip.transport("bangloor","koppal");
		System.out.println(total);
		
		double journey=Trip.transport("mantralaya","raichur",true);
		System.out.println(journey);
		
		boolean endPoint=Trip.transport("hospet");
		System.out.println(endPoint);
		
		boolean best=Trip.transport("baglkot",false);
		System.out.println(best);
		
		boolean time=Trip.transport(true);
		System.out.println(time);
	}
}