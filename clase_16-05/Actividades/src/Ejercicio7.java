import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Ejercicio7 extends JFrame {
    private JTextField weightField;
    private JTextField heightField;
    private JTextField imcField;
    private JTextField categoryField;
    private JTextArea explanationArea;
    
    public Ejercicio7() {
        setTitle("Ascue Sulca George Anthony");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(230, 255, 230)); // Light green background
        
        // Title
        JLabel titleLabel = new JLabel("Calculadora de Índice de Masa Corporal (IMC)");
        titleLabel.setBounds(50, 20, 400, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        mainPanel.add(titleLabel);
        
        // Weight input
        JLabel weightLabel = new JLabel("Peso (kg):");
        weightLabel.setBounds(50, 70, 100, 25);
        mainPanel.add(weightLabel);
        
        weightField = new JTextField();
        weightField.setBounds(150, 70, 100, 25);
        mainPanel.add(weightField);
          // Height input
        JLabel heightLabel = new JLabel("Altura (cm):");
        heightLabel.setBounds(50, 110, 100, 25);
        mainPanel.add(heightLabel);
        
        heightField = new JTextField();
        heightField.setBounds(150, 110, 100, 25);
        mainPanel.add(heightField);
        
        // Calculate button
        JButton calculateButton = new JButton("Calcular IMC");
        calculateButton.setBounds(100, 160, 150, 30);
        mainPanel.add(calculateButton);
        
        // Results
        JLabel imcLabel = new JLabel("Su IMC es:");
        imcLabel.setBounds(50, 210, 100, 25);
        mainPanel.add(imcLabel);
        
        imcField = new JTextField();
        imcField.setBounds(150, 210, 100, 25);
        imcField.setEditable(false);
        mainPanel.add(imcField);
        
        JLabel categoryLabel = new JLabel("Categoría:");
        categoryLabel.setBounds(50, 250, 100, 25);
        mainPanel.add(categoryLabel);
        
        categoryField = new JTextField();
        categoryField.setBounds(150, 250, 200, 25);
        categoryField.setEditable(false);
        mainPanel.add(categoryField);
        
        // Explanation area
        explanationArea = new JTextArea();
        explanationArea.setWrapStyleWord(true);
        explanationArea.setLineWrap(true);
        explanationArea.setOpaque(false);
        explanationArea.setEditable(false);
        explanationArea.setBounds(50, 290, 400, 150);
        mainPanel.add(explanationArea);
        
        // Calculate button action
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());

                    
                    // Validate input
                    if (weight <= 0 || height <= 0) {
                        JOptionPane.showMessageDialog(null,
                            "Por favor ingrese valores positivos",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                      // Convert height from cm to meters
                    double heightInMeters = height / 100.0;
                    
                    // Calculate BMI
                    double imc = weight / (heightInMeters * heightInMeters);
                    
                    // Format result to 2 decimal places
                    DecimalFormat df = new DecimalFormat("#.##");
                    String imcStr = df.format(imc);

                    imcField.setText(imcStr);
                    
                    // Determine category
                    String category;
                    String explanation;
                    
                    if (imc < 18.5) {
                        category = "Bajo peso";
                        explanation = "Un IMC menor a 18.5 indica bajo peso. " +
                                    "Se recomienda consultar con un profesional de la salud.";
                    } else if (imc < 25) {
                        category = "Peso normal";
                        explanation = "Su peso está dentro del rango normal. " +
                                    "Mantener un estilo de vida saludable es importante.";
                    } else if (imc < 30) {
                        category = "Sobrepeso";
                        explanation = "Un IMC entre 25 y 30 indica sobrepeso. " +
                                    "Considere mejorar sus hábitos alimenticios y hacer ejercicio.";
                    } else {
                        category = "Obesidad";
                        explanation = "Un IMC mayor a 30 indica obesidad. " +
                                    "Se recomienda consultar con un profesional de la salud.";
                    }
                    
                    categoryField.setText(category);                    explanationArea.setText("Resultado del cálculo:\n\n" +
                        "Peso: " + weight + " kg\n" +
                        "Altura: " + height + " cm (" + String.format("%.2f", heightInMeters) + " m)\n" +
                        "IMC = " + weight + " / (" + String.format("%.2f", heightInMeters) + ")² = " + imcStr + " kg/m²\n\n" +
                        explanation);
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                        "Por favor ingrese valores numéricos válidos\n" +
                        "Ejemplo: Peso: 60.5, Altura: 1.65",
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
                new Ejercicio7().setVisible(true);
            }
        });
    }
}
