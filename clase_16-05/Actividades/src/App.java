import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public App() {
        setTitle("Menú Principal de Ejercicios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 550);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Seleccione un ejercicio para visualizar:", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        mainPanel.add(title, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(7, 1, 15, 15));
        buttonPanel.setBackground(new Color(255, 255, 255));
        buttonPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(100, 149, 237), 2),
            BorderFactory.createEmptyBorder(20, 30, 20, 30)
        ));

        String[] labels = {
            "Ejercicio 1: Suma de dos números",
            "Ejercicio 2: Calculadora básica",
            "Ejercicio 3: Login",
            "Ejercicio 4: Saludo según hora",
            "Ejercicio 5: Calcular edad",
            "Ejercicio 6: Talla Diana",
            "Ejercicio 7: Calculadora IMC"
        };

        for (int i = 0; i < labels.length; i++) {
            JButton btn = new JButton(labels[i]);
            btn.setFont(new Font("Arial", Font.PLAIN, 15));
            btn.setBackground(new Color(100, 149, 237));
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(65, 105, 225), 1),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
            ));
            int idx = i;
            btn.addActionListener(e -> {
                JFrame ejercicio = null;
                switch (idx) {
                    case 0: ejercicio = new Ejercicio1(); break;
                    case 1: ejercicio = new Ejercicio2(); break;
                    case 2: ejercicio = new Ejercicio3(); break;
                    case 3: ejercicio = new Ejercicio4(); break;
                    case 4: ejercicio = new Ejercicio5(); break;
                    case 5: ejercicio = new Ejercicio6(); break;
                    case 6: ejercicio = new Ejercicio7(); break;
                }
                if (ejercicio != null) {
                    ejercicio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ejercicio.setVisible(true);
                }
            });
            buttonPanel.add(btn);
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Espacio para el nombre en la parte inferior
        JLabel nameLabel = new JLabel("Diseñado por: George Anthony Ascue Sulca", JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.ITALIC, 15));
        nameLabel.setForeground(new Color(70, 70, 70));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        mainPanel.add(nameLabel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
}
