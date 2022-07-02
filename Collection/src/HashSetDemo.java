import java.io.Serializable;

public class HashSetDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	int id;
	String name;	
	public HashSetDemo(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		if (obj instanceof HashSetDemo) {
			HashSetDemo hsd= (HashSetDemo)obj;
			if (this.id==hsd.id) {
				isSame=true;
			}			
		}
		return isSame;
	}
	@Override
	public String toString() {
		return (this.id+" ------------"+this.name);
	}
	
}
