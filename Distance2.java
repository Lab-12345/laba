public class Distance2 {
    // instance variables
    private int feet;
    private int inches;

    /**
     * Constructor for objects of class Distance
     */
    public Distance2(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }

    // Copy constructor
    public Distance2(Distance2 d) {
        this.feet = d.feet;
        this.inches = d.inches;
    }

    // Setter and getter methods for feet
    public void setFeet(int feet) {
        this.feet = feet;
    }
    public int getFeet() {
        return this.feet;
    }

    // Setter and getter methods for inches
    public void setInches(int inches) {
        this.inches = inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }
    public int getInches() {
        return this.inches;
    }

    // Method to add two distances
    public void add(Distance2 d) {
        this.feet += d.feet;
        this.inches += d.inches;
        if (this.inches >= 12) {
            this.feet++;
            this.inches -= 12;
        }
    }

    // Method to display the distance
    public void display() {
        System.out.println("Distance: " + this.feet + " feet " + this.inches + " inches");
    }

    // Method to clone a distance object
    public Distance2 clone() {
        return new Distance2(this.feet, this.inches);
    }

    public static void main(String[] args) {
        Distance2 d1 = new Distance2(5, 10);
        Distance2 d2 = new Distance2(d1);
        Distance2 d3 = d1.clone();

        d1.display();
        d2.display();
        d3.display();

        d2.setFeet(3);
        d2.setInches(6);

        d1.display();
        d2.display();
        d3.display();
    }
}
