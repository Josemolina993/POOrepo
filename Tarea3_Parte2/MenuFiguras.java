import javax.swing.*;
import java.awt.*;

public class MenuFiguras {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Figuras Geométricas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 1));

        JLabel lblTitulo = new JLabel("Seleccione una figura geométrica", SwingConstants.CENTER);
        JButton btnCirculo = new JButton("Círculo");
        JButton btnRectangulo = new JButton("Rectángulo");
        JButton btnCuadrado = new JButton("Cuadrado");
        JButton btnTriangulo = new JButton("Triángulo Rectángulo");
        JButton btnRombo = new JButton("Rombo");
        JButton btnTrapecio = new JButton("Trapecio");

        frame.add(lblTitulo);
        frame.add(btnCirculo);
        frame.add(btnRectangulo);
        frame.add(btnCuadrado);
        frame.add(btnTriangulo);
        frame.add(btnRombo);
        frame.add(btnTrapecio);

        btnCirculo.addActionListener(e -> new VentanaCirculo());
        btnRectangulo.addActionListener(e -> new VentanaRectangulo());
        btnCuadrado.addActionListener(e -> new VentanaCuadrado());
        btnTriangulo.addActionListener(e -> new VentanaTrianguloRectangulo());
        btnRombo.addActionListener(e -> new VentanaRombo());
        btnTrapecio.addActionListener(e -> new VentanaTrapecio());

        frame.setVisible(true);
    }
}
