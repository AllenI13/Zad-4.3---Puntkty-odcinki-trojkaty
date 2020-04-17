public class Test {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        Point point1 = new Point(1,1);
        Point point2 = new Point(-3,-4);
        Point point3 = new Point(3,-1);
        Section section = new Section(point, point1);
        Length length = new Length(section);
        System.out.println(point.firstQuarter());
        System.out.println(point1.secondQuarter());
        System.out.println(point2.thirdQuarter());
        System.out.println(point3.forthQuarter());
        System.out.println(point.xAxis());
        System.out.println(point1.yAxis());
        System.out.println(point2.center());
        System.out.println(length.trianglePossibility(point,point1,point2));
    }
}
