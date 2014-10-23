
public class Myset{

	Object[] objs = new Object[0];
	public boolean add(Object obj){
	
		for(Object e: objs){
			if(e.equals(obj))
				return false;
		}
		Object[] objs1 = new Object[objs.length + 1];
		System.arraycopy(objs,0,objs1,0,objs.length);
		objs1[objs.length] = obj;
		objs = objs1;
		return true;
	}
}