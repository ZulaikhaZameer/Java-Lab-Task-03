public class SortAlphabetically {
    public static void main(String[] args) {
        String str = "alphabets";
        String newStr = "";

        for (char ch='a'; ch <='z'; ch++){
            for (int i=0; i<str.length(); i++){
                if(ch == str.charAt(i)){
                    newStr = newStr + ch;
                }
            }
        }
        System.out.println("String: "+ str);
        System.out.println("New String: "+ newStr);
    }
    //* OUPUT:
    // String: alphabets
    // New String: aabehlpst
}
