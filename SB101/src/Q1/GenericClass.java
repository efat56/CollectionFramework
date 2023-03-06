package Q1;

public class GenericClass<T> {
	
	private T t1;
	int val = 50;

	public GenericClass(T t1, int val) {
		super();
		this.t1 = t1;
		this.val = val;
	}
	
	public GenericClass() {
		
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	

}
