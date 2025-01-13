import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoSalarioMensual {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de Salario Mensual");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Componentes
        JLabel lblNombre = new JLabel("Nombre del empleado:");
        JTextField txtNombre = new JTextField();
        JLabel lblSalarioHora = new JLabel("Salario básico por hora:");
        JTextField txtSalarioHora = new JTextField();
        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas en el mes:");
        JTextField txtHorasTrabajadas = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JButton btnLimpiar = new JButton("Limpiar");
        JLabel lblResultados = new JLabel("RESULTADOS", SwingConstants.CENTER);
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Configuración de colores y estilo
        btnCalcular.setBackground(new Color(144, 238, 144)); // Verde pastel
        btnLimpiar.setBackground(new Color(255, 182, 193));  // Rojo pastel
        lblResultados.setFont(new Font("Arial", Font.BOLD, 14));

        // Agregar componentes al frame
        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(lblSalarioHora);
        frame.add(txtSalarioHora);
        frame.add(lblHorasTrabajadas);
        frame.add(txtHorasTrabajadas);
        frame.add(btnCalcular);
        frame.add(btnLimpiar);
        frame.add(lblResultados);
        frame.add(txtResultado);

        // Acción del botón Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    double salarioHora = Double.parseDouble(txtSalarioHora.getText());
                    int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());

                    // Calcular salario mensual
                    double salarioMensual = salarioHora * horasTrabajadas;

                    // Mostrar resultados
                    if (salarioMensual > 450000) {
                        txtResultado.setText("Empleado: " + nombre + "\n" +
                                             "Salario mensual: $" + String.format("%.2f", salarioMensual));
                    } else {
                        txtResultado.setText("Empleado: " + nombre + "\n" + " Empleado " + nombre + " su salario es inferior a 450000") ;
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores numéricos válidos para salario y horas trabajadas.");
                }
            }
        });

        // Acción del botón Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar todos los campos
                txtNombre.setText("");
                txtSalarioHora.setText("");
                txtHorasTrabajadas.setText("");
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
