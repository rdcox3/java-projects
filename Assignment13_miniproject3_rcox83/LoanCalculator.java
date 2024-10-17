/*
Ron Cox
Java 605.201.83
Assignment 13 Mini Project #3
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.text.NumberFormat;

public class LoanCalculator extends JFrame {
    // Define text fields and buttons as class fields for access across all methods
    private JTextField annualInterestRateField = new JTextField(10);
    private JTextField numberOfYearsField = new JTextField(10);
    private JTextField loanAmountField = new JTextField(10);
    private JTextField monthlyPaymentField = new JTextField(10);
    private JTextField totalPaymentField = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");

    public LoanCalculator() {
        // Layout setup
        setLayout(new BorderLayout());
        setSize(400, 300);
        setTitle("Loan Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel setup
        JPanel mainPanel = new JPanel(new BorderLayout());
	int outerPadding = 20;
	mainPanel.setBorder(BorderFactory.createEmptyBorder(outerPadding, outerPadding, outerPadding, outerPadding));
	JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 cols, with gaps
        formPanel.add(new JLabel("Annual Interest Rate:"));
        formPanel.add(annualInterestRateField);
        formPanel.add(new JLabel("Number of Years:"));
        formPanel.add(numberOfYearsField);
        formPanel.add(new JLabel("Loan Amount:"));
        formPanel.add(loanAmountField);
        formPanel.add(new JLabel("Monthly Payment:"));
        formPanel.add(monthlyPaymentField);
        monthlyPaymentField.setEditable(false); // This field is not editable; it's for display only
        formPanel.add(new JLabel("Total Payment:"));
        formPanel.add(totalPaymentField);
        totalPaymentField.setEditable(false); // This field is not editable; it's for display only

        // Adding formPanel to the main panel
        mainPanel.add(formPanel, BorderLayout.CENTER);

	// Adding components to frame
        add(mainPanel, BorderLayout.CENTER);
        add(calculateButton, BorderLayout.SOUTH);

        // Action listener for calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateLoanPayment();
            }
        });
    }

    private void calculateLoanPayment() {
        // Parse input values
        double interestRate = Double.parseDouble(annualInterestRateField.getText());
        int numberOfYears = Integer.parseInt(numberOfYearsField.getText());
        double loanAmount = Double.parseDouble(loanAmountField.getText());

        // Calculate monthly interest rate and number of payments
        double monthlyInterestRate = interestRate / 100 / 12;
        int numberOfPayments = numberOfYears * 12;

        // Calculate monthly payment and total payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfPayments)));
        double totalPayment = monthlyPayment * numberOfPayments;

	// Get currency instance to format numbers as currency
    	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        // Set calculated values to fields
 	monthlyPaymentField.setText(currencyFormat.format(monthlyPayment));
    	totalPaymentField.setText(currencyFormat.format(totalPayment));
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoanCalculator().setVisible(true);
            }
        });
    }
}//end class LoanCalculator
