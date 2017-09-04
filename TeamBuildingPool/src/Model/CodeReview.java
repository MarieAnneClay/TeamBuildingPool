package Model;
import java.util.Date;

public class CodeReview {
	
	private String name;
	private String description;
	private Date datetime;
	private CRClass crclass;
	
	public CodeReview() {
	}
	
	public CodeReview(String n, String des, Date dat, CRClass c ) {
		name=n;
		description=des;
		datetime=dat;
		crclass=c;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public CRClass getCrclass() {
		return crclass;
	}
	public void setCrclass(CRClass crclass) {
		this.crclass = crclass;
	}
}