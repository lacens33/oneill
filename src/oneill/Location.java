package oneill;

public class Location {
    public int currX; //a jelenlegi X poz�ci�
    public int currY; //a jelenlegi Y poz�ci�
// constructor
public Location(int x, int y) {
   currX = x;      
   currY = y;
}
    // getter
    public int getX() { return currX; }
    public int getY() { return currY; }
    // setter
    public void setX(int newValue) { currX = newValue; 
    System.out.println("New x=value"+newValue);}
    public void setY(int newValue) { currY = newValue; }
 }