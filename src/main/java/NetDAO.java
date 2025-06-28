import java.util.Arrays;
import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

@Named("action")
@ApplicationScoped
public class NetDAO{

	private Net net = createDefaultNet();
	private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GhostNetPersistenceUnit");
	
	 //Grössen-Liste erstellen
    private List<String> sizes = Arrays.asList("XS","S","M","L","XL");
    
    public List<String> getSizes() {
    	return sizes;
    }
    
    //Status-Liste erstellen
    private List<String> states = Arrays.asList("gemeldet","Bergung bevorstehend","geborgen","verschollen");
    public List<String> getStates() {
    	return states;
    }
    
    private Net createDefaultNet() {
    	Net defaultNet = new Net();
    	defaultNet.setState("gemeldet");
    	defaultNet.setSize("M");
    	return defaultNet;
    }
	
	public List<Net> getNets(){
	    	EntityManager em = emf.createEntityManager();
	    	Query q = em.createQuery("select n from Net n");
	    	List<Net> netze = q.getResultList();
	    	return netze;
	}
	
	public List<Net> getActiveNets(){
    	EntityManager em = emf.createEntityManager();
    	Query q = em.createQuery("select n from Net n where n.state in ('gemeldet','Bergung bevorstehend') order by n.state asc");
    	List<Net> netze = q.getResultList();
    	return netze;
    }
	
	public List<Net> getTodoNets(){
    	EntityManager em = emf.createEntityManager();
    	Query q = em.createQuery("select n from Net n where n.state = 'gemeldet' order by n.state asc");
    	List<Net> netze = q.getResultList();
    	return netze;
    }
	
	public List<Net> getDoneNets(){
    	EntityManager em = emf.createEntityManager();
    	Query q = em.createQuery("select n from Net n where n.state in ('gemeldet', 'Bergung bevorstehend') order by n.state asc");
    	List<Net> netze = q.getResultList();
    	return netze;
    }
	
	public String saveNets() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
			em.merge(net);
		t.commit();
		
		return "menu";
	}
	
	public String saveTodo(Net lostNet) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
			lostNet.setState("Bergung bevorstehend");
			em.merge(lostNet);
		t.commit();
		
		return "lost";
	}
	
	public String saveLost(Net lostNet) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
			lostNet.setState("verschollen");
			em.merge(lostNet);
		t.commit();
		
		return "lost";
	}
	
	public String saveDone(Net lostNet) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
			lostNet.setState("geborgen");
			em.merge(lostNet);
		t.commit();
		
		return "todo";
	}

	public Net getNet() {
		return net;
	}
	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
	public void setNet(Net net) {
		this.net = net;
	}
}