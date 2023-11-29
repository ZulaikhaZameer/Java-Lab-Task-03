public class ReplaceOccur {
    public static void main(String[] args) {
        String str = "program";
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentCh = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (currentCh == str.charAt(j)) {
                    count++;
                }
            }
            newStr.append(count);
        }

        System.out.println("String: " + str);
        System.out.println("Occurrence: " + newStr.toString());
    }

    //* OUTPUT:
    // String: program
    // Occurrence: 1211211
}
