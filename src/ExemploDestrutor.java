public class ExemploDestrutor {
    protected void finalize(){
        System.out.println("Objeto está sendo removido pelo Garbage Colltor");
    }

    public static void main(String [] args){
        ExemploDestrutor exemplo = new ExemploDestrutor();
        exemplo = null; // torna o objeto disponível para remoção;
        System.gc();    // surgere a execução do Garbage Colletor

    }
}
