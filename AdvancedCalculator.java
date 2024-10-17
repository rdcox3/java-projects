import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedCalculator extends JFrame {
    private JTextField textField1, textField2, sumTextField;
    private JButton calculateButton;
    private JLabel label1, label2;

    public AdvancedCalculator() {
        // Set up the JFrame
        setTitle("Advanced Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        label1 = new JLabel("First Value:");
        label2 = new JLabel("Second Value:");
        textField1 = new JTextField(15);
        textField2 = new JTextField(15);
        calculateButton = new JButton("Calculate");
        sumTextField = new JTextField(15);
        sumTextField.setEditable(false); // Make it non-editable

        // Set layout using GridLayout
        setLayout(new GridLayout(3, 2, 5, 5)); // 3 rows, 2 columns, and gaps of 5 pixels

        // Add components to the layout
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(calculateButton);
        add(sumTextField);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSum();
            }
        });
    }

    private void calculateSum() {
        try {
            // Get values from text fields
            double value1 = Double.parseDouble(textField1.getText());
            double value2 = Double.parseDouble(textField2.getText());

            // Calculate sum
            double sum = value1 + value2;

            // Display the result
            sumTextField.setText("Sum Is: " + sum);
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid number
            sumTextField.setText("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdvancedCalculator().setVisible(true);
            }
        });
    }
}
