public class CachorroAbstracao extends AnimalAbstracao {
    // A classe Cachorro é filha da classe mãe Animal
    public CachorroAbstracao(String nome){
        super(nome); /* Chama o construtor de superclasse
                       para inicializar o atributo nome*/
    }
    // Sobrescrevendo o metodo emitirSom da superclasse
    @Override
    public void emitirSom(){
        System.out.println("Au, au!");
    }
}
