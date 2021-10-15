import java.util.*;


public class Calculator{
    public static void main(String[] args){
        
        String yes;
        double NEWans = 0;
        Scanner input = new Scanner(System.in);
       
        
        System.out.println("Enter operator (+,-,*,/,sqrt).");
        String op = input.nextLine();

        if(op.equals("sqrt")){
            System.out.println("The number you want to square root.");
            double numSr = input.nextDouble();
            SqrtOp.sqrt(numSr);
            main(args);
        }

        System.out.println("Enter first number.");
        double num1 = input.nextDouble();

    
        System.out.println("Enter second number.");
        double num2 = input.nextDouble();
        
            if(op.equals("+")){
                AddOp.add(num1, num2);
                NEWans = num1 + num2;
                
            }
                else if(op.equals("-")){
                SubtractOp. subtract(num1, num2);
                NEWans = num2 - num1;
            }
                else if(op.equals("*")){
                MultiplyOp.multiply(num1, num2);
                NEWans = num1 * num2;
            }
                else if(op.equals("/")){
                DivideOp.divide(num1, num2);
                NEWans = num2 / num1;
            }
 
            System.out.println("Do you want to continue? yes or no");

            Scanner Yes = new Scanner(System.in);
            yes = Yes.next();

            if(yes.equals("yes")){
                COntin.contin(NEWans);
                
        }
            if(yes.equals("no")){
                System.exit(1);
             } 
            
        Yes.close();
        input.close();
    
    }
}