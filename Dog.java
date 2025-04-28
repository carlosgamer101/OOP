public class Dog implements Animal {
    int gross = 150000;
    public void make_sound() {
       System.out.println("The Dog says woof");
    }

    public void sleep() {
       System.out.println("Zzzzzzz");
    }

    public double netIncome (double tax){
        double gross = 150000;
        return gross*tax;

    }
    
}

