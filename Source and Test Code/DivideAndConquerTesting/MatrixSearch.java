package DivideAndConquerTesting;

public interface MatrixSearch {
    <T extends Comparable<T>> int[] find(T matrix[][], T key);
}