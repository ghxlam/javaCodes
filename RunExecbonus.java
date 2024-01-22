
import java.util.Scanner;
public class RunExecbonus {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number of Executives: ");
      int n = Integer.parseInt(scan.next());
      Executive executives[] = new Executive[n];
      for(int i=0; i<n; i++) {
         System.out.printf("Enter name of Exec.: ", (i+1));
         String name = scan.next();
         System.out.printf("Enter address of Exec.: ", (i+1));
         String address = scan.next();
         System.out.printf("Enter phone # of Exec.: ", (i+1));
         String phone = scan.next();
         System.out.printf("Enter SSN of Exec.: ", (i+1));
         String socialSecurityNumber = scan.next();
         System.out.printf("Enter payrate of Exec.: ", (i+1));
         double payrate = scan.nextDouble();
         try {
            System.out.printf("Enter bonus for Exec.: ", (i+1));
            double bonus = scan.nextDouble();
         }
         catch (BonusTooLowException e) {
            System.out.println(e);
         }
      }
   }
}