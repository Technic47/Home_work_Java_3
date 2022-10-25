public class MoveControl {
    static int[][] field = Field.field;
    static int temp = 0;

    public static void begin(int i, int j) {
        Queue.add(i, j);
        int k = (Queue.db.get(0))[0];
        int p = (Queue.db.get(0))[1];
        move(k, p);
    }

    static void move(int i, int j) {
        upMove(i, j);
        rightMove(i, j);
        downMove(i, j);
        leftMove(i, j);

        Queue.remove();
        if (Queue.db.isEmpty()) {
            return;
        } else {
            int k = (Queue.db.get(0))[0];
            int p = (Queue.db.get(0))[1];
            move(k, p);
        }

    }

    static void upMove(int i, int j) {
        if (i != 0) {
            if (field[i - 1][j] == 0) {
                field[i - 1][j] = field[i][j] + 1;
                Queue.add(i - 1, j);
            }
        }
    }

    static void rightMove(int i, int j) {
        if (j < field[i].length - 1) {
            if (field[i][j + 1] == 0) {
                field[i][j + 1] = field[i][j] + 1;
                Queue.add(i, j + 1);
            }
        }
    }

    static void downMove(int i, int j) {
        if (i < field.length - 1) {
            if (field[i + 1][j] == 0) {
                field[i + 1][j] = field[i][j] + 1;
                Queue.add(i + 1, j);
            }
        }
    }

    static void leftMove(int i, int j) {
        if (j != 0) {
            if (field[i][j - 1] == 0) {
                field[i][j - 1] = field[i][j] + 1;
                Queue.add(i, j - 1);
            }
        }
    }

    
    public static void backTrays(int i, int j) {
        Queue.add(i, j);
        int k = (Queue.db.get(0))[0];
        int p = (Queue.db.get(0))[1];
        findWay(k, p);
    }
    
    public static void findWay(int i, int j) {
        
        if (upfind(i, j)) {
            int k = (Queue.db.get(0))[0];
            int p = (Queue.db.get(0))[1];
            findWay(k, p);
        } else {
            if (rightfind(i, j)) {
                int k = (Queue.db.get(0))[0];
                int p = (Queue.db.get(0))[1];
                findWay(k, p);
            } else {
                if (downfind(i, j)) {
                    int k = (Queue.db.get(0))[0];
                    int p = (Queue.db.get(0))[1];
                    findWay(k, p);
                } else {
                    if (leftfind(i, j)) {
                        int k = (Queue.db.get(0))[0];
                        int p = (Queue.db.get(0))[1];
                        findWay(k, p);
                    } else {
                        return;
                    }
                }
            }

        }
    }

    static boolean upfind(int i, int j) {
        boolean res = false;
        if (i != 0) {
            if (field[i - 1][j] < field[i][j]) {
                Queue.add(i - 1, j);
                Queue.remove();
                field[i][j] = 66;
                res = true;
            }
        }
        return res;
    }

    static boolean rightfind(int i, int j) {
        boolean res = false;
        if (j < field[i].length - 1) {
            if (field[i][j + 1] < field[i][j]) {
                Queue.add(i, j + 1);
                Queue.remove();
                field[i][j] = 66;
                res = true;
            }
        }
        return res;
    }

    static boolean downfind(int i, int j) {
        boolean res = false;
        if (i < field.length - 1) {
            if (field[i + 1][j] < field[i][j]) {
                Queue.add(i + 1, j);
                Queue.remove();
                field[i][j] = 66;
                res = true;
            }
        }
        return res;
    }

    static boolean leftfind(int i, int j) {
        boolean res = false;
        if (j != 0) {
            if (field[i][j - 1] < field[i][j]) {
                Queue.add(i, j - 1);
                Queue.remove();
                field[i][j] = 66;
                res = true;
            }
        }
        return res;
    }
}
