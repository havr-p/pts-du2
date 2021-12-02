package transit;

import java.util.Optional;
import java.util.Vector;
import org.apache.commons.lang3.tuple.*;


public class Stop {

    private StopName stopName;
    private MutablePair<Time, Optional<LineName>> reachableAt;
    private Optional<LineName> reachableVia;
    private Vector<LineName> lines;

    public Stop(String stopName) {
        this.stopName = new StopName(stopName);
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
    public Vector<LineName> lines() {
        return lines;
    }
}