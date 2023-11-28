public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        String newStr = "";

        for (int i=0; i<str.length(); i++){
            char currentCh = str.charAt(i);
            int index = newStr.indexOf(currentCh);
            
            if(index == -1){
                newStr = newStr + currentCh;
            }
        }
        System.out.println("String: "+ str);
        System.out.println("New String: "+ newStr);
    }
}