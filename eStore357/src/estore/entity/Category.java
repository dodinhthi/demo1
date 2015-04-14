package estore.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

@Entity
@Table(name="Categories")
public class Category  implements Serializable{
	@Id @GeneratedValue
	Integer id;
	String name, namevn;
	
	public String getNamevn() {
		return namevn;
	}

	public void setNamevn(String namevn) {
		this.namevn = namevn;
	}
    
	@OneToMany(mappedBy="category")
	
	Collection<Product> products;

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

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
}
