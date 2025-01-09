public class Lab01_Q3 {
    public static void main(String[] args) {
        double totalAreaWorld = 510072000;
        double totalAreaTurkey = totalAreaWorld / 6510.42;

        double dryAreaWorld = totalAreaWorld * 29.2 / 100;
        double waterAreaWorld = totalAreaWorld - dryAreaWorld;

        double dryAreaTurkey = totalAreaTurkey / 77 * 76;
        double waterAreaTurkey = totalAreaTurkey - dryAreaTurkey;

        double dryLandPercent = 100 * dryAreaTurkey / dryAreaWorld;
        double waterPercent = 100 * (waterAreaWorld - waterAreaTurkey) / waterAreaWorld;

        System.out.println();
        System.out.println("Turkey has " + dryAreaTurkey + " km2 dry land and " + waterAreaTurkey + " km2 water.");
        System.out.println("Earth has " + dryAreaWorld + " km2 dry land and " + waterAreaWorld + " km2 water.");
        System.out.println("Turkey has " + dryLandPercent + " percent of the Earth's dry land.");
        System.out.println("Percentage of Earth water outside Turkey is " + waterPercent + " percent.");
        System.out.println();
    }
}
