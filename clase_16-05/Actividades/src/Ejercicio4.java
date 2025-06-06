import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class Ejercicio4 extends JFrame {
    private JTextField nameField;
    private JButton greetButton;
    
    public Ejercicio4() {
        setTitle("Ascue Sulca George Anthony");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);
        
        
        JLabel nameLabel = new JLabel("Ingrese su nombre");
        nameLabel.setBounds(30, 10, 150, 25);
        mainPanel.add(nameLabel);


        nameField = new JTextField();
        nameField.setBounds(50, 40, 250, 25);
        mainPanel.add(nameField);
        
        // Greet button
        greetButton = new JButton("¡Saludar!");
        greetButton.setBounds(125, 80, 100, 30);
        mainPanel.add(greetButton);
        
        greetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (name.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, 
                        "Por favor ingrese un nombre", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                String greeting;
                
                if (hour >= 5 && hour < 12) {
                    greeting = "Buenos días";
                } else if (hour >= 12 && hour < 18) {
                    greeting = "Buenas tardes";
                } else {
                    greeting = "Buenas noches";
                }
                
                JOptionPane.showMessageDialog(null, 
                    greeting + ", " + name, 
                    "Saludo", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        add(mainPanel);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }
}
