public class Question3 {
    public static void main(String[] args) {
        final double initialTuition = 10000.0;
        final double increaseRate = 0.07;
        double currentTuition = initialTuition;
        double targetTuition = initialTuition * 2;
        int years = 0;

        while (currentTuition < targetTuition) {
            currentTuition += currentTuition * increaseRate;
            years++;
        }

        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}