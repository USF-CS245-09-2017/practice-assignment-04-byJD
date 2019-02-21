public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;

            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index])
                    index = j;

            int min = a[index];
            a[index] = a[i];
            a[i] = min;
        }

    }
}
