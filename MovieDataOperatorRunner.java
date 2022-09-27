class MovieDataOperatorRunner
{
	public static void main(String[] args)
	{
		System.out.println("main method start");
		MovieDataOperator.save("Rajakumara");
		MovieDataOperator.save("Galipata 2");
		MovieDataOperator.save("Lucky man");
		MovieDataOperator.save("KGF");
		MovieDataOperator.save("Milana");
		
		MovieDataOperator.displayDetails();
		System.out.println("main method end");
	}
}