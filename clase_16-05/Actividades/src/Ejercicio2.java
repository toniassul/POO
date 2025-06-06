import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {
    private JTextField digito1Field;
    private JTextField digito2Field;
    private JTextField sumaField;
    private JTextField restaField;
    private JTextField multiplicacionField;
    private JTextField divisionField;
    private JButton calcularButton;
    
    public Ejercicio2() {
        setTitle("Ascue Sulca George Anthony");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);
        
        // Título
        JLabel titleLabel = new JLabel("Suma, Resta, Multiplicación y División de dos dígitos:");
        titleLabel.setBounds(50, 20, 300, 30);
        mainPanel.add(titleLabel);
        
        // Dígito 1
        JLabel dig1Label = new JLabel("Dígito 1:");
        dig1Label.setBounds(50, 60, 100, 25);
        mainPanel.add(dig1Label);
        
        digito1Field = new JTextField();
        digito1Field.setBounds(200, 60, 100, 25);
        mainPanel.add(digito1Field);
        
        // Dígito 2
        JLabel dig2Label = new JLabel("Dígito 2:");
        dig2Label.setBounds(50, 100, 100, 25);
        mainPanel.add(dig2Label);
        
        digito2Field = new JTextField();
        digito2Field.setBounds(200, 100, 100, 25);
        mainPanel.add(digito2Field);
        
        // Suma
        JLabel sumaLabel = new JLabel("Suma:");
        sumaLabel.setBounds(50, 140, 100, 25);
        mainPanel.add(sumaLabel);
        
        sumaField = new JTextField();
        sumaField.setBounds(200, 140, 100, 25);
        sumaField.setEditable(false);
        mainPanel.add(sumaField);
        
        // Resta
        JLabel restaLabel = new JLabel("Resta:");
        restaLabel.setBounds(50, 180, 100, 25);
        mainPanel.add(restaLabel);
        
        restaField = new JTextField();
        restaField.setBounds(200, 180, 100, 25);
        restaField.setEditable(false);
        mainPanel.add(restaField);
        
        // Multiplicación
        JLabel multLabel = new JLabel("Multiplicación:");
        multLabel.setBounds(50, 220, 100, 25);
        mainPanel.add(multLabel);
        
        multiplicacionField = new JTextField();
        multiplicacionField.setBounds(200, 220, 100, 25);
        multiplicacionField.setEditable(false);
        mainPanel.add(multiplicacionField);
        
        // División
        JLabel divLabel = new JLabel("División:");
        divLabel.setBounds(50, 260, 100, 25);
        mainPanel.add(divLabel);
        
        divisionField = new JTextField();
        divisionField.setBounds(200, 260, 100, 25);
        divisionField.setEditable(false);
        mainPanel.add(divisionField);
        
        // Botón Calcular
        calcularButton = new JButton("Calcular datos");
        calcularButton.setBounds(150, 300, 120, 30);
        mainPanel.add(calcularButton);
        
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(digito1Field.getText());
                    double num2 = Double.parseDouble(digito2Field.getText());
                    
                    sumaField.setText(String.valueOf(num1 + num2));
                    restaField.setText(String.valueOf(num1 - num2));
                    multiplicacionField.setText(String.valueOf(num1 * num2));
                    
                    if (num2 != 0) {
                        divisionField.setText(String.valueOf(num1 / num2));
                    } else {
                        divisionField.setText("Error: División por cero");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese números válidos", 
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
                new Ejercicio2().setVisible(true);
            }
        });
    }
}
