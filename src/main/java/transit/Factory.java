package transit;

public interface Factory<T> {
    T create(ImmutableString name);
}
