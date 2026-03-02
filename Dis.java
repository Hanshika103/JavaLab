class Distance {
    int meter;
    int centimeter;
    int millimeter;

    // Method to take input values
    void set(int m, int c, int mm) {
        meter = m;
        centimeter = c;
        millimeter = mm;
    }

    // Method to add two Distance objects
    Distance add(Distance d) {
        Distance result = new Distance();

        result.millimeter = this.millimeter + d.millimeter;
        result.centimeter = this.centimeter + d.centimeter;
        result.meter = this.meter + d.meter;

        // Conversion
        result.centimeter += result.millimeter / 10;
        result.millimeter = result.millimeter % 10;

        result.meter += result.centimeter / 100;
        result.centimeter = result.centimeter % 100;

        return result;
    }

    // Method to display distance
    void display() {
        System.out.println("Distance = " + meter + " m "
                + centimeter + " cm "
                + millimeter + " mm");
    }
}

public class Dis {
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.set(2, 75, 8); // 2m 75cm 8mm
        d2.set(3, 50, 6); // 3m 50cm 6mm

        Distance sum = d1.add(d2);

        System.out.println("First Distance:");
        d1.display();

        System.out.println("Second Distance:");
        d2.display();

        System.out.println("Total Distance:");
        sum.display();
    }
}