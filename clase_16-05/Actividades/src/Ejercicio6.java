import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio6 extends JFrame {
    private JTextField fatherHeightField;
    private JTextField motherHeightField;
    private JComboBox<String> genderCombo;
    private JTextField resultField;
    private JTextField rangeField;
    
    public Ejercicio6() {
        setTitle("Ascue Sulca George Anthony");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(240, 248, 255)); // Light blue background
        
        // Title
        JLabel titleLabel = new JLabel("Calculadora de Talla Diana");
        titleLabel.setBounds(150, 20, 300, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(titleLabel);
        
        // Father's height
        JLabel fatherLabel = new JLabel("Talla del padre (cm):");
        fatherLabel.setBounds(50, 70, 150, 25);
        mainPanel.add(fatherLabel);
        
        fatherHeightField = new JTextField();
        fatherHeightField.setBounds(200, 70, 100, 25);
        mainPanel.add(fatherHeightField);
        
        // Mother's height
        JLabel motherLabel = new JLabel("Talla de la madre (cm):");
        motherLabel.setBounds(50, 110, 150, 25);
        mainPanel.add(motherLabel);
        
        motherHeightField = new JTextField();
        motherHeightField.setBounds(200, 110, 100, 25);
        mainPanel.add(motherHeightField);
        
        // Gender selection
        JLabel genderLabel = new JLabel("Género del niño/a:");
        genderLabel.setBounds(50, 150, 150, 25);
        mainPanel.add(genderLabel);
        
        String[] genders = {"Masculino", "Femenino"};
        genderCombo = new JComboBox<>(genders);
        genderCombo.setBounds(200, 150, 100, 25);
        mainPanel.add(genderCombo);
        
        // Calculate button
        JButton calculateButton = new JButton("Calcular Talla Diana");
        calculateButton.setBounds(150, 200, 200, 30);
        mainPanel.add(calculateButton);
        
        // Results
        JLabel resultLabel = new JLabel("Talla Diana estimada:");
        resultLabel.setBounds(50, 250, 150, 25);
        mainPanel.add(resultLabel);
        
        resultField = new JTextField();
        resultField.setBounds(200, 250, 100, 25);
        resultField.setEditable(false);
        mainPanel.add(resultField);
        
        JLabel rangeLabel = new JLabel("Rango aproximado:");
        rangeLabel.setBounds(50, 290, 150, 25);
        mainPanel.add(rangeLabel);
        
        rangeField = new JTextField();
        rangeField.setBounds(200, 290, 200, 25);
        rangeField.setEditable(false);
        mainPanel.add(rangeField);
        
        // Calculate button action
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fatherHeight = Double.parseDouble(fatherHeightField.getText());
                    double motherHeight = Double.parseDouble(motherHeightField.getText());
                    boolean isMale = genderCombo.getSelectedIndex() == 0;
                    
                    // Validate input
                    if (fatherHeight < 100 || fatherHeight > 250 || 
                        motherHeight < 100 || motherHeight > 250) {
                        JOptionPane.showMessageDialog(null,
                            "Por favor ingrese tallas válidas (entre 100 y 250 cm)",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    double targetHeight;
                    double variation;
                    
                    if (isMale) {
                        // Fórmula para niños
                        targetHeight = (fatherHeight + motherHeight + 13) / 2;
                        variation = 10; // ±10 cm para niños
                    } else {
                        // Fórmula para niñas
                        targetHeight = (fatherHeight + motherHeight - 13) / 2;
                        variation = 9; // ±9 cm para niñas
                    }
                    
                    resultField.setText(String.format("%.1f cm", targetHeight));
                    rangeField.setText(String.format("%.1f - %.1f cm", 
                        targetHeight - variation, 
                        targetHeight + variation));
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                        "Por favor ingrese valores numéricos válidos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Add explanation text
        JTextArea explanationText = new JTextArea(
            "La Talla Diana es una estimación de la altura adulta " +
            "basada en la talla de los padres. Este cálculo es aproximado " +
            "y puede variar según diversos factores.");
        explanationText.setBounds(50, 330, 400, 70);
        explanationText.setLineWrap(true);
        explanationText.setWrapStyleWord(true);
        explanationText.setOpaque(false);
        explanationText.setEditable(false);
        mainPanel.add(explanationText);
        
        add(mainPanel);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio6().setVisible(true);
            }
        });
    }
}
