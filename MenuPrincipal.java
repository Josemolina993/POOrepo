import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Principal");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        // Componentes del menú
        JLabel lblTitulo = new JLabel("Seleccione el programa a ejecutar", SwingConstants.CENTER);
        JButton btnProblema1 = new JButton("1. Cálculo de Salario de Empleado");
        JButton btnProblema2 = new JButton("2. Comparar Números");
        JButton btnProblema3 = new JButton("3. Triángulo Equilátero");
        JButton btnProblema4 = new JButton("4. Liquidación de Matrícula");
        JButton btnProblema5 = new JButton("5. Ecuación de Segundo Grado");

        // Agregar componentes al frame
        frame.add(lblTitulo);
        frame.add(btnProblema1);
        frame.add(btnProblema2);
        frame.add(btnProblema3);
        frame.add(btnProblema4);
        frame.add(btnProblema5);

        // Acción para el primer ejercicio
        btnProblema1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculoSalarioEmpleado.main(null); // Llama al programa correspondiente
            }
        });

        // Acción para el segundo ejercicio
        btnProblema2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CompararNumeros.main(null); // Llama al programa correspondiente
            }
        });

        // Acción para el tercer ejercicio
        btnProblema3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculoTrianguloEquilatero.main(null); // Llama al programa correspondiente
            }
        });

        // Acción para el cuarto ejercicio
        btnProblema4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LiquidacionMatricula.main(null); // Llama al programa correspondiente
            }
        });

        // Acción para el quinto ejercicicio
        btnProblema5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EcuacionSegundoGrado.main(null); // Llama al programa correspondiente
            }
        });

        // Mostrar frame
        frame.setVisible(true);
    }
}
