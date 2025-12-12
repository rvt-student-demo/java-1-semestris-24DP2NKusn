package rvt;

public class OverloadedCounter {
    private int value;

    public OverloadedCounter(int startValue) {
        this.value = startValue;
    }

    public OverloadedCounter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }
}