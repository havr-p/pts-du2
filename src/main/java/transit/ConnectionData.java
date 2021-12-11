package transit;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class ConnectionData {
    private final Time departureTime;
    private final Time arrivalTime;
    private final List<Pair<Time, StopName>> routeWithArrivals;
    private final StopName startingStopName;
     private final StopName destinationStopName;
    public ConnectionData(Time departureTime, Time arrivalTime, List<Pair<Time, StopName>> route,
                          StopName startingStopName, StopName destinationStopName) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.routeWithArrivals = route;
        this.startingStopName = startingStopName;
        this.destinationStopName = destinationStopName;
    }
    @Override
    public String toString() {
        String res = "Departure time: " + departureTime + '\n' +
                "Starting stop: " + startingStopName + '\n' +
                "Route: " + routeWithArrivals + '\n' +
                "Destination stop: " + destinationStopName + '\n' +
                "Arrival time: " + arrivalTime + '\n';
        return res;
    }
}
