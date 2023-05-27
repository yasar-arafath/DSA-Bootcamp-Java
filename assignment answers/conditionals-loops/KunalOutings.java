public class KunalOutings {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int count = 0;

        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }

        System.out.println("Kunal can go out " + count + " days in August.");
    }
}
