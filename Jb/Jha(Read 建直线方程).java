//当程序要求输入时 才调用buffered进行输入 65 ~ 76；
import java.io.*;
class point{

	int x;
	int y;
	point (int x,int y ){
		this.x = x;
		this.y = y;
		}
	point(){
		x = 0;
		y = 0;
		
		}
	public String toString (){
		return"The point is x = "+x+" , y = "+y;
		
		}
	
}
class line{

	point p1;
	point p2;
	
	line(point a,point b){
		p1 = a;
		p2 = b;
	}
	line(){
		p1 = new point();
		p2 = new point();
	}
	
	public String Cline(){
		try{
		double k = (p1.y -p2.y )/( p1.x -p2.x );
		double b = p1.y - k * p1.x ;
		
		
		return"y = "+k+" * x +"+b;
	}catch(Exception e ){								//分母为零产生异常
			
			return"x = "+p1.x;
		
		}
	}
}
public class Jha{

	public static void main(String args[]){
		
		point p1 ;
		point p2 ; 
		
		line l1;
		
		int a [] = new int[2];
		int b [] = new int[2];
		
		System.out.println("Please put two line' x , y:");
		
		try{
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				for(int i = 0;i<2;i++){ 
						a[i] = Integer.parseInt(br.readLine());								
					}
				
				for(int i = 0;i<2;i++){
						b[i] = Integer.parseInt(br.readLine());
					}
				
				for(int i = 0;i<5;i++){																//当程序要求输入时 才调用buffered进行输入
						System.out.println(Integer.parseInt(br.readLine()));
					}
				
			}catch(Exception e ){}
		p1 = new point(a[0],a[1]);
		p2 = new point(b[0],b[1]);
				
		l1 = new line(p1,p2);
		
		System.out.print("\n");
		
		System.out.println("The line is:");
		
		System.out.println(l1.Cline()+"\n");
		}

}