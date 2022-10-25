public class Field {
    static int[][] field = new int[10][10];

    public static void begin(int i, int j) {
        field[i][j] = 1;
        createWalls();
    }

    public static void createWalls() {
        int k = (field.length) / 2;
        int p = (field[0].length) / 2;
        for (int j = 1; j < field.length - 1; j++) {
            field[k][j] = 99;
            field[j][p] = 99;
        }
    }

    static void draw() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 66) {
                    System.out.printf("%3s", "░░░");
                } else {
                    if (field[i][j] == 99) {
                        System.out.printf("%3s", "▓▓▓");
                    } else {
                        System.out.printf("%3d", field[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
