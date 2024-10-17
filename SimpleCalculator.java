import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField textField1, textField2, resultField;

    public SimpleCalculator() {
        // Set up the JFrame
        setTitle("Simple Calculator");
        setSize(400, 250); // Increased height to accommodate the button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        textField1 = new JTextField(10); 
        textField2 = new JTextField(10); 
        JButton calculateButton = new JButton("Calculate");
        resultField = new JTextField(10); 
        resultField.setEditable(false); // Make it non-editable
        resultField.setBackground(Color.WHITE); // Set background color to white
       
        // Create a JPanel for input components with GridLayout
        JPanel inputPanel = new JPanel(new GridLayout(2, 0, 5, 1)); // 2 rows, 2 columns, gaps
        inputPanel.add(new JLabel("First Value"));
        inputPanel.add(textField1);
        inputPanel.add(new JLabel("Second Value"));
        inputPanel.add(textField2);

 	// Create a JPanel for the button
        JPanel resultPanel = new JPanel(new GridLayout(1, 0, 5, 5)); // 2 rows, 2 columns, gaps
        resultPanel.add(new JLabel("Sum is"));
        resultPanel.add(resultField);

        // Create a JPanel for the button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        // Add panels to the frame
        add(inputPanel, BorderLayout.PAGE_START);// START to make it above the resultPanel
        add(resultPanel, BorderLayout.CENTER); 
        add(buttonPanel, BorderLayout.PAGE_END); // PAGE_END corresponds to bottom center

        // Add action listener to the Calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSum();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    // Method to calculate and update the sum
    private void calculateSum() {
        try {
            double value1 = Double.parseDouble(textField1.getText());
            double value2 = Double.parseDouble(textField2.getText());

            double sum = value1 + value2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid integer
            JOptionPane.showMessageDialog(this, "Please enter valid integers for calculation.",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleCalculator().setVisible(true);
            }
        });
    }
}
