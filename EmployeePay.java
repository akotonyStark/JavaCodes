
import java.util.*;
import java.lang.Math; 


//public class EmployeePay{
//    public static void main(String[] args){
//        
//        double weeklyPay = 0;
//        double regularHourlyRate = 20;
//        int totalNumberOfHours = 0;
//        double overtimeHourlyRate = 30;
//        int maxOvertimeHours = 2;
//        boolean qualifiesOvertime = true;
//        
//       
//        
//        System.out.print("Enter your total number of hours worked in the week = ");
//        Scanner sc = new Scanner(System.in);
//        totalNumberOfHours = sc.nextInt();
//    
//        weeklyPay = totalNumberOfHours * regularHourlyRate;
//        
//        //randomly determine overtime employee
//        double rand = 10 * Math.random();
//        if(rand < 5){
//            qualifiesOvertime = false;
//        }
//        
//        if(qualifiesOvertime){
//            System.out.print("Enter your total number of hours worked overtime = ");
//            int overtime = sc.nextInt();
//            
//            if(overtime > maxOvertimeHours){
//                System.out.println("Your weekly pay is " + weeklyPay + "GHS");
//                System.out.println("Overtime pay cannot be processed");
//            }
//            else{
//                double overtimeMoney = overtime * overtimeHourlyRate;
//                System.out.println("Your weekly pay is " + weeklyPay + "GHS");
//                System.out.println("Overtime pay is " + overtimeMoney + "GHS");
//            }
//        }
//        
//        else{
//             System.out.println("Your weekly pay is " + weeklyPay + "GHS");
//             System.out.println("You do not qualify for overtime");
//        }
//    
//    }  
//       
//}

/* solution 2 */
public class EmployeePay{
    public static void main(String[] args) {
        
        double totalWeeklyPay = 0, hourlyRate = 10, overtimeHourlyRate = 15;
        int totalTime = 0, overtimeHours = 0;       
                
        System.out.print("Please enter total number of hours worked: ");
        Scanner sc = new Scanner(System.in);
        totalTime = sc.nextInt();
    
        totalWeeklyPay = totalTime * hourlyRate;    
                
        System.out.println("Did you do overtime? Enter Yes or No : ");
        String answer = sc.nextLine();
            
        if(answer.equalsIgnoreCase("Yes")){
            System.out.print("Please enter hours worked overtime: ");
            overtimeHours = sc.nextInt();
                 
            if(overtimeHours > 2){
                 System.out.println("Your weekly pay is " + totalWeeklyPay + "GHS");
                 System.out.println("Overtime pay cannot be processed");
            }
            else{
                double overtimeMoney = overtimeHours * overtimeHourlyRate;
                System.out.println("Your weekly pay is " + totalWeeklyPay + "GHS");
                System.out.println("Overtime pay is " + overtimeMoney + "GHS");
                }
            }
            
            else{
                System.out.println("Your weekly pay is " + totalWeeklyPay + "GHS");
                System.out.println("You do not qualify for overtime");
            }            
           
        }
}
