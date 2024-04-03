
public class Main {
    public static void main(String[] args) {
        int[] massiv1 = {2, 3, 4, 5, 6, 7};
        printArray("исходный массив", massiv1);
        bubbleSort(massiv1);
        printArray("упорядоченый массив", massiv1);

    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + " " + massiv.length + "чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i] + " ");

        }
        System.out.println();
    }

    public static void bubbleSortImpoved(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                //пройти по массиву от началб проверяя попарно каждый элемент со следующим
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {//поменять местами, для этого вводим доп переменную
                        int t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                        sorted = false;
                    }
                }
            }
        }
    }
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] sortArr = {2, 3, 4, 5, 6, 7};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }


