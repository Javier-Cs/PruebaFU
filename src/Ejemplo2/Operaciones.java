package Ejemplo2;

@FunctionalInterface
public interface Operaciones<T> {
    T apply(T a, T b);
}
