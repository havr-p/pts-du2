package transit;

import java.util.Map;

public class LineSegment {
    private TimeDiff timeToNextStop;
    private Map<Time, Integer> numberOfPassengers;
    private Integer capacity;
    private LineName lineName;

}
