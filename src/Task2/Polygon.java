package Task2;

public class Polygon {
	private Point[] verticles;
	
    public Polygon(Point[] verticles){
        this.verticles = verticles;
    }
    
    public int getEdgesQuantity(){
        return verticles.length;
    }
    
    public Point getVerticle(int verticleIndex){
    	return verticles[verticleIndex];
    }
}
