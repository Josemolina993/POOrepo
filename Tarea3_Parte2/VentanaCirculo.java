import javax.swing.*;
import java.awt.*;



class VentanaCirculo {
    VentanaCirculo() {
        JFrame frame = new JFrame("Círculo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel lblRadio = new JLabel("Radio:");
        JTextField txtRadio = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        frame.add(lblRadio);
        frame.add(txtRadio);
        frame.add(btnCalcular);
        frame.add(new JLabel(""));
        frame.add(txtResultado);

        btnCalcular.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(txtRadio.getText());
                Circulo circulo = new Circulo(radio);
                txtResultado.setText("Área: " + circulo.calcularArea() + "\n" +
                                     "Perímetro: " + circulo.calcularPerimetro());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese un número válido.");
            }
        });

        frame.setVisible(true);
    }
}
