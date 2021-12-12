package transit;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

public interface LineSegmentInterface {
    Pair<Time, StopName> nextStop(Time startTime);
    Triple<Time, StopName, Boolean> nextStopAndUpdateReachable(Time startTime);
    void incrementCapacity(Time startTime);
}
