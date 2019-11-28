package jjunit;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	private DBUitl dbUitl;

	public Filter(DBUitl dbUitl) {
		this.dbUitl = dbUitl;
	}
	
	public List<String> myFilter(){
		List<String> newList =new ArrayList<String>();
	List<String> dbList=dbUitl.getNames();
		
		for(String name:dbList) {
			if(name.startsWith("A"))
			newList.add(name);
		}
		return newList;
	}

}
