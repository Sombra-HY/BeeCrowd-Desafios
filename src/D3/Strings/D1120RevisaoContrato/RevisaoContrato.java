package D3.Strings.D1120RevisaoContrato;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RevisaoContrato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            char numberToRemove = scanner.next().charAt(0);
            String str = scanner.next();
            if(numberToRemove == '0' && str.equals("0")){
                System.out.println("0 0");
                break;
            }
            System.out.println(removeLetter(str,numberToRemove));
        }

    }

    public static String removeLetter(String str,char letterToRemove){
        var strbuild = new StringBuilder();
        for (var a: str.toCharArray()){
            if(a !=  letterToRemove){
                strbuild.append(a);
            }
        }

        Matcher mat = Pattern.compile("[1-9]").matcher(strbuild);
        if(strbuild.isEmpty() || !mat.find()){
            return "0";
        }
        return strbuild.toString();

    }


}
