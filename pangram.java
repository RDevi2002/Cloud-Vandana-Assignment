import java.util.Scanner;
public class pangram {
    static String isPanagram(String s){
        String t = "abcdefghijklmnopqrstuvwxyz";
        s=s.toLowerCase();
        int count = 0;
        for(int i=0;i<t.length();i++){
            if(s.indexOf(t.charAt(i))>=0){
                count++;
            }
            else{
                break;
            }
        }
        if(count ==26){
            return "Pangram";

        }
        else{
            return "Not a pangram";
        }
    }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = isPanagram(s);
        System.out.println(res);
        
    }
    
    
}
