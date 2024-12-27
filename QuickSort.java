import java.util.ArrayList;

public class QuickSort {
    public static SorterData sort(ArrayList<Integer> vector) {
        ArrayList<Integer> vet = new ArrayList<>();
        vet.addAll(vector);

        SorterData stData = new SorterData();

        quickSort(vet, 0, vet.size() - 1);
        
        stData.finish();
        return stData;
    }

    public static void quickSort(ArrayList<Integer> vet, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(vet, low, high);
            
            quickSort(vet, low, pivotIndex - 1);
            quickSort(vet, pivotIndex + 1, high);
        }
    }
    
    public static int partition(ArrayList<Integer> vet, int low, int high) {
        int pivot = vet.get(high);
        
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (vet.get(j) < pivot) {
                i++;
                int temp = vet.get(i);
                vet.set(i, vet.get(j));
                vet.set(j, temp);
            }
        }
        
        int temp = vet.get(i + 1);
        vet.set(i + 1, vet.get(high));
        vet.set(high, temp);
        
        return i + 1;
    }
    
}
