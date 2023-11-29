public class FindWord {
    public static void main(String[] args) {
        String str = "Algorithms are the heart of efficient code";
        String word = "heart";

        if(str.contains(word)){
            System.out.println("The word '"+ word +"' is found in the string");
        }
        else{
            System.out.println("The word '"+ word +"' is not found in the string");
        }
    }
    //* OUTPUT:
    // The word 'heart' is found in the string
}
