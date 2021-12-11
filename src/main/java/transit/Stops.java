package transit;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class Stops {
    private final Map<StopName, Stop> stops = new HashMap();
    private Stop startingStop;
    private final StopFactory stopFactory = new StopFromMemoryFactory();


    //returns the earliest reachable stop in stops, comparing times in which every stop is reachable
    public Optional<Pair<StopName, Time>> earliestReachableStopAfter(Time time) {
        Stop earliestStop = null;
        Time earliestArrivalTime = null;
        for (Stop stop :
                stops.values()) {
            Time stopArrivalTime = stop.getReachableAt().getLeft();

            if (stopArrivalTime.compareTo(time) >= 0) {
                if (earliestArrivalTime == null || earliestArrivalTime.compareTo(stopArrivalTime) > 0) {
                    earliestStop = stop;
                    earliestArrivalTime = stopArrivalTime;
                }
            }
        }
        if (earliestStop == null) return Optional.empty();
        return Optional.of(Pair.of(earliestStop.getStopName(), earliestArrivalTime));
    }

    public void setStartingStop(StopName stopName, Time time) {
        startingStop = stopFactory.create(stopName);
        stops.put(stopName, startingStop);
        startingStop.updateReachableAt(time, Optional.empty());
    }

    public Vector<LineName> getLines(Stop stop) {
        return stop.getLines();
    }

    public Pair<Time, Optional<LineName>> getReachableAt(StopName stopName) {
       return stops.get(stopName).getReachableAt();
    }
}
