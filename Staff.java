
public class Staff {
	private StaffMember[] staffList;

	public Staff() {
		staffList = new StaffMember[8];
		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
     	staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
		staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
      staffList[6] = new Commission("Ghulam", "2036 Main Avenue", "777-0890", "987-08-6543", 6.25, .2);
      staffList[7] = new Commission("Ahmed", "2038 United St", "999-0909", "091-76-6431", 9.75, .15);

		((Executive) staffList[0]).awardBonus(500.00);
		((Hourly) staffList[3]).addHours(40);
      ((Hourly) staffList[6]).addHours(35);
      ((Commission) staffList[6]).addSales(400.00);
      ((Hourly) staffList[7]).addHours(40);
      ((Commission) staffList[7]).addSales(950.00);
	}

	public void payday() {
		double amount;
		for (int count = 0; count < staffList.length; count++) {
			System.out.println(staffList[count]);
			amount = staffList[count].pay(); // polymorphic
			if (amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: " + amount);
			System.out.println("-----------------------------------");
		}
	}
   
   public void printVacationDays() {
       System.out.println("The Vacation Days for each employee are: ");
       for (int i=0; i < staffList.length; i++){
         System.out.println(staffList[i].name);
         System.out.println ("Vacation Days : "+staffList[i].getVacationDays());
       }
   }
}
