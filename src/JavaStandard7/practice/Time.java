package JavaStandard7.practice;

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >23) return;
        this.hour = hour;
    }
    //getter,setter 중간 생략
    @Override
    public String toString() {
        return hour + ":" + minute + ":" +second;
    }
}
