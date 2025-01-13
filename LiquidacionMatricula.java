import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiquidacionMatricula {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Liquidación de Matrícula");  
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 2));

        // Componentes
        JLabel lblInscripcion = new JLabel("Número de inscripción:");
        JTextField txtInscripcion = new JTextField();
        JLabel lblNombres = new JLabel("Nombres del estudiante:");
        JTextField txtNombres = new JTextField();
        JLabel lblPatrimonio = new JLabel("Patrimonio:");
        JTextField txtPatrimonio = new JTextField();
        JLabel lblEstrato = new JLabel("Estrato social:");
        JTextField txtEstrato = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JButton btnLimpiar = new JButton("Limpiar");
        JLabel lblResultados = new JLabel("RESULTADOS", SwingConstants.CENTER);
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Configuración de colores y estilo
        btnCalcular.setBackground(new Color(144, 238, 144)); // Verde pastel
        btnLimpiar.setBackground(new Color(255, 182, 193));  // Rojo pastel
        lblResultados.setFont(new Font("Arial", Font.BOLD, 14));

        // Agregar componentes al frame en el orden correcto para que aparezcan correctamente
        frame.add(lblInscripcion);
        frame.add(txtInscripcion);
        frame.add(lblNombres);
        frame.add(txtNombres);
        frame.add(lblPatrimonio);
        frame.add(txtPatrimonio);
        frame.add(lblEstrato);
        frame.add(txtEstrato);
        frame.add(btnCalcular);
        frame.add(btnLimpiar);
        frame.add(lblResultados);
        frame.add(txtResultado);

        // Acción del botón Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String inscripcion = txtInscripcion.getText();
                    String nombres = txtNombres.getText();
                    double patrimonio = Double.parseDouble(txtPatrimonio.getText());
                    int estrato = Integer.parseInt(txtEstrato.getText());

                    // Cálculo del pago por matrícula
                    double pagoMatricula = 50000; // Valor base
                    if (patrimonio > 2000000 && estrato > 3) {
                        pagoMatricula += 0.03 * patrimonio;
                    }

                    // Mostrar resultados
                    txtResultado.setText("El estudiante con número de inscripción " + inscripcion + "\n" +
                                         "y nombre " + nombres + " debe pagar: $" + String.format("%.2f", pagoMatricula));
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores numéricos válidos para patrimonio y estrato.");
                }
            }
        });

        // Acción del botón Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar todos los campos
                txtInscripcion.setText("");
                txtNombres.setText("");
                txtPatrimonio.setText("");
                txtEstrato.setText("");
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
