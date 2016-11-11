package Vechile;

public class Box {
	private static String me = "Mega";
	
double wight;
double height;
double depth;
//--------------------------------------------------

Box(double w,double h,double d){
	this.wight = w;
	this.height = h;
	this.depth = d;
}

Box(){
	this(-1,-1,-1);
	
}
Box (double quad){
	this(quad,quad,quad);
}
static void whoami(){
	System.out.println(me);
}

//-----------------------------------------------
public double getWight() {
	return wight;
}
public void setWight(double wight) {
	this.wight = wight;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getDepth() {
	return depth;
}
public void setDepth(double depth) {
	this.depth = depth;
}
double volume(){
	return this.wight*this.depth*this.height;
}


	
	

}
