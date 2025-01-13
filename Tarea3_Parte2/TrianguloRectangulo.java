class TrianguloRectangulo {
    double base, altura;

    TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2;
    }

    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && base == hipotenusa) return "Equilátero";
        if (base == altura || base == hipotenusa || altura == hipotenusa) return "Isósceles";
        return "Escaleno";
    }
}
