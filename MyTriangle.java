
/**
 * MyTriangle class represents a geometric triangle
 * and calculates the area and perimeter
 * 
 * @author Olga Sirotinsky
 * @version (standard) shape heirarchy
 */
public class MyTriangle extends MyShape{
  /**
   * constructor for MyTriangle
   * 
   * @param base The base width of the triangle shape
   * @param height The height of the triangle shape
   */ 
  public MyTriangle(int base, int height){
    //call super class constructor with given parameters
    super(base, height); 
  }
  
  /**
   * Override of inherited method.
   * calculates the area of the triangle
   * @return the area 
   * area = ½ bh
   */
  public double getArea() {
      //calculate area 
    return (1.0/2.0)*width*height; 
  }
  
  /**
   * calculates perimeter of triangle assuming its a right triangle
   * find hypoteneuse length based on pathagorean theorem.
   * @return the perimeter  
   */
   public double getPerimeter(){
       //calculate perimeter
       return width+height+ Math.sqrt((height*height)+(width*width));
    }
    
  /**
   * Override of inherited method.
   *
   * @return "triangle" the name of the shape
   */
   public String getName() {
    return "triangle";
  }
  
}