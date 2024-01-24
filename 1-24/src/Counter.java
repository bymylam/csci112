public class Counter {
    //field
    private int count;

    //constructor
    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    //methods
    public int currentCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    public void reset() {
        count = 0;
    }
}
