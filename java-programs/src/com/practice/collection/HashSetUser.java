package com.practice.collection;
import java.io.Serializable;

public class HashSetUser implements Serializable {

	private static final long serialVersionUID = 1L;
	int id;
	String name;	
	public HashSetUser(int id,String name) {
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
		// downcasting the object.
		if (obj instanceof HashSetUser) {
			HashSetUser hsd= (HashSetUser)obj;
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
