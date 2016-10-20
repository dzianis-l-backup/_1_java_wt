package Task2;

public class Algorithm {
	Polygon polygon;
	public Algorithm(){
		polygon = new Polygon(
				new Point[]{
						new Point(-4,5),new Point(4,5),
						new Point(4,0),new Point(6,0),
						new Point(6,-3),new Point(-6,-3),
						new Point(-6,0),new Point(-4,0) 
						});
	}
	
	//comparison of rectangle square
	
	public boolean run(int x, int y){//true - inside the polygon, false - outside the polygon
		
		 Point c  = new Point(x, y);
	     int result = 1;
	     int n = polygon.getEdgesQuantity();
	     for(int i = 0; i < n - 1; i++){
	         result *= checkCross( polygon.getVerticle(i), polygon.getVerticle(i+1), c);
	     }
	     result *= checkCross( polygon.getVerticle(polygon.getEdgesQuantity()-1), polygon.getVerticle(0), c);
	     
	     if(result <= 0){
	         return true;
	     }
	     return false;		
	}
	
	public int checkCross(Point v1,Point v2,Point c){//-1 if line crosses an edge
		 int ax = v1.getX() - c.getX();
	        int ay = v1.getY() - c.getY();
	        int bx = v2.getX() - c.getX();
	        int by = v2.getY() - c.getY();

	        if(ay*by > 0){
	            return 1;
	        }

	        int signum = Long.signum(ax*by - ay*bx);
	        if(signum == 0){
	            if(ax*bx <= 0){
	                return 0;
	            }
	            return 1;
	        }
	        if(ay < 0){
	            return -signum;
	        }
	        if(by < 0){
	            return signum;
	        }

	        return 1;
	}
	
	public static void main(){
		Algorithm al = new Algorithm();
		System.out.println(al.run(0, 0));
		System.out.println(al.run(3, 4));
		System.out.println(al.run(4, 2));
		System.out.println(al.run(4, 5));
		System.out.println(al.run(-6, -3));
		System.out.println(al.run(1, 1));
	}
}
