package transit;

public class ImmutableString {
    final String immutableString;
    public ImmutableString(String s) {
        immutableString = s;
    }

    @Override
    public String toString() {
        return immutableString;
    }
}