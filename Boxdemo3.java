class Box
{
double width;
double height;
double depth;
double vol()
{
return width*height*depth;
}
void setDim(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class Boxdemo3{
	public static void main(String args[]){
		Box mybox1=new Box();
Box mybox2=new Box();
		double vol;
		mybox1.setDim(10,20,15);
		mybox2.setDim(3,6,9);
vol=mybox1.vol();
System.out.println("volume is"+ vol);
vol=mybox2.vol();
System.out.println("volume is"+ vol);
}
}