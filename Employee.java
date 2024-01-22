
public class Employee extends StaffMember {

	protected String socialSecurityNumber;
	protected double payRate;

	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}

	@Override
	public double pay() {
		return this.payRate;
	}

	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}
   
   @Override
   public int getVacationDays() {
      return vacationDays + 5;
   }

}
