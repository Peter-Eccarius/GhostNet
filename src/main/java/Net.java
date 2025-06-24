import jakarta.persistence.*;
import java.io.Serializable;


@Entity
public class Net implements Serializable
{	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	private String size;
    private String state;
    private String person;
    private Double longitude;
    private Double latitude;
  
    public Net() {	
    }
    
    public Net(String size, String state, String person, Double longitude, Double latitude) {
    	this.size = size;
    	this.state = state;
    	this.person = person;
    	this.longitude = longitude;
    	this.latitude = latitude;
    }
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
}