package heroku_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true )
@Entity
public class Villager {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String house;
	private Long declaredAmount;
	private Long paidAmount;
	
	public Villager() {
		name = "";
		house = "";
		declaredAmount = 0L;
		setPaidAmount(0L);
	}
	
	public Villager(String house, String name, Long declaredAmount, Long paidAmount) {
		super();
		this.house = house;
		this.name = name;
		this.declaredAmount = declaredAmount;
		this.setPaidAmount(paidAmount);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}

	public Long getDeclaredAmount() {
		return declaredAmount;
	}

	public void setDeclaredAmount(Long declaredAmount) {
		this.declaredAmount = declaredAmount;
	}

	public Long getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Long paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	}
