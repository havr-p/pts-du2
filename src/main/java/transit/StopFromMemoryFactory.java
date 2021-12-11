package transit;

public class StopFromMemoryFactory implements StopFactory {

    @Override
    public Stop create(ImmutableString name) {
        return new Stop((StopName) name);
    }
}
