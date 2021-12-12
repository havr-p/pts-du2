package transit;

import java.util.concurrent.PriorityBlockingQueue;

public class Line {
    LineName lineName;
    PriorityBlockingQueue<Time> startingTimes = new PriorityBlockingQueue<>(2, Time::compareTo);
    StopName firstStop;

    public Line(LineName lineName) {
        this.lineName = lineName;
    }


}
