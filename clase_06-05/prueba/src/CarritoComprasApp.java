import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

// Clase Producto
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

// Clase Carrito
class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}

// Clase principal con JFrame
public class CarritoComprasApp extends JFrame {
    private Carrito carrito;
    private DefaultListModel<String> modeloLista;
    private JLabel totalLabel;

    public CarritoComprasApp() {
        carrito = new Carrito();
        modeloLista = new DefaultListModel<>();

        setTitle("Carrito de Compras - Verduras");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Colores de la paleta vegana
        Color fondoPrincipal = new Color(240, 255, 240); // Verde claro
        Color fondoPanel = new Color(200, 230, 201); // Verde suave
        Color textoColor = new Color(85, 107, 47); // Verde oscuro
        Color botonColor = new Color(255, 248, 220); // Beige
        Color bordeBoton = new Color(139, 69, 19); // Marrón

        // Configuración de colores
        getContentPane().setBackground(fondoPrincipal);

        // Panel de productos
        JPanel panelProductos = new JPanel();
        panelProductos.setLayout(new GridLayout(10, 1));
        panelProductos.setBackground(fondoPanel);

        // Crear botones para 10 productos de verduras
        String[] nombresVerduras = {
            "Tomate", "Cebolla", "Zanahoria", "Papa", "Lechuga",
            "Pepino", "Pimiento", "Espinaca", "Calabacín", "Brócoli"
        };
        double[] preciosVerduras = {1.5, 0.8, 1.2, 0.6, 1.0, 0.9, 1.3, 1.4, 1.1, 1.6};

        for (int i = 0; i < nombresVerduras.length; i++) {
            String nombre = nombresVerduras[i];
            double precio = preciosVerduras[i];
            JButton btnProducto = new JButton(nombre + " - $" + precio);
            btnProducto.setBackground(botonColor);
            btnProducto.setForeground(textoColor);
            btnProducto.setFocusPainted(false);
            btnProducto.setBorder(BorderFactory.createLineBorder(bordeBoton, 2));
            btnProducto.addActionListener(e -> agregarProducto(new Producto(nombre, precio)));
            panelProductos.add(btnProducto);
        }

        add(panelProductos, BorderLayout.WEST);

        // Lista de carrito
        JList<String> listaCarrito = new JList<>(modeloLista);
        listaCarrito.setBackground(fondoPanel);
        listaCarrito.setForeground(textoColor);
        listaCarrito.setFont(new Font("Arial", Font.PLAIN, 14));
        add(new JScrollPane(listaCarrito), BorderLayout.CENTER);

        // Panel inferior
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.setBackground(fondoPanel);

        totalLabel = new JLabel("Total: $0.0");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        totalLabel.setForeground(textoColor);
        panelInferior.add(totalLabel, BorderLayout.WEST);

        JButton btnFinalizar = new JButton("Finalizar Compra");
        btnFinalizar.setFont(new Font("Arial", Font.BOLD, 14));
        btnFinalizar.setBackground(botonColor);
        btnFinalizar.setForeground(textoColor);
        btnFinalizar.setFocusPainted(false);
        btnFinalizar.setBorder(BorderFactory.createLineBorder(bordeBoton, 2));
        panelInferior.add(btnFinalizar, BorderLayout.EAST);

        add(panelInferior, BorderLayout.SOUTH);

        // Evento para finalizar compra
        btnFinalizar.addActionListener(e -> mostrarBoleta());
    }

    private void agregarProducto(Producto producto) {
        carrito.agregarProducto(producto);
        modeloLista.addElement(producto.toString());
        actualizarTotal();
    }

    private void actualizarTotal() {
        totalLabel.setText("Total: $" + carrito.calcularTotal());
    }

    private void mostrarBoleta() {
        JFrame boletaFrame = new JFrame("Boleta de Compra");
        boletaFrame.setSize(400, 300);
        boletaFrame.setLayout(new BorderLayout());

        JTextArea boletaArea = new JTextArea();
        boletaArea.setEditable(false);
        boletaArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        boletaArea.setBackground(new Color(255, 248, 220)); // Beige
        boletaArea.setForeground(new Color(85, 107, 47)); // Verde oscuro

        StringBuilder boleta = new StringBuilder("Boleta de Compra\n\n");
        for (Producto producto : carrito.getProductos()) {
            boleta.append(producto.getNombre()).append(" - $").append(producto.getPrecio()).append("\n");
        }
        boleta.append("\nTotal: $").append(carrito.calcularTotal());

        boletaArea.setText(boleta.toString());
        boletaFrame.add(new JScrollPane(boletaArea), BorderLayout.CENTER);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBackground(new Color(200, 230, 201)); // Verde suave
        btnCerrar.setForeground(new Color(85, 107, 47)); // Verde oscuro
        btnCerrar.addActionListener(e -> boletaFrame.dispose());
        boletaFrame.add(btnCerrar, BorderLayout.SOUTH);

        boletaFrame.setVisible(true);

        // Reiniciar el carrito
        carrito = new Carrito();
        modeloLista.clear();
        actualizarTotal();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CarritoComprasApp app = new CarritoComprasApp();
            app.setVisible(true);
        });
    }
}