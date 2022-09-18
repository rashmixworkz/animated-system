class Job{
	
	static void work (String company,double salary)
	{
		
		System.out.println("entered work");
		if(company=="Akamai" && salary==10.2)
			
			{
				System.out.println("Akamai company salary is 10.2LPA");
				return;
			}
	}
	
			static void work (String company,double salary, String designation)
	{
			if(company=="Capgemini" && salary==3.5 && designation=="software engineer")
			
			{
				System.out.println(" capgemini salary is 3.5LPA for software engineer");
				return;
			}
			
	}
}