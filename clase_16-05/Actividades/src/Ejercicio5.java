import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio5 extends JFrame {
    private JTextField nameField;
    private JTextField birthYearField;
    private JTextField currentYearField;
    private JTextField ageField;
    private JTextField statusField;
    private JButton calculateButton;
    
    public Ejercicio5() {
        setTitle("Ascue Sulca George Anthony");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.LIGHT_GRAY);
    
        JLabel tituloLabel = new JLabel("Calculadora de Edad");
        tituloLabel.setBounds(70, 5, 150, 25);
        mainPanel.add(tituloLabel);
        
        // Name input
        JLabel nameLabel = new JLabel("Ingrese su nombre");
        nameLabel.setBounds(30, 30, 150, 25);
        mainPanel.add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(250, 30, 150, 25);
        mainPanel.add(nameField);
        
        // Birth year input
        JLabel birthLabel = new JLabel("Ingrese el año de nacimiento");
        birthLabel.setBounds(30, 70, 150, 25);
        mainPanel.add(birthLabel);
        
        birthYearField = new JTextField();
        birthYearField.setBounds(250, 70, 150, 25);
        mainPanel.add(birthYearField);
        
        // Current year input
        JLabel currentLabel = new JLabel("Ingrese el año actual");
        currentLabel.setBounds(30, 110, 150, 25);
        mainPanel.add(currentLabel);
        
        currentYearField = new JTextField();
        currentYearField.setBounds(250, 110, 150, 25);
        mainPanel.add(currentYearField);
        
        // Age result
        JLabel ageLabel = new JLabel("Usted tiene");
        ageLabel.setBounds(30, 150, 100, 25);
        mainPanel.add(ageLabel);
        
        ageField = new JTextField("años");
        ageField.setBounds(110, 150, 50, 25);
        ageField.setEditable(false);
        mainPanel.add(ageField);
        
        // Status result
        JLabel statusLabel = new JLabel("Usted es");
        statusLabel.setBounds(30, 190, 100, 25);
        mainPanel.add(statusLabel);
        
        statusField = new JTextField();
        statusField.setBounds(110, 190, 240, 25);
        statusField.setEditable(false);
        mainPanel.add(statusField);
        
        // Calculate button
        calculateButton = new JButton("CALCULAR");
        calculateButton.setBounds(150, 230, 100, 30);
        mainPanel.add(calculateButton);
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int birthYear = Integer.parseInt(birthYearField.getText());
                    int currentYear = Integer.parseInt(currentYearField.getText());
                    
                    if (currentYear < birthYear) {
                        JOptionPane.showMessageDialog(null, 
                            "El año actual no puede ser menor al año de nacimiento", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    int age = currentYear - birthYear;
                    ageField.setText(String.valueOf(age));
                    
                    String status = (age >= 18) ? "Mayor de edad" : "Menor de edad";
                    statusField.setText(status);
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese años válidos", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        add(mainPanel);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio5().setVisible(true);
            }
        });
    }
}
