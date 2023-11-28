public class RemoveWhiteSp {
    public static void main(String[] args) {
        String str = "Object Oriented Programming";
        String str2 = str.replaceAll("\\s", "");

        System.out.println("String: "+ str);
        System.out.println("New String: "+ str2);

        //* OUTPUT:
        // String: Object Oriented Programming
        // New String: ObjectOrientedProgramming
    }
}
