class Box
{
double width;
double height;
double depth;
void vol(){
System.out.println("volume is");
System.out.println(width*height*depth);
}
}
class Boxdemo2{
	public static void main(String args[]){
		Box mybox1=new Box();
                Box mybox2=new Box();
		double vol;
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=15;
                mybox2.width=3;
		mybox2.height=6;
		mybox2.depth=9;
mybox1.vol();
mybox2.vol();
}
}