public class Pessoa {
    private String nome;

    /*
    Setter será sempre sem retorno, por isso o uso da palavra void
    */

    //Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    /*
    Getter sempre será com retorno, por isso o uso da palavra return
    */

    // Getter
    public String getNome(){
        return nome;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana");
        System.out.println("Nome: " + pessoa.getNome());
    }
}
