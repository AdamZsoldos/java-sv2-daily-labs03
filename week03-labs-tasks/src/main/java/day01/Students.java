package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private final List<Integer> heightValues;

    public Students() {
        heightValues = new ArrayList<>();
    }

    public void addHeight(int height) {
        heightValues.add(height);
    }

    public boolean isHeightIncreasing() {
        int lastHeight = 0;
        for(int height: heightValues) {
            if (height <= lastHeight) return false;
            lastHeight = height;
        }
        return true;
    }

    public String toString() {
        return heightValues.toString();
    }
}
