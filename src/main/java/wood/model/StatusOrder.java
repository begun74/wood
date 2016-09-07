package wood.model;

public class StatusOrder {
	
	
	private int id;
	
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StatusOrder [id=" + id + ", status=" + status + "]";
	}

	
	

}
