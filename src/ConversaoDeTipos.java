import javax.swing.text.FlowView;
public class ConversaoDeTipos {
    public static void main(String[] arg) {
        String s1 = "10";

        int v = Integer.parseInt(s1);

        float x = Float.parseFloat(s1);

        double y = Double.parseDouble(s1);

        int w = (int) x;

        int b = (int) y;

        String s2 = String.valueOf(v);


        System.out.println(s2 + w + b);

    }
}
