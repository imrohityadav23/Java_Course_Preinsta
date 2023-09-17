public class bonus_challage {
    public static void main(String []args){
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }
    private static String getDurationString(long minutes,long second){
        if ((minutes < 0) || (second < 0) || (second > 59)){
            return "INVALID_VALUE_MESSAGE";
        }

        long hours = minutes/60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString= "0" + hoursString;
        }
        String minutesString = remainingMinutes + " m ";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = second + "s";
        if (second < 10){
            secondsString = "0"+secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    private static String getDurationString(long seconds){
        if (seconds < 0){
            return "INVALID_VALUE_MESSAGE";

        }

        long minutes = seconds /60;
        long remainingSecond = seconds % 60;

        return getDurationString(minutes,remainingSecond);
    }
}
