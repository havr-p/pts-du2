package transit;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import java.util.HashMap;
import java.util.Map;

public class LineSegment implements LineSegmentInterface{
    private TimeDiff timeToNextStop;
    private Map<Time, Integer> numberOfPassengers = new HashMap<>();
    private Integer capacity;
    private LineName lineName;
    private LineSegmentFactory lineSegmentFactory = new LineSegmentFromMemoryFactory();



    @Override
    public Pair<Time, StopName> nextStop(Time startTime) {
        return null;
    }

    @Override
    public Triple<Time, StopName, Boolean> nextStopAndUpdateReachable(Time startTime) {
        return null;
    }

    @Override
    public void incrementCapacity(Time startTime) {

    }
}
