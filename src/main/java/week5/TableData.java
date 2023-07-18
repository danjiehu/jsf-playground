package week5;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

@ManagedBean
@SessionScoped
public class TableData {

	private ArrayList<Name> names;
	
//	public TableData() {
//		names = new ArrayList<Name>();
//		
//		Name n1 = new Name("William", "Dupont");
//		Name n2 = new Name("Harry", "Styles");
//		Name n3 = new Name("Jon", "BonJovi");
//	
//		names.add(n1);
//		names.add(n2);
//		names.add(n3);
//	}
	
	@PostConstruct
	public void init() {
		names = new ArrayList<Name>();
		
		Name n1 = new Name("William", "Dupont");
		Name n2 = new Name("Harry", "Styles");
		Name n3 = new Name("Jon", "BonJovi");
	
		names.add(n1);
		names.add(n2);
		names.add(n3);
	}
	
	// return the array list
	public ArrayList<Name> getNames() {
		return names;
	}
	
} // end of class
