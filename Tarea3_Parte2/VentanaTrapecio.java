import javax.swing.*;
import java.awt.*;



class VentanaTrapecio {
    VentanaTrapecio() {
        JFrame frame = new JFrame("Trapecio");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        JLabel lblBaseMayor = new JLabel("Base Mayor:");
        JTextField txtBaseMayor = new JTextField();
        JLabel lblBaseMenor = new JLabel("Base Menor:");
        JTextField txtBaseMenor = new JTextField();
        JLabel lblAltura = new JLabel("Altura:");
        JTextField txtAltura = new JTextField();
        JLabel lblLado1 = new JLabel("Lado 1:");
        JTextField txtLado1 = new JTextField();
        JLabel lblLado2 = new JLabel("Lado 2:");
        JTextField txtLado2 = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        frame.add(lblBaseMayor);
        frame.add(txtBaseMayor);
        frame.add(lblBaseMenor);
        frame.add(txtBaseMenor);
        frame.add(lblAltura);
        frame.add(txtAltura);
        frame.add(lblLado1);
        frame.add(txtLado1);
        frame.add(lblLado2);
        frame.add(txtLado2);
        frame.add(btnCalcular);
        frame.add(txtResultado);

        btnCalcular.addActionListener(e -> {
            try {
                double baseMayor = Double.parseDouble(txtBaseMayor.getText());
                double baseMenor = Double.parseDouble(txtBaseMenor.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                double lado1 = Double.parseDouble(txtLado1.getText());
                double lado2 = Double.parseDouble(txtLado2.getText());
                Trapecio trapecio = new Trapecio(baseMayor, baseMenor, altura, lado1, lado2);
                txtResultado.setText("Área: " + trapecio.calcularArea() + "\n" +
                                     "Perímetro: " + trapecio.calcularPerimetro());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese números válidos.");
            }
        });

        frame.setVisible(true);
    }
}
