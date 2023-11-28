public class RemoveSpCh {
    public static void main(String[] args) {
        String str = "Hello @Duet! #java_coding";
        String newStr = str.replaceAll("[^a-zA-Z]+", " ");

        System.out.println("String: "+ str);
        System.out.println("New String: "+ newStr);

        //* OUTPUT:
        // String: Hello @Duet! #java_coding
        // New String: Hello Duet java coding
    }
}

