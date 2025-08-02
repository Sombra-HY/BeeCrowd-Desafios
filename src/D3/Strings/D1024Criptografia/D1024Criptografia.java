package D3.Strings.D1024Criptografia;


import java.util.Scanner;
import java.util.function.Function;


/*
    Primeiro, é usado um método que recebe uma função responsável por verificar
    se o caractere deve ser modificado, como no caso de letras maiúsculas ou minúsculas.
    Se for aceito, o caractere é incrementado em 3 posições na tabela ASCII,
    convertendo-o para int.

    Depois, a string é invertida.

    Como o mesmo método de modificação de caracteres é reutilizado, passamos uma função
    que sempre retorna true (para aceitar todos os caracteres) e o valor -1,
    para deslocar os caracteres uma posição para a esquerda na tabela ASCII,
    aplicando a terceira etapa da criptografia.
 */

public class D1024Criptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(criptografar(scanner.nextLine()));

        }

    }

    private static String criptografar(String str) {
        str = criptografia1((chr)-> Character.isUpperCase(chr) || Character.isLowerCase(chr),str,3);
        int size = str.length();

        str = reverse(str);

        String strSplice = str.substring(0,size/2);
        str = strSplice.concat(criptografia1((z)->true
                        ,str.substring(size/2), -1));
        return str;
    }

    private static String criptografia1(
            Function <Character,Boolean> funcao,
            String str,
            int value
    ) {
        StringBuilder strCrip = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if (funcao.apply(ch)) {
                strCrip.append(someCharsASCI(ch,value));
                continue;
            }
            strCrip.append(ch);
        }
        return strCrip.toString();
    }


    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static char someCharsASCI(char c, int n) {
        return (char)((int) c + n) ;

    }
}
