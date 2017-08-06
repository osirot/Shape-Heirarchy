
/**
 * MyCircle class represents a basic circle. 
 * This class finds the perimeter and area of the shape. 
 * 
 * @author Olga Sirotinsky 
 * @version (standard) shape heirarchy
 */
public class MyCircle extends MyEllipse{
    /**
     * constructor for circle shape
     * @param d the diameter of the circle
     */
    public MyCircle(int d){
      //call the super constructor using parameter
        super(d, d);
    }

    /**
     * Override of inherited method. 
     * @return the calculated area of the circle
     * area = ¼ π d2 
     */
    public double getArea() {
        //calculate area
        return (1.0/4.0)*Math.PI*(height*height);
    }

    /**
     * Override of inherited method.
     * calculates perimeter of circle
     * @return the perimeter 
     * Circle: 2 π r
     */
    public double getPerimeter(){
        //calculate perimeter
        return Math.PI*(height);
    }

    /**
     * Override of inherited method. 
     * @return the name of the circle
     */
    public String getName() {
        return "circle";
    }
}
