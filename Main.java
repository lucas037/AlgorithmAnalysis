import java.util.ArrayList;
import java.util.Random;

class Main {
    public static void main(String args[]) {
        SorterData data;
        ArrayList<Integer> vet = new ArrayList<>();

        Random random = new Random();
        int range = 1000000;
        for (int i = 0; i < 1000; i++) {
            vet.add(random.nextInt(range));
        }

        System.out.println(" === 1,000 numbers ===");
        System.out.println("- BUBBLE SORT -");
        data = BubbleSort.sort(vet);
        System.out.println(data);

        System.out.println("- SELECTION SORT -");
        data = SelectionSort.sort(vet);
        System.out.println(data);

        System.out.println("- QUICK SORT -");
        data = QuickSort.sort(vet);
        System.out.println(data);



        for (int i = 0; i < 9000; i++) {
            vet.add(random.nextInt(range));
        }

        System.out.println(" === 10,000 numbers ===");
        System.out.println("- BUBBLE SORT -");
        data = BubbleSort.sort(vet);
        System.out.println(data);

        System.out.println("- SELECTION SORT -");
        data = SelectionSort.sort(vet);
        System.out.println(data);

        System.out.println("- QUICK SORT -");
        data = QuickSort.sort(vet);
        System.out.println(data);



        for (int i = 0; i < 90000; i++) {
            vet.add(random.nextInt(range));
        }

        System.out.println(" === 100,000 numbers ===");
        System.out.println("- BUBBLE SORT -");
        data = BubbleSort.sort(vet);
        System.out.println(data);

        System.out.println("- SELECTION SORT -");
        data = SelectionSort.sort(vet);
        System.out.println(data);

        System.out.println("- QUICK SORT -");
        data = QuickSort.sort(vet);
        System.out.println(data);
        
    }
}