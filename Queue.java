import java.util.ArrayList;

public class Queue {
    static ArrayList<Integer[]> db = new ArrayList<Integer[]>();

    public static void remove() {
        db.remove(0);
    }

    public static void add(int i, int j) {
        Integer[] number = new Integer[] {i, j};
        db.add(number);
    }

}
