public class Pair<K, V extends Comparable<V>> implements Comparable<Pair<K, V>> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public int compareTo(Pair<K, V> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}