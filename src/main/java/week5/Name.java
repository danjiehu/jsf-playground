package week5;

public class Name {
	
	private String first;
	private String last;
	boolean canEdit; // default to false
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	// start of getters and setters
	public boolean isCanEdit() {
		return canEdit;
	}
	
	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	

} // end of class
