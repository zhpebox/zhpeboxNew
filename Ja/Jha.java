/*输入任意两点，输出直线方程
*/
import java.io.*;
class bed{
	int size[] ={200,300};
	String belongs =new String("zhang peng");
	String yangzi = new String("Up bed");
	public String toString(){
		return belongs+' ' +yangzi;
	}
}
class point {
	 int i = 0;
	 int j = 0;
	point(int i,int j){
		this.i = i;
		this.j = j;
	}
	point(){
		System.out.println("the point is your yuandian");
		System.out.println("Please put in an other two numbers:");
	}
	public String toString (){
		return"The point is"+" "+"i="+i+" j= "+j;
	}
}
class line{
	private point a1;
	private point a2;
	line(point a1,point a2){
		this.a1 = a1;
		this.a2 = a2;
	}
	public void Strings(){
	try{
		double k = (a2.j - a1.j)/(a2.i - a1.i);
		double b = a2.j - k*a2.i;
		System.out.println("The line is y ="+k+"x+"+b);
	}catch(Exception e){
		System.out.println("The line is x ="+a1.i );
	}
	}
}
public class Jha{
	public static void main(String args[]){
		bed a = new bed();
		int bs[] = new int[4];
		System.out.println(a.toString());
		System.out.println("you could put in two line(i = ?,j =?)");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i = 0;i<4;i++){
				bs[i] = Integer.parseInt(br.readLine());
			}
			
		}catch(Exception e){}
		point a1 = new point(bs[0],bs[1]);
		point a2 = new point(bs[2],bs[3]);
		line l1 = new line(a1,a2);
		l1.Strings();
	}
}
