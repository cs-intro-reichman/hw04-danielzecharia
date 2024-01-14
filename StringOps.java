public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //String string = "Hello World";
        //char chr='l';
        //System.out.println(allIndexOf(string, chr));


    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        char e = 'e';
        char a = 'a';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        char temp = string.charAt(0);
        String newS = "";
        int asci = 0;


        for (int x = 0; x < string.length(); x++) {
            temp = string.charAt(x);
            if (temp == e || temp == a || temp == i || temp == o || temp == u) {
                asci = (int) temp;
                asci = asci - 32;
                temp = (char) asci;
            } else if ((temp >= 'A') && (temp <= 'Z') && (temp != 'O' && temp != 'A' && temp != 'I' && temp != 'E' && temp != 'U')) {
                asci = (int) temp;
                asci = asci + 32;
                temp = (char) asci;
            }

            newS = newS + temp;
        }

        return newS;
    }

    public static String camelCase(String string) {
        // Write your code here:
        int asci = 0;
        String str = "";
        int input = -1;
        char newChar;
        char temp = string.charAt(0);
        if (temp >= 'A' && temp <= 'Z') {
            asci = (char) temp;
            asci = asci + 32;
            newChar = (char) asci;
            str = str + newChar;
        } else if (temp != ' ') str = str + temp;
        else input = 0;

        for (int i = 1; i < string.length(); i++) {
            temp = string.charAt(i);
            if (temp == ' ') input = i;
            if ((str == "") && temp != ' ' && (temp >= 'A' && temp <= 'Z')) {
                asci = (char) temp;
                asci = asci + 32;
                newChar = (char) asci;
                str = str + newChar;
            } else {
                if ((input == i - 1) && (temp >= 'a' && temp <= 'z') && (temp != ' ') && str != "") {
                    asci = (char) temp;
                    asci = asci - 32;
                    newChar = (char) asci;
                    str = str + newChar;
                } else {
                    if (temp >= 'A' && temp <= 'Z' && temp != ' ' && input != i - 1) {
                        asci = (char) temp;
                        asci = asci + 32;
                        newChar = (char) asci;
                        str = str + newChar;
                    } else if (temp != ' ') str = str + temp;
                }
            }
        }

        return str;
    }

    public static int[] allIndexOf(String string, char chr) {
        int counter = 0;
        int index = 0;
        int k = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr)
                counter++;
        }
        int[] array = new int[counter];
        while (k < counter) {
            for (int x = 0; x < string.length(); x++) {
                if (string.charAt(x) == chr) {
                    array[k] = x;
                    k++;
                }
            }
        }

        return array;
    }
}

