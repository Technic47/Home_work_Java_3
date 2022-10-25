public class main {

    public static void main(String[] args) {
        int[] start = new int[2];
        int[] finish = new int[2];
        start[0] = 2;
        start[1] = 2;
        finish[0] = 7;
        finish[1] = 7;
        Field.begin(start[0], start[1]);
        MoveControl.begin(start[0], start[1]);
        MoveControl.backTrays(finish[0], finish[1]);
        Field.draw();
    }
}