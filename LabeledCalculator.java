import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabeledCalculator extends JFrame {
    private JTextField textField1, textField2;
    private JButton calculateButton;
    private JLabel resultLabel;

    public LabeledCalculator() {
        // Set up the JFrame
        setTitle("Labeled Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel label1 = new JLabel("First Value:");
        JLabel label2 = new JLabel("Second Value:");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Result: ");

        // Set layout
        setLayout(new GroupLayout(getContentPane()));
        GroupLayout layout = (GroupLayout) getContentPane().getLayout();

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label1)
                        .addComponent(textField1)
                        .addComponent(label2)
                        .addComponent(textField2)
                        .addComponent(calculateButton)
                        .addComponent(resultLabel))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(label1)
                .addComponent(textField1)
                .addComponent(label2)
                .addComponent(textField2)
                .addComponent(calculateButton)
                .addComponent(resultLabel)
        );

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
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException ex) {
            // Handle the case where input is not a valid number
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LabeledCalculator().setVisible(true);
            }
        });
    }
}
