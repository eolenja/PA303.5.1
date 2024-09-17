public class Question1 {
            public static void main(String[] args) {
                int size = 10;


                System.out.print("     ");
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%4d", j);
                }
                System.out.println();
                System.out.print("    ");
                for (int j = 1; j <= size; j++) {
                    System.out.print("----");
                }
                System.out.println();


                for (int i = 1; i <= size; i++) {

                    System.out.printf("%2d |", i);

                    for (int j = 1; j <= size; j++) {
                        System.out.printf("%4d", i * j);
                    }
                    System.out.println();
                }
            }
        }


