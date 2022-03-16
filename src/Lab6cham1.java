public class Lab6cham1 {
    public static void main(String[] args) {
        String time = "2 hrs and 5 minutes";
        String timeStr = time.replaceAll("[^0-9]","");
        char[] timeArr = timeStr.toCharArray();
        int hours = Integer.parseInt(String.valueOf(timeArr[0]));
        int minutes = Integer.parseInt(String.valueOf(timeArr[1]));
        int total = hours * 60 + minutes;
        System.out.println(total);
    }
}
