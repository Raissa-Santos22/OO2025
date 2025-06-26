class CirculoInterfaces implements FormaInterface {
    // A classe circulo é implementarda da interface mãe FormaInterface
    private double raio;

    public CirculoInterfaces(double raio){
        this.raio = raio;
    }
    // sobrescrevendo o metodo calcularÁrea e implementando de acordo com a área do circulo
    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
