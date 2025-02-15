package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bubblegum = 202;
        double toffee = 118;
        double iceCream = 2250;
        double milkChocolate = 1680;
        double doughnut = 1075;
        double pancake = 80;
        double total = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;


        System.out.println("Earned amount:");
        System.out.println("Bubblegum:" + " " + "$" + bubblegum);
        System.out.println("Toffee:" + " " + "$" + toffee);
        System.out.println("Ice cream:" + " " + "$" + iceCream);
        System.out.println("Milk chocolate:" + " " + "$" + milkChocolate);
        System.out.println("Doughnut:" + " " + "$" + doughnut);
        System.out.println("Pancake:" + " " + "$" + pancake);
        System.out .println("\nIncome: " + "$" + total);

        System.out.println("Staff expenses:" );
        double staffExpenses = sc.nextDouble();

        System.out.println("Other expenses:" );
        double otherExpenses = sc.nextDouble();

        System.out.println("Net income: " + (total - staffExpenses - otherExpenses));


    }
}