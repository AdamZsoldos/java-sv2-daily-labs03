package day04;

import java.util.Arrays;

public class Prison {

    private final boolean[] cells;

    public Prison() {
        cells = new boolean[100];
        Arrays.fill(cells, false);
    }

    public void toggleCellLocks(int everyNthCell) {
        for (int i = everyNthCell - 1; i < cells.length; i += everyNthCell) {
            cells[i] = !cells[i];
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
