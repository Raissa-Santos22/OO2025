public class Aluno {
    String nome;

    // Metodo construtor

    public Aluno(String nome){
        this.nome = nome;
    }

    // Metodo sem retorno

    public void exibirAluno(){
        System.out.println("Aluno : " + nome);
    }

    public static void main (String [] args){
        Aluno aluno = new Aluno("Pedro");

        /*
        Aluno = classe
        aluno = objeto que vai armazenar as caracterisitcas do Metodo Aluno
        new = usado para a criação desse novo objeto
         */
        aluno.exibirAluno();
    }
}
