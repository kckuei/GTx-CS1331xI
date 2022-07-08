public class Sort {

    public static void selectionSort(int[] list) {
        int minIndex;
        int nextSmallest;

        for (int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++) {
            minIndex = unSortedStart;
            for (int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++) {
                if (list[currentIndex] < list[minIndex]) {
                    minIndex = currentIndex;
                }
            }
            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    public static void main(String[] args) {
        int[] list = { 3, 2, 1, 5, 8, 6, 5, 10, 9 };
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}