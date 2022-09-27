class MovieDataOperator
{
	static String[] movies={null,null,null,null,null};
	static int position=0;
	
	static void save(String movie)
	{
		System.out.println("START");
		movies[position]=movie;
		System.out.println("movies in position"+position+":"+movies[position]);
		position++;
		System.out.println("End");
	}
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int sum=0; sum<movies.length; sum++)
		{
			System.out.println("movies name:"+movies[sum]);
		}
    }
}