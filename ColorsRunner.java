class ColorsRunner
{
	public static void main(String[] args)
	{
		System.out.println("main Start");
		Colors.save("BLUE");
		Colors.save("orange");
		Colors.save("violet");
		Colors.save("pink");
		Colors.save("yellow");
		Colors.save("gray");
		Colors.save("black");
	    Colors.displayDetails();
		
		
		boolean ref=Colors.findcolor("purple");
		System.out.println("color found:" +ref);
		System.out.println("main end");
		
	}
}