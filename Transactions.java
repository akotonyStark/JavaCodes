import java.util.Scanner;
//public class Transactions{
//    public static void main(String[] args){        
//        double costPrice = 2000;      
//        do {
//            System.out.println("Enter number of items = ");
//            Scanner input = new Scanner(System.in);
//            int numOfphonesIn = input.nextInt();           
//            if(numOfphonesIn > 0){
//                System.out.println("Total Number of phones brought in = " + numOfphonesIn);
//                System.out.println("Total cost of phones brought in = " + numOfphonesIn * costPrice + "GHS");
//            }
//            else if(numOfphonesIn < 0){
//                System.out.println("Number of phones issued is = " + (-numOfphonesIn));
//                System.out.println("Total cost of phones issued is = " + (-numOfphonesIn) * costPrice + "GHS");
//            }
//            else{
//                System.exit(0);
//            }
//          }while(true);
//        }       
//} 


/* solution 2 */
//public class Transactions{
//    public static void main(String[] args){ 
//        
//        double priceOfItem = 150.0;  
//        int items;
//        while(true) {
//            
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Enter number of items or Enter zero to end program = ");
//            
//            items = scan.nextInt();  
//            if(items == 0){
//                System.exit(0);
//            } 
//            if(items > 0){
//                System.out.println("The total number of items received is " + items);
//                System.out.println("The total cost of items received is  " + items * priceOfItem + "GHS");
//            }
//            else if(items < 0){
//                System.out.println("The total number of items issued out is = " + (Math.abs(items)));
//                System.out.println("The total cost of items issued out is " + (Math.abs(items)) * priceOfItem + "GHS");
//            }            
//          }
//        }       
//} 

/* Solution 3 */
public class Transactions{
    public static void main(String[] args){ 
        
        //price is constant
        final double ITEM_PRICE = 500.0;  
        
        //while condition remains true
        while(1==1) {            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter number of street lights or Enter zero to end program = ");
            
            int num_of_items = scanner.nextInt();  
            if(num_of_items == 0){
               break;
            } 
            else if(num_of_items > 0){
                System.out.println("The total number of items received is " + num_of_items);
                System.out.println("The total cost of items received is  " + num_of_items * ITEM_PRICE + "GHS");
            }
            else{
                System.out.println("The total number of items issued out is = " + (Math.abs(num_of_items)));
                System.out.println("The total cost of items issued out is " + (Math.abs(num_of_items)) * ITEM_PRICE + "GHS");
            }            
          }
        }       
} 
