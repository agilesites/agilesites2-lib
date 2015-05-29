package wcs.api;

public enum AssetDeps {
	NONE("none"), EXACT("exact"), EXISTS("exists");

	private String value;

	private AssetDeps(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

}
