import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeWorkCollections {
    public static void main(String[] args) {

        String str = "kolbasa, kolbasa, moloko, maslo.";
        printText(str);


        }

    public static void printText (String str){
        Set<String> listOFProducts = new HashSet<>(Arrays.asList(str.replace(".","").split(", ")));
        for (String st:listOFProducts) {
            String sentences = st.substring(0, 1).toUpperCase();
            String sentences1 = st.substring(1);
            String result = sentences + sentences1;
            System.out.println(result);
        }

    }
}
