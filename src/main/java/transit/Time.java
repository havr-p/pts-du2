
        package transit;

import java.util.Comparator;
import java.util.Optional;

public class Time implements Comparable<Time>{
    private Integer hour;
    private Integer minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }


    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + hour;
        hash = 31 * hash + minute;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        else {
            return (((Time) o).hour.equals(this.hour) && ((Time) o).minute.equals(minute));
        }
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }

    @Override
    public int compareTo(Time t) {
        if (hour.equals(t.hour)) {
            return minute.compareTo(t.minute);
        }
        return hour.compareTo(t.hour);
    }


}