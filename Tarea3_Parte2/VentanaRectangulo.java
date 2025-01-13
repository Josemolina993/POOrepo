import javax.swing.*;
import java.awt.*;



class VentanaRectangulo {
    VentanaRectangulo() {
        JFrame frame = new JFrame("Rectángulo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel lblBase = new JLabel("Base:");
        JTextField txtBase = new JTextField();
        JLabel lblAltura = new JLabel("Altura:");
        JTextField txtAltura = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        frame.add(lblBase);
        frame.add(txtBase);
        frame.add(lblAltura);
        frame.add(txtAltura);
        frame.add(btnCalcular);
        frame.add(new JLabel(""));
        frame.add(txtResultado);

        btnCalcular.addActionListener(e -> {
            try {
                double base = Double.parseDouble(txtBase.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                Rectangulo rectangulo = new Rectangulo(base, altura);
                txtResultado.setText("Área: " + rectangulo.calcularArea() + "\n" +
                                     "Perímetro: " + rectangulo.calcularPerimetro());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese números válidos.");
            }
        });

        frame.setVisible(true);
    }
}
