public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean firstQuarter() {
        if (x > 0 && y > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean secondQuarter() {
        if (x < 0 && y > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean thirdQuarter() {
        if (x < 0 && y < 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean forthQuarter(){
        if (x > 0 && y < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean xAxis(){
        if (x==0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean yAxis() {
        if (y==0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean center() {
        if (x==0&&y==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
