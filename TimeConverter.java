public class TimeConverter {
    public static String timeConvert(int seconds){
        int calculateminutes = seconds / 60;
        int calculateHours = calculateminutes / 60;
        int reminingMinutes = calculateminutes % 60;
        int remainingSeconds = seconds % 60;
        return calculateHours + "H " + reminingMinutes + "M " + remainingSeconds + " S";
    }
    public static String timeConcert(){
        return timeConvert(36000);
    }
    public static void main(String[] args){
        String result = timeConcert();
        System.out.println(result);

    }
}
