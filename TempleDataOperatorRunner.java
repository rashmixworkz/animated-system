class TempleDataOperatorRunner
{
	public static void main(String[] names)
	{
		System.out.println("main method start");
		TempleDataOperator.save("Ganesh Temple");
		TempleDataOperator.save("Durga Temple");
		TempleDataOperator.save("Anjeneya Temple");
		TempleDataOperator.save("Subramanya Temple");
		TempleDataOperator.save("Raghavendra Temple");
		TempleDataOperator.displayDetails();
		
		System.out.println("main method end");
		
	}
}