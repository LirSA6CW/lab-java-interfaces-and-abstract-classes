# LAB Java | Interfaces and Abstract Classes

## Solution by LirSA6CW

---

## Structure

| File | Description |
|------|-------------|
| B01_Main.java | Entry point — runs all sections |
| B02_BigDecimalUtils.java | Section 1 — BigDecimal operations |
| B03_Car.java | Section 2 — Abstract base class Car |
| B04_Sedan.java | Section 2 — Sedan subclass |
| B05_UtilityVehicle.java | Section 2 — UtilityVehicle subclass |
| B06_Truck.java | Section 2 — Truck subclass |
| B07_Video.java | Section 3 — Abstract base class Video |
| B08_TvSeries.java | Section 3 — TvSeries subclass |
| B09_Movie.java | Section 3 — Movie subclass |
| B10_IntList.java | Section 4 — IntList interface |
| B11_IntArrayList.java | Section 4 — IntArrayList implementation |
| B12_IntVector.java | Section 4 — IntVector implementation |

---

## IntArrayList vs IntVector — When to use each

### IntArrayList (grows by 50%)

**Use when:**
- The number of elements is relatively small and somewhat predictable.
- Memory efficiency matters — growing by 50% wastes less space than doubling.
- Elements are added in bursts followed by long periods of stability.

**Example:** A list of items in a shopping cart. Most users add between 5 and 20 items. Starting at 10 and growing to 15 is sufficient and avoids allocating unnecessary memory.

### IntVector (doubles in size)

**Use when:**
- A large and unpredictable number of elements will be added continuously.
- Performance is critical — doubling minimizes the number of resize operations.
- Speed of insertion matters more than memory usage.

**Example:** A real-time sensor logging system recording thousands of readings per second. Doubling the array size each time it fills keeps resize operations rare, avoiding performance bottlenecks.

### Summary

| | IntArrayList | IntVector |
|---|---|---|
| Default capacity | 10 | 20 |
| Growth factor | 50% | 100% (doubles) |
| Memory efficiency | Better | Worse |
| Resize frequency | Higher | Lower |
| Best for | Small, predictable datasets | Large, fast-growing datasets |