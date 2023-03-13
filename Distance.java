
/**
 * Write a description of class Distance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Distance
{
    // instance variables - replace the example below with your own
    private int feet;
    private int inches;

    /**
     * Constructor for objects of class Distance
     */
    public Distance(int feet,int inches)
    { this.feet=feet;
      this.inches=inches;  
    }
    public void setfeet(int feet){
    this.feet=feet;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getfeet(){
        return this.feet;
        
    }
    public void setinches(int inches){
    this.inches=inches;
    }
    public int getinches(){return this.inches;}    
    public void add(Distance d){
    this.feet+=d.feet;
    this.inches+=d.inches;
    if(this.inches>=12){
    this.feet++;
    this.inches=12;
    }
    }
    public void display(){
    System.out.println("Distance:"+this.feet+"feet"+this.inches+"inches");
    }
    public static void main (String[] args){
    Distance d1=new Distance (5,10);
    Distance d2=new Distance(3,6);
    d1.display();
    d2.display();
    d1.add(d2);
    d1.display();
    
    }
}
