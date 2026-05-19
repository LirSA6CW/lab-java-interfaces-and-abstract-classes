/**
 * B11_IntArrayList — Implements B10_IntList using a dynamic array.
 * Default capacity: 10. When full, grows by 50% (e.g. 10 -> 15 -> 22).
 *
 * More efficient than IntVector when:
 * - The number of elements is relatively small and predictable.
 * - Memory usage needs to be minimized (smaller growth factor = less wasted space).
 * - Elements are added infrequently after the initial fill.
 */
public class B11_IntArrayList implements B10_IntList {

    private int[] data;
    private int size; // number of elements currently stored

    public B11_IntArrayList() {
        data = new int[10]; // default capacity
        size = 0;
    }

    /**
     * Adds a new integer. If the array is full, grows by 50% before adding.
     */
    @Override
    public void add(int number) {
        if (size == data.length) {
            // Array is full: grow by 50%
            int newCapacity = (int) (data.length * 1.5);
            int[] newData = new int[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = number;
        size++;
    }

    /**
     * Returns the element at the given index.
     */
    @Override
    public int get(int id) {
        return data[id];
    }
}