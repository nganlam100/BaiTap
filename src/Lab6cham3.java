public class Lab6cham3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String numStr = "";

        for (int index = 0; index < myStr.length(); index++) {
            int ascii = myStr.charAt(index);
            //0 to 9
            if (ascii >= 48 && ascii <= 57){
                numStr += (char) ascii;
            }
        }
        int number = Integer.parseInt(numStr);
        System.out.println(number);
    }
}
