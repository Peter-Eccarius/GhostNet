public class User{
	private String name;
	private String telnr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelnr() {
		return telnr;
	}
	public void setTelnr(String telnr) {
		this.telnr = telnr;
	}
	public User(String name, String telnr) {
		this.name = name;
		this.telnr = telnr;
	}
	
	public boolean anonymLogin() {
		return name != null && !name.isEmpty() && (telnr == null || telnr.isEmpty());
	}
	
	public boolean fullLogin() {
		return name != null && !name.isEmpty() && telnr != null && !telnr.isEmpty();
	}
}