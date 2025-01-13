import javax.swing.*;
import java.awt.*;


class VentanaCuadrado {
    VentanaCuadrado() {
        JFrame frame = new JFrame("Cuadrado");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel lblLado = new JLabel("Lado:");
        JTextField txtLado = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        frame.add(lblLado);
        frame.add(txtLado);
        frame.add(btnCalcular);
        frame.add(new JLabel(""));
        frame.add(txtResultado);

        btnCalcular.addActionListener(e -> {
            try {
                double lado = Double.parseDouble(txtLado.getText());
                Cuadrado cuadrado = new Cuadrado(lado);
                txtResultado.setText("Área: " + cuadrado.calcularArea() + "\n" +
                                     "Perímetro: " + cuadrado.calcularPerimetro());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese un número válido.");
            }
        });

        frame.setVisible(true);
    }
}
