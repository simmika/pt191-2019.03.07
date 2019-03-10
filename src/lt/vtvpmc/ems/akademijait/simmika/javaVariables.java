package lt.vtvpmc.ems.akademijait.simmika;

import java.sql.SQLOutput;

public class javaVariables {
    private final static String NAME="APP_NAME"; //lokali const
    private static String carDescription = ""; // objekto kintamasis
    public static long counter = 0; // statinis kintamasis
    public static void main(String[] args) {

        String catName = "Doroty"; //vietinis metodo kintamasis. bus matomas sitam metodui
        for (int i = 0; i < 10; i++) {//vietinis ciklo kintamsis matomas tik tam cikle kuriam jis buvo pakviestas
        }

        System.out.println(NAME);
         System.out.println(carDescription);
    }
}
