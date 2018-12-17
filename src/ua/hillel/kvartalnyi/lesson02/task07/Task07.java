package ua.hillel.kvartalnyi.lesson02.task07;

public class Task07 {

    public static void main(String[] args) {
        int[] mas = {2, 0, 4, 9, 5, 3, 6, 8, 7, 33, 34};
        int sum = 0;
        float sr;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        sr = sum / mas.length;
        System.out.println(sr);

    }
}
