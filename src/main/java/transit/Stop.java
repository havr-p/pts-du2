package transit;

import java.util.Optional;
import java.util.Vector;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;


public class Stop {

    private final StopName stopName;
    private MutablePair<Time, Optional<LineName>> reachableAt;
    private Optional<LineName> reachableVia;
    private Vector<LineName> lines;

    public Stop(StopName stopName) {
        this.stopName = stopName;
    }
    public StopName getStopName() {
        return this.stopName;
    }


    public void updateReachableAt(Time time, Optional<LineName> line) {
       reachableAt.setLeft(time);
       reachableAt.setRight(line);
    }
    public Pair<Time, Optional<LineName>> getReachableAt() {
        return reachableAt;
    }
    public Vector<LineName> getLines() {
        return lines;
    }
}