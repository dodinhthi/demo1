package estore.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Permissions")
public class Permission  implements Serializable{
	@Id @GeneratedValue
	int id;
	String page;
	String disables;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getDisables() {
		return disables;
	}
	public void setDisables(String disables) {
		this.disables = disables;
	}
	
}
