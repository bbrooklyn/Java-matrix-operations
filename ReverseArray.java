public class ReverseArray {
    public static void printArray(String[] array) {
        for (String item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
    }
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int x = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[x] = array[i];
            x += 1;
        }
        return reversedArray;
    }
    public static void main(String[] args) {
        String[] array = { "Hello", "World" };
        String[] reversedArray = reverse(array);
        printArray(reversedArray);
    }
}
