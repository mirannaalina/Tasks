package Tasks;

public class JuniorJavaDeveloper {

    static int javaLevel = 0;

    public static void dailyLearning(int hours) {
        javaLevel += hours;
    }

    private static void weeklyLearning() {
        for (int i = 0; i < 5; i++) {
            dailyLearning(3);
        }

        int dayNumber = 6;
        while (dayNumber <= 7) {
            dailyLearning(7);
            dayNumber++;
        }

    }

    public static void main(String[] args) {
        int weekCount = 1;

        do {
            weeklyLearning();
            weekCount++;

        } while (weekCount <= 4);

        String[] courseModules = new String[]{
                "Data types and variables",
                "Operators and casts",
                "Control Flow",
                "Loops",
                "Arrays",
                "Object-oriented programming",
                "Varargs",
                "Date, time",
                "Regular expressions"};

        for (int moduleIndex = 0; moduleIndex < 8; moduleIndex++) {
            System.out.println(" -" + courseModules[moduleIndex]);

        }

        System.out.println("\n Final Score: " + JuniorJavaDeveloper.javaLevel);

    }


}



