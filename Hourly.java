
public class Hourly extends Employee {
	private int hoursWorked;

	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.hoursWorked = 0;
	}
	
	public void addHours(int hours) {
		this.hoursWorked += hours;
	}
	
	@Override
	public double pay() {
		double payment = super.pay() * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
   
   @Override
   public int getVacationDays() {
      return vacationDays + 2;
   }

}
