import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ecuación de Segundo Grado");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Componentes
        JLabel lblA = new JLabel("Coeficiente A:");
        JTextField txtA = new JTextField();
        JLabel lblB = new JLabel("Coeficiente B:");
        JTextField txtB = new JTextField();
        JLabel lblC = new JLabel("Coeficiente C:");
        JTextField txtC = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JButton btnLimpiar = new JButton("Limpiar");
        JLabel lblResultados = new JLabel("SOLUCIONES de la ecuación" , SwingConstants.CENTER);
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Configuración de colores y estilo
        btnCalcular.setBackground(new Color(144, 238, 144)); // Verde pastel
        btnLimpiar.setBackground(new Color(255, 182, 193));  // Rojo pastel
        lblResultados.setFont(new Font("Arial", Font.BOLD, 14));

        // Agregar componentes al frame
        frame.add(lblA);
        frame.add(txtA);
        frame.add(lblB);
        frame.add(txtB);
        frame.add(lblC);
        frame.add(txtC);
        frame.add(btnCalcular);
        frame.add(btnLimpiar);
        frame.add(lblResultados);
        frame.add(txtResultado);

        // Acción del botón Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double c = Double.parseDouble(txtC.getText());

                    if (a == 0) {
                        txtResultado.setText("No es una ecuación de segundo grado (A no puede ser 0).");
                        return;
                    }

                    // Calcular el discriminante
                    double discriminante = b * b - 4 * a * c;

                    // Determinar las soluciones
                    if (discriminante > 0) {
                        // Dos soluciones reales
                        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                        txtResultado.setText("Dos soluciones reales:\n" +
                                             "x1 = " + String.format("%.2f", x1) + "\n" +
                                             "x2 = " + String.format("%.2f", x2));
                    } else if (discriminante == 0) {
                        // Una solución real
                        double x = -b / (2 * a);
                        txtResultado.setText("Una solución real:\n" +
                                             "x = " + String.format("%.2f", x));
                    } else {
                        // Soluciones complejas
                        double parteReal = -b / (2 * a);
                        double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                        txtResultado.setText("Dos soluciones complejas:\n" +
                                             "x1 = " + String.format("%.2f", parteReal) + " + " + 
                                             String.format("%.2f", parteImaginaria) + "i\n" +
                                             "x2 = " + String.format("%.2f", parteReal) + " - " + 
                                             String.format("%.2f", parteImaginaria) + "i");
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores numéricos válidos para A, B y C.");
                }
            }
        });

        // Acción del botón Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar todos los campos
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
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
