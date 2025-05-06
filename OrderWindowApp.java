// import java.util.Scanner;

// public class OrderApp {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Display menu
//         System.out.println("Welcome to Carlos' Fast Food!");
//         System.out.println("Please choose an item to order:");
//         System.out.println("1. Burger - $5.99");
//         System.out.println("2. Fries - $2.99");
//         System.out.println("3. Soda - $1.99");

//         // Get user choice
//         System.out.print("Enter the number of the item you want to order: ");
//         int choice = input.nextInt();

//         double price = 0;
//         String itemName = "";

//         // Handle choice
//         switch (choice) {
//             case 1:
//                 itemName = "Burger";
//                 price = 5.99;
//                 break;
//             case 2:
//                 itemName = "Fries";
//                 price = 2.99;
//                 break;
//             case 3:
//                 itemName = "Soda";
//                 price = 1.99;
//                 break;
//             default:
//                 System.out.println("Invalid choice. Please restart the app.");
//                 System.exit(0);  // Exit if choice is invalid
//         }

//         // Ask quantity
//         System.out.print("How many " + itemName + "(s) would you like to order? ");
//         int quantity = input.nextInt();

//         // Calculate total
//         double total = price * quantity;

//         // Print order summary
//         System.out.println("\nOrder Summary:");
//         System.out.println(quantity + " x " + itemName + " = $" + String.format("%.2f", total));
//         System.out.println("Thank you for ordering!");

//         input.close();
//     }
// }
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderWindowApp {
    public static void main(String[] args) {
        // Create the window (JFrame)
        JFrame frame = new JFrame("Carlos' Burger Order");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // No layout manager

        // Label
        JLabel label = new JLabel("Enter number of Burgers:");
        label.setBounds(50, 50, 200, 30);
        frame.add(label);

        // Text field for quantity
        JTextField quantityField = new JTextField();
        quantityField.setBounds(200, 50, 100, 30);
        frame.add(quantityField);

        // Order button
        JButton orderButton = new JButton("Place Order");
        orderButton.setBounds(120, 100, 150, 40);
        frame.add(orderButton);

        // Result label
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 160, 300, 30);
        frame.add(resultLabel);

        // Button action
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int quantity = Integer.parseInt(quantityField.getText());
                    double pricePerBurger = 5.99;
                    double total = quantity * pricePerBurger;

                    resultLabel.setText("Total price: $" + String.format("%.2f", total));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                } 
            }
        });

        // Show the window
        frame.setVisible(true);
    }
}
