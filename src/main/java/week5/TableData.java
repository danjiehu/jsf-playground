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
	
	public void saveAction() {
		for(Name name:names) {
			name.setCanEdit(false);
		}
	}
	
	// input a name object, set it to can edit once passed in
	public void editName(Name name) {
		name.setCanEdit(true);
		// return null;
	}
	
	// return the array list
	public ArrayList<Name> getNames() {
		return names;
	}
	
} // end of class
