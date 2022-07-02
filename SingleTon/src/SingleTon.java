
public class SingleTon {
	private static final SingleTon single;
	static{
		single=new SingleTon();
	}
	private SingleTon(){
		
	}
	static SingleTon getObject(){
		return single;
	}
}
