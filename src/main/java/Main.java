public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        Point p3 = new Point(5.0, 6.0);

        PolyLine polyLine1 = new PolyLine(p1, p2, p3);
        PolyLine polyLine2 = new PolyLine(p1, p2, p3);
        PolyLine polyLine3 = new PolyLine(p1, p3);

        System.out.println("polyLine1 equals polyLine2: " + polyLine1.equals(polyLine2)); // true
        System.out.println("polyLine1 equals polyLine3: " + polyLine1.equals(polyLine3)); // false
    }
}