/**
 * This class represents a simply plane geometry square.
 * It is one of the example classes in the Inheritance
 * discussion.
 * 
 * @author Dan Jinguji
 * @author Olga Sirotinsky
 * @version 0.2 (standard) shape heirarchy
 */
public class MySquare extends MyRectangle {
  
  /**
   * Constructor for MySquare.
   * 
   * @param int s The length of the side
   */
  public MySquare(int s) {
    super(s, s);
  }
  
  /**
   * calculates perimeter of square at given value
   * @return the perimeter 
   */
   public double getPerimeter(){
       return (4.0)*height;
    }
  // no getArea ... why?
  // 1) squares do not have area
  // 2) it was inherited from the superclass
 
  
  /**
   * Get the name of the shape type. This is a 
   * method that "replaces" the inherited one.
   * The term for this is "override".
   */
  public String getName() {
    return "square";
  }

}
