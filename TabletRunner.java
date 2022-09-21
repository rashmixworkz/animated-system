class TabletRunner{
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		
		Tablet.printDetails();
		
		
		Tablet.type="compressed tablet";
		Tablet.height=4;
		Tablet.weight=1.2D;
		Tablet.price=60;
		Tablet.material="lactose";
		Tablet.noOfTabletSlots=6;
		Tablet.color="pink";
		Tablet.manufactureDate=13;
		Tablet.shape="round";
		Tablet.expireDate=3;
		Tablet.name="paracetamol";
		Tablet.dose=5;
		Tablet.thickness=1.1D;
		
		
		String[] tab={"paracetamol","metformin","maizestarch","sorbitol","povidone","purified talc","sodium glycolate","magnisium","agar","hypromellose","citric acid"};
		Tablet.contents=tab;
		
		Tablet.printDetails();
		
		System.out.println("end");
	}
}