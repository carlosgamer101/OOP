import javax.swing.plaf.synth.SynthSliderUI;
import java.util.Scanner;

public class ClassT {
    //INSTANCE VARIABLE-Space is created for it everytime
    int x,y,z;
    String OOP;

    //STATIC VARIABLE/ CLASS VARIABLES-ONLY ONE COPY/INSTANCE 
    static double weight;

    String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }

    public int Add(){
        return 7+8;
    }

    public int sum(int i){
        int total=i;
        for (int j=1;j<=10;j++){
            total=total+j;
        }
        return total;
    }
    public int series(int termPosition) {
        int firstTerm = 2;
        int difference = 3;
        return firstTerm + (termPosition - 1) * difference;
    }
    public static void displayEvenNumbers(int start) {
        for (int i = start; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void readAndDisplayStudents() {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        int[] ages = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the first name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.println("\n Student InformatioN");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }

        scanner.close();
    }
    public static void main(String[] args) {
        //LOCAL VARIABLES-will be unknown outside main method
        // int value;
        ClassT obj = new ClassT();
        // System.out.println("7 + 8 is "+obj.Add());
        // System.out.println(" CHECK POSITION "+obj.series(10));
        // displayEvenNumbers(1);
        obj.readAndDisplayStudents();
    }
}
