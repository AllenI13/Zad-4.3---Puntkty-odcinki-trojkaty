import static java.lang.Math.sqrt;

public class Length {
    private Section section;
    public Length(Section section) {
        this.section = section;
    }
    public double sectionLength(){
        return sqrt(((section.getPoint1().getX()-section.getPoint().getX())*(section.getPoint1().getX()-
                section.getPoint().getX()))+((section.getPoint1().getY()-section.getPoint().getY())*
                (section.getPoint1().getY()-section.getPoint().getY())));
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Section getSection() {
        return section;
    }

    public boolean trianglePossibility(Point pointX, Point pointY, Point pointZ){
        if((pointX.getX()==pointY.getX()&&pointY.getX()==pointZ.getX()) ||(pointX.getY()==pointY.getY()&&pointY.getY()
                ==pointZ.getY())){
            return false;
        }
        else if((pointX.getX()==pointY.getX()&&pointX.getY()==pointY.getY())||(pointY.getX()==
                pointZ.getX()&&pointY.getY()==pointZ.getY())
                ||(pointX.getX()==pointZ.getX()&&pointX.getY()==pointZ.getY())){
            return  false;
        }
        else{
            return true;
        }

    }

}
