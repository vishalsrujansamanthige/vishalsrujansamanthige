import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        countOfMultiples();
    }

    private static void countOfMultiples() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Input number of elements: ");
        int in = scanner.nextInt();

        for (int i = 0; i < in; i++) {
            System.out.print("Input number: ");
            list.add(scanner.nextInt());
        }
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        for (int i = 0; i < list.size(); i++) {
            int j = 2;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count2++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count3++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count4++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count5++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count6++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count7++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count8++;
            j++;
            if (Math.floorMod((Integer) list.get(i), j) == 0)
                count9++;


        }
        scanner.close();
        System.out.println("{1:" + list.size() + ",2:" + count2 + ",3:" + count3 + ",4:" + count4 + ",5:" + count5 + ",6:" + count6 + ",7:" + count7 + ",8:" + count8 + ",9:" + count9 + "}");
    }
}