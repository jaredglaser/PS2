package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven(){
		if(this.getiValue() % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if(this.getiValue() % 2 != 0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		for(int i=2;i<this.getiValue();i++) {
	        if(this.getiValue()%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean isEven(MyInteger i){
		if(i.getiValue() % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger i){
		if(i.getiValue() % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger x){
		for(int i=2;i<x.getiValue();i++) {
	        if(x.getiValue()%i==0)
	            return false;
	    }
	    return true;
	}
	
	public boolean equals(int i){
		if(this.iValue == i){
			return true;
		}
		else
			return false;
	}
	
	public boolean equals(MyInteger i){
		if(i.getiValue() == this.iValue){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
