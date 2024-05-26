import java.util.*;

class Max_Hash {

    public static void maxElements(int num[]) {
        int n = num.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > (n / 3)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 3, 2, 3, 1, 3, 1, 3, 1 };
        maxElements(num);
    }
}
