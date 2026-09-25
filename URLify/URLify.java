/*
URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith "
, 13
Output: "Mr%20John%20Smith"
 */
public class URLify {

    private static void url(String s, int len) {
        char[] chars = s.toCharArray();

        int spaces = 0;

        // Contar espacios dentro de la longitud verdadera
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                spaces++;
            }
        }

        int index = len + spaces * 2 - 1;

        // Recorrer hacia atrás
        for (int i = len - 1; i >= 0; i--) {

            if (chars[i] == ' ') {
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            } else {
                chars[index--] = chars[i];
            }
        }

        System.out.println(new String(chars));
    }

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        int len = 13;

        url(s, len);
    }
}
