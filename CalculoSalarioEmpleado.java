
/* EJERCICIO 18 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase Empleado
class Empleado {
    private String codigo;
    private String nombres;
    private int horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;

    // Constructor
    public Empleado(String codigo, String nombres, int horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // Métodos para cálculos
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * (porcentajeRetencion / 100));
    }

    // Métodos getter para guardar los códigos y nombres ingresados 
    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }
}

// Interfaz gráfica
public class CalculoSalarioEmpleado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PROGRAMA: Salario de Empleado");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 2));

        // Componentes
        JLabel lblCodigo = new JLabel("Código del empleado:");
        JTextField txtCodigo = new JTextField();
        JLabel lblNombres = new JLabel("Nombres:");
        JTextField txtNombres = new JTextField();
        JLabel lblHoras = new JLabel("Horas trabajadas:");
        JTextField txtHoras = new JTextField();
        JLabel lblValorHora = new JLabel("Valor por hora:");
        JTextField txtValorHora = new JTextField();
        JLabel lblRetencion = new JLabel("% Retención fuente:");
        JTextField txtRetencion = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JLabel lblResultados = new JLabel("RESULTADOS", SwingConstants.CENTER);
        JButton btnLimpiar = new JButton("Limpiar");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);


        // Configuración de colores de botones y estilo para el "RESULTADOS"
        btnCalcular.setBackground(new Color(144, 238, 144)); // Verde pastel
        btnLimpiar.setBackground(new Color(255, 182, 193));  // Rojo pastel
        lblResultados.setFont(new Font("Arial", Font.BOLD, 14));

        // Agregar componentes al frame en el orden correcto para que aparezcan correctamente
        frame.add(lblCodigo);
        frame.add(txtCodigo);
        frame.add(lblNombres);
        frame.add(txtNombres);
        frame.add(lblHoras);
        frame.add(txtHoras);
        frame.add(lblValorHora);
        frame.add(txtValorHora);
        frame.add(lblRetencion);
        frame.add(txtRetencion);
        frame.add(btnCalcular);
        frame.add(btnLimpiar);
        frame.add(lblResultados);
        frame.add(txtResultado);

        // Acción del botón que al presionar calcula los valores 

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = txtCodigo.getText();
                    String nombres = txtNombres.getText();
                    int horas = Integer.parseInt(txtHoras.getText());
                    double valorHora = Double.parseDouble(txtValorHora.getText());
                    double retencion = Double.parseDouble(txtRetencion.getText());

                    // Crear objeto Empleado y calcular
                    Empleado empleado = new Empleado(codigo, nombres, horas, valorHora, retencion);
                    double salarioBruto = empleado.calcularSalarioBruto();
                    double salarioNeto = empleado.calcularSalarioNeto();

                    // Mostrar resultado
                    txtResultado.setText("Código: " + empleado.getCodigo() + "\n" +
                                         "Nombres: " + empleado.getNombres() + "\n" +
                                         "Salario Bruto: $" + String.format("%.2f", salarioBruto) + "\n" +
                                         "Salario Neto: $" + String.format("%.2f", salarioNeto));
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese datos válidos.");
                }
            }
        });


          // Acción del botón Limpiar
          btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar todos los campos
                txtCodigo.setText("");
                txtNombres.setText("");
                txtHoras.setText("");
                txtValorHora.setText("");
                txtRetencion.setText("");
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
