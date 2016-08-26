package wood.test;

import java.util.List;
import java.util.Map;

public class Member {

	private  boolean newMember;

	private List<String> courses;
	
	private List<String> radios;

	private Map<Integer,String> ops;

	
	public boolean isNewMember() {
		return newMember;
	}

	public void setNewMember(boolean newMember) {
		this.newMember = newMember;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	

	public List<String> getRadios() {
		return radios;
	}

	public void setRadios(List<String> radios) {
		this.radios = radios;
	}


	public Map<Integer,String> getOps() {
		return ops;
	}

	public void setOps(Map<Integer,String> ops) {
		this.ops = ops;
	}

	@Override
	public String toString() {
		return "Member [newMember=" + newMember + ", courses=" + courses
				+ ", radios=" + radios + ", ops=" + ops + "]";
	}


	
	
	
	
}
