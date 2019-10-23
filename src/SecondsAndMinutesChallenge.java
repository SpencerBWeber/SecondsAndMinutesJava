class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours =  minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = intervalString("h", hours);
        String minutesString = intervalString("m", remainingMinutes);
        String secondsString = intervalString("s", seconds);
        return hoursString + " " + minutesString + " " + secondsString;
    }

    static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    private static String intervalString(String type, long time) {
        String timeString = time + type;
        if (time < 10) {
            return "0" + timeString;
        }
        return timeString;
    }
}
