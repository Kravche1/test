import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Main {
    private static int example1(int[] example1) { /// 150 meti elementebis jamis magaliti
        int sum = 0;
        int count = 0;
        for (int i:
             example1) {
            if (i > 150) {
                sum += i;
                count ++;
            }
        }
        return sum/count;
    }
    private static double example2(int[] example2) { /// kenti ricxvebis sashualo geometriuli
        double namravli = 1.0;
        int count = 0;
        for (int a:
             example2) {
            if (a % 2 != 0) {
                namravli *= 1.0;
                count ++;
            }
        }
        return Math.pow(namravli, 1.0/count);
    }
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        int[] example1 = {123,223,431,123,6,7}; /// 150 meti elementebis jamis magaliti
        System.out.println(Main.example1(example1));

        int[] example2 = {1,2,3,4,5,6,7,8,9}; /// kenti ricxvebis sashualo geometriuli
        System.out.println(Main.example2(example2));

        ///////////////////////////////////////
        ///DEPARTMENT EXAMPLE
        Department dep1 = new Department();
        dep1.ID = 5;
        dep1.Name = "gio";

        Department dep2 = new Department();
        dep2.ID = 6;
        dep2.Name = "Giorgi";

        System.out.println(dep1.equals(dep2));
        System.out.println(dep1.equals(dep2));

        ///////////////////////////////////////////////////////
        XML.generateXML();
    }
}