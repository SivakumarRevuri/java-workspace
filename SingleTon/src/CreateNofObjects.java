// w a j p to allow create a object n of times

public class CreateNofObjects {

	private static final CreateNofObjects single;
	
	static{
		single=new CreateNofObjects();
	}
	private static int count=0;
	
	private CreateNofObjects() {
		
	}
	static CreateNofObjects getObj(){
		if (count<5) {
			count++;
			return single;
		}else
		return null;
	}

}
