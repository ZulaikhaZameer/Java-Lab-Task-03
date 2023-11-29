public class NonRepeatedCh {
    public static void main(String[] args) {
        String str = "strings";
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("First non repeated character: "+ ch);
                break;
            }
        }
    }

    //* OUPUT:
    // First non repeated character: t
}
