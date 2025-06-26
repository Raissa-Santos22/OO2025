public class TestaFormaInterfaces {
    public static void main(String[] args) {
        FormaInterface circulo = new CirculoInterfaces(2);
        FormaInterface retangulo = new RetanguloInterfaces(3, 4);
        // Criação dos objetos circulo e retangulo

        System.out.println("Área do círculo : " + circulo.calcularArea());
        System.out.println("Área do quadrado : " + retangulo.calcularArea());
    }
}
