package wood.model;

public class SelectPart {
	
	private String id;
	
	private String c;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCount() {
		return c;
	}

	public void setCount(String count) {
		this.c = count;
	}

	@Override
	public String toString() {
		return "SelectPart [id=" + id + ", count=" + c + "]";
	}
	
	
	

}
