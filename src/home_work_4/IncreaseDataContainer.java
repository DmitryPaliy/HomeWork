package home_work_4;

import java.lang.reflect.Array;

public class IncreaseDataContainer <T> {
    private T[] incData;
    public IncreaseDataContainer (Class<T> a, int b) {
        incData = (T[]) Array.newInstance(a, b);
    }
    public T[] getIncData() {
        return incData;
    }
}

