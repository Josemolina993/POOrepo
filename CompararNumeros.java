import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompararNumeros {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Comparar Números");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Componentes
        JLabel lblA = new JLabel("Valor de A:");
        JTextField txtA = new JTextField();
        JLabel lblB = new JLabel("Valor de B:");
        JTextField txtB = new JTextField();
        JButton btnComparar = new JButton("Comparar");
        JButton btnLimpiar = new JButton("Limpiar");
        JLabel lblResultados = new JLabel("RESULTADOS", SwingConstants.CENTER);
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Configuración de colores y estilo
        btnComparar.setBackground(new Color(144, 238, 144)); // Verde pastel
        btnLimpiar.setBackground(new Color(255, 182, 193));  // Rojo pastel
        lblResultados.setFont(new Font("Arial", Font.BOLD, 14)); //"RESULTADOS en negrita"

        // Agregar componentes al frame en el orden correcto para que aparezcan correctamente
        frame.add(lblA);
        frame.add(txtA);
        frame.add(lblB);
        frame.add(txtB);
        frame.add(btnComparar);
        frame.add(btnLimpiar);
        frame.add(lblResultados);
        frame.add(txtResultado);

        // Acción del botón Comparar
        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());

                    // Comparar los valores de A y B
                    if (a >= 10 * b) {
                        txtResultado.setText("A es mucho mayor que B."); // si es un orden de magnitud mayor 
                    } else if (a > b) {
                        txtResultado.setText("A es mayor que B.");
                    } else if (a == b) {
                        txtResultado.setText("A es igual a B.");
                    } else {
                        txtResultado.setText("A es menor que B.");
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores numéricos válidos.");
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
