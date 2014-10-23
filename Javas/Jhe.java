public class Jhe{

	public static void main(String args[]){
		Myset set = new Myset();
		A a1 = new A();
		A a2 = new A();
		set.add(a1);
		a1.a = 44;
		set.add(a2);
		
		Object [] ad = set.getAll();
		for(Object o:ad){
			System.out.println(o);
		}
	}
}

class A{
	int a = 33;
	public String s = "HH";
	public String toString (){
		return "a = "+ a +" s = "+s;
	}
	public boolean equals(Object obj){
		A ta = (A)obj;
		if((this.a == ta.a)&&(this.s.equals(ta.s))){
			return true;
		}
		return false;
	}	
}