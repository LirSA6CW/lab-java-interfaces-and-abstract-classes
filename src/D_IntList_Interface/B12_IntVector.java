/**
 * B12_IntVector — Implements B10_IntList using a dynamic array.
 * Default capacity: 20. When full, doubles in size (e.g. 20 -> 40 -> 80).
 *
 * More efficient than IntArrayList when:
 * - A large number of elements will be added frequently.
 * - Performance is critical and resizing operations must be minimized.
 * - The number of elements is unpredictable and could grow rapidly.
 */
public class B12_IntVector implements B10_IntList {

    private int[] data;
    private int size; // number of elements currently stored

    public B12_IntVector() {
        data = new int[20]; // default capacity
        size = 0;
    }

    /**
     * Adds a new integer. If the array is full, doubles its size before adding.
     */
    @Override
    public void add(int number) {
        if (size == data.length) {
            // Array is full: double the size
            int[] newData = new int[data.length * 2];
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