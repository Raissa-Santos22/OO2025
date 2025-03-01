import java.util.*;
public class EntradaComScanner {
    public static void main(String[] args){
        float largura, comprimento,area, perimetro;
        Scanner sc;
        try{
            System.out.println("Entre com o comprimento : ");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println("Entre com a largura :");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();

            area = comprimento * largura;
            perimetro = 2 * comprimento + largura * 2;

            System.out.println("Área do Terreno : " + area);
            System.out.println("Área do Perimetro : " + perimetro);
        }
        catch (NumberFormatException e){
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos!");
        }
    }

}
