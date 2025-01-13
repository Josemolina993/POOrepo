import javax.swing.*;
import java.awt.*;



class VentanaTrianguloRectangulo {
    VentanaTrianguloRectangulo() {
        JFrame frame = new JFrame("Triángulo Rectángulo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

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
                TrianguloRectangulo triangulo = new TrianguloRectangulo(base, altura);
                txtResultado.setText("Área: " + triangulo.calcularArea() + "\n" +
                                     "Perímetro: " + triangulo.calcularPerimetro() + "\n" +
                                     "Hipotenusa: " + triangulo.calcularHipotenusa() + "\n" +
                                     "Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese números válidos.");
            }
        });

        frame.setVisible(true);
    }
}
