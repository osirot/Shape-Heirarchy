
/**
 * Write a description of class MyEllipse here.
 * 
 * @author Olga Sirotinsky 
 * @version (standard) shape heirarchy
 */
public class MyEllipse extends MyShape{
    /**
     *  constructor of MyEllipse shape
     *  @param h the height(minor axis b) of the shape
     *  @param w the width(major axis a) of the shape 
     */
    public MyEllipse(int h, int w){
      //call super constructor with given parameters
        super(h, w);
    }

    /**
     * Override of inherited area method. 
     * @return the calculated area of the ellipse.
     * area = ¼ π ab
     */
    public double getArea() {
        //calculate area
        return (1.0/4)*Math.PI*height * width;
    }

    /**
     * An Override of inherited perimeter method
     * @return the calculated perimeter using Ramanujan formuala
     * P ≈ ½π [ 3(a + b) − √(3a + b)(a + 3b) ]
     */
    public double getPerimeter(){
        //calculate perimeter
        return(1.0/2.0)*Math.PI*((3*(width+height))-(Math.sqrt((3*width+height)*(width+3*height)))); 
    }

    /**
     * An Override of inherited name method.
     * @return string name for ellipse
     */
    public String getName() {
        return "ellipse";
    }
}