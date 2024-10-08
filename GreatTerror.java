import java.util.*;
public class GreatTerror {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        System.out.println(removeMiddle(n));
    }
    public static String removeMiddle(String n) {
        String[] arr = n.split(" ");
        int halfLength = arr.length / 2;
        String middleWord = arr[halfLength];
        
        String result = "";
        for(int i = 0; i<arr.length; i++) {
            if(i!= halfLength) {
                result +=  arr[i] + " ";
            }
        }

        result = result.trim();
        return result + ": I have removed " + middleWord;
        
            
        
    }
}