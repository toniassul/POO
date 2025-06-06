import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame {
    private JTextField numero1Field;
    private JTextField numero2Field;
    private JTextField resultadoField;
    private JButton sumarButton;
    
    public Ejercicio1() {
        // Configuración básica de la ventana
        setTitle("Ascue Sulca George Anthony");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        // Crear el panel principal con color rojo
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.RED);
        
        // Título
        JLabel titleLabel = new JLabel("SUMA DE DOS NÚMEROS ENTEROS");
        titleLabel.setBounds(100, 20, 250, 30);
        titleLabel.setForeground(Color.WHITE);
        mainPanel.add(titleLabel);
        
        // Número 1
        JLabel num1Label = new JLabel("Ingrese el numero 1");
        num1Label.setBounds(50, 70, 150, 25);
        num1Label.setForeground(Color.WHITE);
        mainPanel.add(num1Label);
        
        numero1Field = new JTextField();
        numero1Field.setBounds(200, 70, 100, 25);
        mainPanel.add(numero1Field);
        
        // Número 2
        JLabel num2Label = new JLabel("Ingrese el numero 2");
        num2Label.setBounds(50, 110, 150, 25);
        num2Label.setForeground(Color.WHITE);
        mainPanel.add(num2Label);
        
        numero2Field = new JTextField();
        numero2Field.setBounds(200, 110, 100, 25);
        mainPanel.add(numero2Field);
        
        // Resultado
        JLabel resultLabel = new JLabel("La suma es");
        resultLabel.setBounds(50, 150, 100, 25);
        resultLabel.setForeground(Color.WHITE);
        mainPanel.add(resultLabel);
        
        resultadoField = new JTextField();
        resultadoField.setBounds(200, 150, 100, 25);
        resultadoField.setEditable(false);
        mainPanel.add(resultadoField);
        
        // Botón Sumar
        sumarButton = new JButton("SUMAR");
        sumarButton.setBounds(150, 200, 100, 30);
        mainPanel.add(sumarButton);
        
        // ActionListener para el botón
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numero1Field.getText());
                    int num2 = Integer.parseInt(numero2Field.getText());
                    int suma = num1 + num2;
                    resultadoField.setText(String.valueOf(suma));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese números válidos", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Agregar el panel a la ventana
        add(mainPanel);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }
}
