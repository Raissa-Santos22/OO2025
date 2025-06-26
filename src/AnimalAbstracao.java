// Classe abstrata AnimalAbstracao
abstract class AnimalAbstracao {
    private String nome; // atributo nome privado

    public AnimalAbstracao(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
        // metodo get para retornar o nome
    }
    public abstract void emitirSom();
    // metodo abstrato (sem implementação)
}
