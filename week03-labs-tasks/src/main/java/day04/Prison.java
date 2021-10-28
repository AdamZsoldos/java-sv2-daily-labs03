package day04;

public class Prison {

    private final boolean[] cells = new boolean[100];

    public void toggleCellLocks(int everyNthCell) {
        for (int i = everyNthCell - 1; i < cells.length; i += everyNthCell) {
            cells[i] = !cells[i];
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
