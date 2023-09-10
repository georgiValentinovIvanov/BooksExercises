package BooksExercises;

public class TriangleOf55Stars {
    public static void main(String[] args) {
        int row, star;

        for (row = 1; row <= 10; row++) {
            for (star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}