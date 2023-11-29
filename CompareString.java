public class CompareString {
    public static void main(String[]args){
        String str1 = "java";
        String str2 = "JAVA";
        System.out.print("By using String equals() method: ");
        if(str1.equals(str2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        System.out.print("By using String equalsIgnoreCase() method: ");
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        System.out.print("By using String compareTo() method: ");
        if(str1.compareTo(str2) > 0){
            System.out.println(str1 +" is greater than "+ str2);
        }
        else if(str1.compareTo(str2) > 0){
            System.out.println(str1 +"is greater than "+ str2);
        }
        else{
            System.out.println("Both strings are equal");
        }    
    }
    //* OUTPUT:
    // By using String equals() method: Strings are not equal
    // By using String equalsIgnoreCase() method: Both strings are equal
    // By using String compareTo() method: java is greater than JAVA    
}