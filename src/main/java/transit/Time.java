package transit;

public class Time {
    private int hour;
    private int minute;
    public Time(int hour, int minute) {
        this.hour = hour;
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
            return (((Time) o).hour == this.hour && ((Time) o).minute == this.minute);
        }
    }
}
