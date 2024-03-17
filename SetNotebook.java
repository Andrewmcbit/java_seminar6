
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

// Не удаляйте и не меняйте метод Main! 
public class SetNotebook {

    public static String filter(Set<Notebook> inputCatalog, Scanner key, int inputKey){
        String str;
        String result = "";
        switch (inputKey) {
            case 1: 
                System.out.print("Input RAM size (4,8,16) gb: ");
                inputKey = key.nextInt();
                for (Notebook item : inputCatalog) {
                    item.findRam(inputKey);
                }
                System.out.println("---------------------------------------------------------------------");
                result = "RAM " + String.valueOf(inputKey) + "gb";
                break;
            case 2: 
                System.out.print("Input HDD size (256,512,1024) gb: ");
                inputKey = key.nextInt();
                for (Notebook item : inputCatalog) {
                    item.findHdd(inputKey);
                }
                System.out.println("---------------------------------------------------------------------");
                result = "HDD " + String.valueOf(inputKey) + "gb";
                break;
            case 3:
                System.out.print("Input OS (Linux,MacOS,Windows 8,10,11): ");
                str = key.next();
                for (Notebook item : inputCatalog) {
                    item.findOS(str);
                }
                System.out.println("---------------------------------------------------------------------");
                result = "OS " + str;
                break;
            case 4:
                System.out.print("Input Colour (White, Grey, Black, Silver): ");
                str = key.next();
                System.out.println(str);
                for (Notebook item : inputCatalog) {
                    item.findColour(str);
                }
                System.out.println("---------------------------------------------------------------------");
                result = "Colour " + str;
                break;
            default:
                System.out.println("Parameter not found");
                break;
        }
        return result;
        
    }

    public static void main(String[] args) {
        Notebook nb1 = new Notebook("Apple", 4, 512, "MacOS", "Silver");
        Notebook nb2 = new Notebook("HP", 8, 256, "Linux", "Black");
        Notebook nb3 = new Notebook("Lenovo", 8, 256, "Windows 8", "Grey");
        Notebook nb4 = new Notebook("Asus", 16, 1024, "Windows 11", "Black");
        Notebook nb5 = new Notebook("Samsung", 8, 256, "Windows 10", "White");

        Set<Notebook> catalog = new HashSet<Notebook>(Arrays.asList(nb1,nb2,nb3,nb4,nb5));
        Map<Integer, String> searchHistory = new HashMap<>();
        
        System.out.println("Full list of models:");
        for (Notebook item : catalog){
            System.out.println(item);
        }
        System.out.println("---------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("1.RAM 2.HDD 3.OS 4.Colour 5.SearchHistory 6.Exit. Input a number to search in category: ");
            num = input.nextInt();  
            if (num >= 1 && num <=4){
                searchHistory.put(searchHistory.size()+1,filter(catalog, input, num));
            }
            if (num == 5){
                if (searchHistory.size() > 0){
                    System.out.println("Search History:");
                    for (var item : searchHistory.entrySet()){
                        System.out.println(item.getValue());
                    }
                }
            }
        } while (num != 6);
        input.close();
    }
}