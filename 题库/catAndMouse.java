import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-12-05 13:30
 */
public class catAndMouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = null;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'c'){
                for (int j = i; j < str.length(); j++) {
                    if(str.charAt(j) == 'r'){
                        s = str.substring(i, j);
                    }
                }
            }
            else if(str.charAt(i) == 'r'){
                for (int j = i; j < str.length(); j++) {
                    if(str.charAt(j) == 'c'){
                        s = str.substring(i, j);
                    }
                }
            }
        }
        if(s.length()-1 <= 3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
