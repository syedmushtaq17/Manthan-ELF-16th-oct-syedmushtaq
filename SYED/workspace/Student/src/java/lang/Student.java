package java.lang;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private String name;
	public void setId(int i) {
		id=i;
	}
	public void setName(String string) {

		name=string;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
   
	
}
