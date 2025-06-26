// Subclasse (classe filha)
public class GatoAbstracao extends AnimalAbstracao {
    public GatoAbstracao(String nome){
        super(nome);  /* Chama o construtor de superclasse
                       para inicializar o atributo nome*/
    }
    // Sobrescrevendo o metodo emitirSom da superclasse
    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }
}
