/**
 * B10_IntList — Interface defining the contract for integer list implementations.
 * Section 4 of the lab.
 * Implementations: B11_IntArrayList, B12_IntVector
 */
public interface B10_IntList {

    /**
     * Adds a new integer to the list.
     * Implementations must handle array resizing when full.
     * @param number the integer to add
     */
    void add(int number);

    /**
     * Retrieves an element by its index.
     * @param id the index of the element
     * @return the integer at the given index
     */
    int get(int id);
}