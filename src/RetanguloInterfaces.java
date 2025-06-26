// A classe filha RetanguloInterface é implementada da Interface FormaInterface
public class RetanguloInterfaces implements FormaInterface {
    private double largura;
    private double altura;
    // atributos altura e largura privados

    public RetanguloInterfaces(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    // sobrescrevendo o metodo calcularÁrea e implementando de acordo com a área do retangulo
    public double calcularArea(){
        return largura * altura;
    }
}