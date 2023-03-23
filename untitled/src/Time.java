public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) {
            hour = 0;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 60) {
            minute = 0;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 60) {
            second = 0;
        }
        this.second = second;
    }


    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time forward(Time t) {
        int secondPlusOne = t.getSecond()+1;
        t.setSecond(secondPlusOne);
        return t;
    }

    public Time back(Time t) {
        int secondMinusOne = t.getSecond()-1;
        t.setSecond(secondMinusOne);
        return t;
    }


}
