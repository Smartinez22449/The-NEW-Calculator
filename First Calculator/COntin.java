import java.util.Scanner;

public class COntin {
    public static void contin (double NEWans){
        String yes;

        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter operator (+,-,*,/).");
        String NEWop = input.nextLine();
        
        System.out.println("Enter number.");
        double NEWnum = input.nextDouble();
    
        if(NEWop.equals("+")){
        // AddOp.add(num1, num2);
        NEWans = NEWans + NEWnum;
        System.out.println(NEWans);
        
    }
        else if(NEWop.equals("-")){
        // SubtractOp. subtract(num1, num2);
        NEWans = NEWans - NEWnum;
        System.out.println(NEWans);
    }
        else if(NEWop.equals("*")){
        // MultiplyOp.multiply(num1, num2);
        NEWans = NEWans * NEWnum;
        System.out.println(NEWans);
    }
        else if(NEWop.equals("/")){
        // DivideOp.divide(num1, num2);
        NEWans = NEWans / NEWnum;
        System.out.println(NEWans);
    
        input.close();
    }

    System.out.println("Do you want to continue? yes or no");

            Scanner Yes = new Scanner(System.in);
            yes = Yes.next();

    while(yes.equals("yes")){
        COntin.contin(NEWans);
    }


    if (yes.equals("no")){
        System.exit(1);
    }
    Yes.close();
    }
}

