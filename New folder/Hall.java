
package samplefinalsolution;
public class Hall extends Room{
    private double size = 100;
    private String wallColor;

    public Hall(double size, String wallColor, int number) {
        super(number);
        setSize(size);
        this.wallColor = wallColor.toLowerCase();
    }

    public double getSize() {
        return size;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setSize(double size) {
        if(size > 0)
            this.size = size;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }
    
    @Override
    public String toString(){
        String s = "Hall :" + size + "m2, " + wallColor + "walls, " + super.toString();
        return s;
    }   
}
