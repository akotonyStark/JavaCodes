/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAMPOFO
 */

/* Solution 1 */

//public class AddingNumbers {
//    public static void main(String[] args) {
//        int total = adder(10,20);
//        System.out.println("Sum of integers from 10 to 20 skipping 15 & 16 is " + total);        
//    }    
//    //method for adding range but skipping 15 & 16
//    public static int adder(int start, int end){
//        int sum = 0;
//        for(int i = start; i<= end; i++){
//            if(i == 15 || i == 16){
//                 continue;
//            }
//            else{
//                sum = sum + i;
//            }            
//        }
//        return sum;
//    }
//}

/* Solution 2 */
//public class AddingNumbers {
//    public static void main(String[] args) {
//       System.out.println("Sum = " + addSkip(10,20));
//    }
//    
//     static int addSkip(int a, int b){
//        int total = 0;
//        while(a <= b){
//            if(a == 15 || a == 16){
//                a = a + 1;
//                continue;
//            }
//            else{
//                total = total + a;
//                a = a + 1;
//            }
//        } 
//        return total;
//     } 
//}


//solution 3
//public class AddingNumbers {
//    public static void main(String[] args) {
//       System.out.println("The sum is " + numberAdder(10,20));
//    }
//    
//     static int numberAdder(int x, int y){
//        int sum = 0;
//        while(x <= y){
//            if(x != 15 && x != 16){
//                sum += x;
//                x++;
//                continue;
//            }
//            else{
//                x++;
//            }
//        } 
//        return sum;
//     } 
//}


//Solution 4
public class AddingNumbers {
    public static void main(String[] args) {
       System.out.println("The sum is " + add(10,20));
    } 
    
     public static int add(int num1, int num2){
        
      int sumValue = 0;
      for(int i = num1; i<=num2; ++i){
            if(i == 15){ 
                continue;
            }
            else if( i == 16){
                continue;
            }
            else{
                sumValue += i;
            }            
        }
        return sumValue;

     }
}
