package metier;

public abstract class Boisson {

	protected String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double calculCout();
}
