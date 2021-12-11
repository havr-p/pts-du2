package transit;

public class ImmutableString {
    private final String immutableString;
    public ImmutableString(String s) {
        immutableString = s;
    }

    @Override
    public String toString() {
        return immutableString;
    }
}