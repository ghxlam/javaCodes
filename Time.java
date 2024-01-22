/**
Ghulam Ahmed
Summer 2022
CS-113
Section 121
Assignment 1
*/

import java.util.Scanner;

public class Time {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int seconds, minutes, hours, days, seconds_left;
      
      System.out.print("Enter Time in Seconds: ");
      seconds = scan.nextInt();
      System.out.println("\n" + seconds + " seconds is: ");
      days = seconds/86400;
      hours = (seconds-(days * 86400))/3600;
      minutes = (seconds - (days * 86400) - (hours * 3600))/60;
      seconds_left = (seconds - (days * 86400) - (hours * 3600) - (minutes * 60));
      System.out.println(days + " days\n" + hours + " hours \n" + minutes + " minutes\n" + seconds_left + " seconds");
      
      
      
   }
}