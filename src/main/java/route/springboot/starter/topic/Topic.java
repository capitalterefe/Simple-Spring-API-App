package route.springboot.starter.topic;

public class Topic {
	
	private Integer id;
	private String name;
	private String discription;
	private Integer ic;
	
	
	public Integer getIc() {
		return ic;
	}
	public void setIc(Integer ic) {
		this.ic = ic;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Topic(Integer id, String name, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
	}
	public Topic() {
	}
	

	
}
