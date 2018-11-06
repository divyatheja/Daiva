package heroku_demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true )
@Entity
public class PaymentDetail {
	
	private int id;
	
	@OneToOne
    @JoinColumn(name = "id")
	private Villager villager;

	private String emi1Amount;
	private String emi1Date;
	private String emi1CollectedBy;
	
	private String emi2Amount;
	private String emi2Date;
	private String emi2CollectedBy;
	
	private String emi3Amount;
	private String emi3Date;
	private String emi3CollectedBy;
	
	private String emi4Amount;
	private String emi4Date;
	private String emi4CollectedBy;
	
	private String emi5Amount;
	private String emi5Date;
	private String emi5CollectedBy;
	

	public Villager getVillager() {
		return villager;
	}
	public void setVillager(Villager villager) {
		this.villager = villager;
	}
	public String getEmi1Amount() {
		return emi1Amount;
	}
	public void setEmi1Amount(String emi1Amount) {
		this.emi1Amount = emi1Amount;
	}
	public String getEmi1Date() {
		return emi1Date;
	}
	public void setEmi1Date(String emi1Date) {
		this.emi1Date = emi1Date;
	}
	public String getEmi1CollectedBy() {
		return emi1CollectedBy;
	}
	public void setEmi1CollectedBy(String emi1CollectedBy) {
		this.emi1CollectedBy = emi1CollectedBy;
	}
	public String getEmi2Amount() {
		return emi2Amount;
	}
	public void setEmi2Amount(String emi2Amount) {
		this.emi2Amount = emi2Amount;
	}
	public String getEmi2Date() {
		return emi2Date;
	}
	public void setEmi2Date(String emi2Date) {
		this.emi2Date = emi2Date;
	}
	public String getEmi2CollectedBy() {
		return emi2CollectedBy;
	}
	public void setEmi2CollectedBy(String emi2CollectedBy) {
		this.emi2CollectedBy = emi2CollectedBy;
	}
	public String getEmi3Amount() {
		return emi3Amount;
	}
	public void setEmi3Amount(String emi3Amount) {
		this.emi3Amount = emi3Amount;
	}
	public String getEmi3Date() {
		return emi3Date;
	}
	public void setEmi3Date(String emi3Date) {
		this.emi3Date = emi3Date;
	}
	public String getEmi3CollectedBy() {
		return emi3CollectedBy;
	}
	public void setEmi3CollectedBy(String emi3CollectedBy) {
		this.emi3CollectedBy = emi3CollectedBy;
	}
	public String getEmi4Amount() {
		return emi4Amount;
	}
	public void setEmi4Amount(String emi4Amount) {
		this.emi4Amount = emi4Amount;
	}
	public String getEmi4Date() {
		return emi4Date;
	}
	public void setEmi4Date(String emi4Date) {
		this.emi4Date = emi4Date;
	}
	public String getEmi4CollectedBy() {
		return emi4CollectedBy;
	}
	public void setEmi4CollectedBy(String emi4CollectedBy) {
		this.emi4CollectedBy = emi4CollectedBy;
	}
	public String getEmi5Amount() {
		return emi5Amount;
	}
	public void setEmi5Amount(String emi5Amount) {
		this.emi5Amount = emi5Amount;
	}
	public String getEmi5Date() {
		return emi5Date;
	}
	public void setEmi5Date(String emi5Date) {
		this.emi5Date = emi5Date;
	}
	public String getEmi5CollectedBy() {
		return emi5CollectedBy;
	}
	public void setEmi5CollectedBy(String emi5CollectedBy) {
		this.emi5CollectedBy = emi5CollectedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
