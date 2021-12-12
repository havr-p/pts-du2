package transit;

public class LineFromMemoryFactory implements LineFactory{
    @Override
    public Line create(ImmutableString name) {
        return new Line((LineName) name);
    }
}
