
public class AirportTask implements Task, ManagedLifecycle {
	private Log log = LogFactory.getLog(AirportTask.class);
	private String city;
	private String iataCode;
	private String oaciCode;
	private OMElement arrivals;
	private SynapseEnvironment synapseEnvironment;

	public void execute() {
		log.debug("AirportTask starts");
		//TODO LOGIC
	}
	 
	public void init(SynapseEnvironment synapseEnvironment) {
		log.debug("AirportTask init");
		this.synapseEnvironment = synapseEnvironment;
	}
	 
	public void destroy() {
		log.debug("AirportTask destroy");
	}
	
	//city
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	//iataCode
	public String getIataCode() {
		return iataCode;
	}
	
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	
	//oaciCode
	public String getOaciCode() {
		return oaciCode;
	}
	
	public void setOaciCode(String oaciCode) {
		this.oaciCode = oaciCode;
	}
	
	//arrivals
	public OMElement getArrivals() {
		return arrivals;
	}
	
	public void setArrivals(OMElement arrivals) {
		this.arrivals = arrivals;
	}
	
	//synapseEnvironment
	public SynapseEnvironment getSynapseEnvironment() {
		return synapseEnvironment;
	}
	 
	public void setSynapseEnvironment(SynapseEnvironment synapseEnvironment) {
		this.synapseEnvironment = synapseEnvironment;
	}
}	