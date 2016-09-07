package wood.model;

public class StatusOrder {
	
	
	private long id;
	
	private boolean status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
