public class PrintDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Duplicate characters: ");

        for (int i=0; i<str.length()-1; i++){
            for (int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }

  
    //* OUTPUT:
    // Duplicate characters: 
    // r
    // g
    // m
}
