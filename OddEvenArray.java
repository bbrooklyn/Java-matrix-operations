import java.util.Scanner;

class OddEvenArray {
    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int i=0; i<= 9; i++) {
            numbers[i] = scan.nextInt();
        }
        int odd = 0, even = 0;

        for(int i=0; i<= numbers.length-1; i++) {
            if(numbers[i] % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }
        printArray(numbers);
        System.out.println(String.format("You have entered %s odd numbers and %s even numbers", odd,even));
        scan.close();
    }
}