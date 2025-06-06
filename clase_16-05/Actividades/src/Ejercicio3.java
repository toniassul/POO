import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio3 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton clearButton;
    
    public Ejercicio3() {
        setTitle("Design Preview (Logueo)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);

                // Username field
        JLabel nombreCompletoLabel = new JLabel("Ascue Sulca George Anthony");
        nombreCompletoLabel.setBounds(100, 160, 180, 25);
        mainPanel.add(nombreCompletoLabel);
        
        // Username field
        JLabel userLabel = new JLabel("Ingrese Su Nombre:");
        userLabel.setBounds(50, 40, 150, 25);
        mainPanel.add(userLabel);
        
        usernameField = new JTextField();
        usernameField.setBounds(180, 40, 120, 25);
        mainPanel.add(usernameField);
        
        // Password field
        JLabel passLabel = new JLabel("Ingrese su Password:");
        passLabel.setBounds(50, 80, 150, 25);
        mainPanel.add(passLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(180, 80, 120, 25);
        mainPanel.add(passwordField);
        
        // Buttons
        loginButton = new JButton("Ingresar");
        loginButton.setBounds(70, 130, 90, 25);
        mainPanel.add(loginButton);
        
        clearButton = new JButton("Limpiar");
        clearButton.setBounds(190, 130, 90, 25);
        mainPanel.add(clearButton);
        
        // Action Listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.trim().isEmpty() || password.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, 
                        "Por favor complete todos los campos", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (password.equals("admin123")) {
                    JOptionPane.showMessageDialog(null, 
                        "Contraseña correcta", 
                        "Éxito", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Contraseña incorrecta", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        
        add(mainPanel);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }
}
