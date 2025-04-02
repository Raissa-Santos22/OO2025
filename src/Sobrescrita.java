public class Sobrescrita {

    public static void main(String [] args){
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();

        animal.emitirSom();
        cachorro.emitirSom();
    }
}
