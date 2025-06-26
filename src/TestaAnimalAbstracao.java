public class TestaAnimalAbstracao {
    public static void main(String[] args) {
        AnimalAbstracao cachorro = new CachorroAbstracao("Billy");
        AnimalAbstracao gato = new GatoAbstracao("Bibi");
        // Criação dos objetos cachorro e gato

        cachorro.emitirSom(); // Au, au!
        gato.emitirSom(); // Miau!
    }
}
