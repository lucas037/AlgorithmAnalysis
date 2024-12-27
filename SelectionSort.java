import java.util.ArrayList;

public class SelectionSort {
    public static SorterData sort(ArrayList<Integer> vector) {
        ArrayList<Integer> vet = new ArrayList<>();
        vet.addAll(vector);

        SorterData stData = new SorterData();

        for (int i = 0; i < vet.size() - 1; i++) {
            int indexSmallest = i;
            int valueSmallest = vet.get(i);

            for (int j = i + 1; j < vet.size(); j++) {
                if (vet.get(j) < valueSmallest) {
                    valueSmallest = vet.get(j);
                    indexSmallest = j;
                }
            }

            vet.set(indexSmallest, vet.get(i));
            vet.set(i, valueSmallest); 
        }
        
        stData.finish();
        return stData;
    }

    public static String toString(ArrayList<Integer> vector) {
        if (vector.size() <= 0)
            return "";

        String str = "["+vector.get(0);
        for (int i = 1; i < vector.size(); i++)
            str += ", "+vector.get(i);


        return str+"]";
    }
}
