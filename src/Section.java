import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Section {
    public void setPoint(Point point) {
        this.point = point;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint() {
        return point;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    private Point point;
    private Point point1;
    private Point point2;
    public Section(Point point, Point point1){
        this.point = point;
        this.point1 = point1;
    }
    public double sectionLength(){
        return sqrt(((point1.getX()-point.getX())*(point1.getX()-point.getX()))+((point1.getY()-point.getY())*
                (point1.getY()-point.getY())));
    }
}
