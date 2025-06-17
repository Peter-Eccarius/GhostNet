import jakarta.persistence.*;
import jakarta.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import jakarta.inject.Named;

@Named
@ApplicationScoped
@Entity
public class Net implements Serializable
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	private String size;
    private String state;
    private String person;
    private String longitude;
    private String latitude;
	
    public Net() {
    	
    }
    
    public Net(String size, String state, String person, String longitude, String latitude) {
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
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}