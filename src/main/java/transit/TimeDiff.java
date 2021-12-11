package transit;

public class TimeDiff extends Time{
    public TimeDiff(int time) {
        super(time);
    }
    //returns t2-t1
    public TimeDiff(Time t1, Time t2) {
        super(t2.getTime() - t1.getTime());
    }


}
