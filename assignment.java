import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // int sum = 0;
        // for(int i=1 ; i<=10 ; i+=1){
        //     sum = sum +i;
        //     System.out.println("Current value is " +i);
        //     System.out.println("Current sum is " +sum);
        // }
// 
        // for(int i=1 ; i<=5 ; i++){//lines
        //     for(int j=1 ; j<=5 ; j++){//the #
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=5 ; i>=1 ; i--){//lines
        //     for(int j=1 ; j<=i ; j++){//the #
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1 ; i<=5 ; i++){//lines
        //     for(int j=1 ; j<=i ; j++){//the #
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int number = in.nextInt(); 

        // if (number > 0) {
        //     System.out.println("The number is positive.");
        // }
        // else if(number<0){
        //     System.out.println("The number is negative");
        // }
        // else{
        //     System.out.println("Its 0");
        // }

        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = in.nextInt();

        // switch (age) {
        //     case  36:
        //         System.out.println("MCA");
        //         break;
        //     case 50:
        //         System.out.println("PRESIDENT ");
        //         break;
        //     case 45 :
        //         System.out.println("MP");
        //         break;
        //     case 55:
        //     System.out.println("SENATOR");
        //     break;
        //     default:
        //         System.out.println("HAIWEZI");
        // }

        // Scanner inn = new Scanner(System.in);
        // System.out.print("Enter month: ");
        // int month = inn.nextInt();

        // if(month == 12 || month == 1 || month == 3){
        //     System.out.println("WINTERRRR");
        // }
        // else if(month == 3 || month == 4|| month==5){
        //     System.out.println("SPRINGGG");
        // }
        // else if(month == 6 || month == 7|| month==8){
        //     System.out.println("SUMMERRR");
        // }
        // else if(month == 9 || month == 10|| month==11){
        //     System.out.println("AUTUM");
        // }
        // else{
        //     System.out.println("Invalid");
        // }

        Scanner inn = new Scanner(System.in);
        System.out.print("Enter amount spent: ");
        double amount = inn.nextDouble();

        if(amount < 10000){
            System.out.println("No discount");
        }
        else if(amount < 20000){
            System.out.println("10% discount");
            amount = 0.9 *amount;
        }
        else if(amount < 30000){
            System.out.println("15% discount");
            amount =  0.85 *amount;
        }
        else if(amount < 40000){
            System.out.println("20% discount");
            amount =   0.8 *amount;
        }
        else if(amount > 40000){
            System.out.println("25% discount");
            amount =  0.75 *amount;
        }
        else{
            System.out.println("Invalid");
        }

        System.out.println("Final amount after discount: " + amount);

        
    }
}
