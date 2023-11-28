public class StringReverse{
    public static void main(String[] args) {
        String str = "pakistan";
        String str2  = "";

        for (int i=str.length()-1; i>=0; i--){
            str2 = str2  + str.charAt(i) ;
        }
        System.out.println("String: " + str);
        System.out.println("Reversed string using loop: " + str2 );

        StringBuilder str3 = new StringBuilder(str);
        str3.reverse().toString();
        System.out.println("Reversed String using string builder: "+ str3);

        //* OUTPUT:
        // String: pakistan
        // Reversed string using loop: natsikap
        // Reversed String using string builder: natsikap
    }
    
}