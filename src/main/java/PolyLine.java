import java.util.Arrays;

class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double len1 = points[i + 1].x - points[i].x;
            double len2 = points[i + 1].y - points[i].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Arrays.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}
