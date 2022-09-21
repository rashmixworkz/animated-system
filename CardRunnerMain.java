class CardRunnerMain{
	
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		
		Card.displayDetails();
		
		
		Card.type="Wedding card";
		Card.height=3;
		Card.weight=2.5D;
		Card.price=30;
		
		String[] things={"red","blue","black","pink","green"};
		Card.colors=things;
		
		Card.displayDetails();
		
		System.out.println("end");
	}
		
		
		
		
		
		
		
}