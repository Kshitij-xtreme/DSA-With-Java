public class Operators {
    public static void main(String args[]){

        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println("Total problems solved: " + total);
        System.out.println("Difference in problems solved: " + difference);
        System.out.println("Projected problems solved this month: " + projected);  
        System.out.println("Average problems solved per day: " + average);
        System.out.println("Remaining problems to solve: " + remainder);


        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println (currentStreak == targetStreak);
        System.out.println (currentStreak != targetStreak);
        System.out.println (currentStreak > targetStreak);
        System.out.println (currentStreak < targetStreak);
        System.out.println (currentStreak >= targetStreak);
        System.out.println (currentStreak <= targetStreak);


        boolean completedDsa = true;
        boolean completedCore = false;

        System.out.println (completedDsa && completedCore);
        System.out.println (completedDsa || completedCore);
        System.out.println (!completedCore);

        


    }
}
