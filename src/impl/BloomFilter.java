package impl;

import java.util.BitSet;
import java.util.function.Function;

public class BloomFilter<T> {
    private BitSet bitSet;
    private int size;
    private Function<T, Integer>[] hashFunctions;

    @SafeVarargs
    public BloomFilter(int size, Function<T, Integer>... hashFunctions) {
        this.size = size;
        this.bitSet = new BitSet(size);
        this.hashFunctions = hashFunctions;
    }

    public void add(T element) {
        for (Function<T, Integer> hashFunction : hashFunctions) {
            int hash = Math.abs(hashFunction.apply(element) % size);

            bitSet.set(hash, true);
        }
    }

    public boolean contains(T element) {
        for (Function<T, Integer> hashFunction : hashFunctions) {
            int hash = Math.abs(hashFunction.apply(element) % size);

            if (!bitSet.get(hash)) {
                return false;
            }
        }
        return true;
    }

}
