
        package transit;

import java.util.Comparator;
import java.util.Optional;

public class Time implements Comparable<Time>{
    private Integer time;

    public Time(int time) {
        this.time = time;
    }

    public Time() {
    }

    public int getTime() {
        return time;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + time;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        else {
            return ((Time) o).time.equals(this.time);
        }
    }

    @Override
    public String toString() {
        return time.toString();
    }

    @Override
    public int compareTo(Time t) {

        return time.compareTo(t.time);
    }


}