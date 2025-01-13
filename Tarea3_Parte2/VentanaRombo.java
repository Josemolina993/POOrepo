import javax.swing.*;
import java.awt.*;


class VentanaRombo {
    VentanaRombo() {
        JFrame frame = new JFrame("Rombo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel lblDiagonalMayor = new JLabel("Diagonal Mayor:");
        JTextField txtDiagonalMayor = new JTextField();
        JLabel lblDiagonalMenor = new JLabel("Diagonal Menor:");
        JTextField txtDiagonalMenor = new JTextField();
        JLabel lblLado = new JLabel("Lado:");
        JTextField txtLado = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        frame.add(lblDiagonalMayor);
        frame.add(txtDiagonalMayor);
        frame.add(lblDiagonalMenor);
        frame.add(txtDiagonalMenor);
        frame.add(lblLado);
        frame.add(txtLado);
        frame.add(btnCalcular);
        frame.add(txtResultado);

        btnCalcular.addActionListener(e -> {
            try {
                double diagonalMayor = Double.parseDouble(txtDiagonalMayor.getText());
                double diagonalMenor = Double.parseDouble(txtDiagonalMenor.getText());
                double lado = Double.parseDouble(txtLado.getText());
                Rombo rombo = new Rombo(diagonalMayor, diagonalMenor, lado);
                txtResultado.setText("Área: " + rombo.calcularArea() + "\n" +
                                     "Perímetro: " + rombo.calcularPerimetro());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese números válidos.");
            }
        });

        frame.setVisible(true);
    }
}
