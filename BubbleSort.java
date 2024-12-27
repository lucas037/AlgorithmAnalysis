import java.util.ArrayList;

public class BubbleSort {
    public static SorterData sort(ArrayList<Integer> vector) {
        ArrayList<Integer> vet = new ArrayList<>();
        vet.addAll(vector);

        SorterData stData = new SorterData();

        for (int i = 0; i < vet.size(); i++) {
            for (int j = i + 1; j < vet.size(); j++) {
                if (vet.get(i) > vet.get(j)) {
                    int aux = vet.get(i);
                    vet.set(i, vet.get(j));
                    vet.set(j, aux);
                }
            }
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
