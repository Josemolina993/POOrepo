import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase TrianguloEquilatero
class TrianguloEquilatero {
    private double lado;

    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    // Métodos para calcular el perímetro, la altura y el área
    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    // Getter
    public double getLado() {
        return lado;
    }
}

// Interfaz gráfica
public class CalculoTrianguloEquilatero {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PROGRAMA: Perimetro, Área y Altura de triángulo equilátero");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Componentes
        JLabel lblLado = new JLabel("Lado del triángulo:");
        JTextField txtLado = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JLabel lblResultados = new JLabel("RESULTADOS", SwingConstants.CENTER);
        JButton btnLimpiar = new JButton("Limpiar");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Configuración de colores de botones y estilos
        btnCalcular.setBackground(new Color(173, 216, 230)); // Azul pastel
        btnLimpiar.setBackground(new Color(255, 192, 203));  // Rosa pastel
        lblResultados.setFont(new Font("Arial", Font.BOLD, 14));

        // Agregar componentes al frame en el orden correcto para que aparezcan correctamente
        frame.add(lblLado);
        frame.add(txtLado);
        frame.add(btnCalcular);
        frame.add(btnLimpiar);
        frame.add(lblResultados);
        frame.add(txtResultado);

        // Acción del botón Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(txtLado.getText());

                    // Crear objeto TrianguloEquilatero y realizar cálculos
                    TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);
                    double perimetro = triangulo.calcularPerimetro();
                    double altura = triangulo.calcularAltura();
                    double area = triangulo.calcularArea();

                    // Mostrar resultados
                    txtResultado.setText("Lado: " + lado + "\n" +
                                         "Perímetro: " + String.format("%.2f", perimetro) + "\n" +
                                         "Altura: " + String.format("%.2f", altura) + "\n" +
                                         "Área: " + String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese un valor válido para el lado.");
                }
            }
        });

        // Acción del botón Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar todos los campos
                txtLado.setText("");
                txtResultado.setText("");
            }
        });

        // Acción al cerrar la ventana
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                MenuPrincipal.main(null); // Volver al menú principal
            }
        });

        // Mostrar frame
        frame.setVisible(true);
    }
}
