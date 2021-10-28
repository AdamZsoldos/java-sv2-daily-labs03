package day04;

public class Sultan {
    public static void main(String[] args) {

        Prison prison = new Prison();

        for (int i = 1; i < 101; i++) {
            prison.toggleCellLocks(i);

            System.out.print("Day " + i + " open cells: ");
            for (int j = 0; j < prison.getCells().length; j++) {
                if (prison.getCells()[j]) System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
