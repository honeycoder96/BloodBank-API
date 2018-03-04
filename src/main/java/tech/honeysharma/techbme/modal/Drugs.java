package tech.honeysharma.techbme.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drugs")
public class Drugs {

	@Id
	@Column(name = "id")
	String id;

	@Column(name = "group_id")
	String group_id;

	@Column(name = "group_name")
	String group_name;

	@Column(name = "name")
	String name;

	@Column(name = "packsize")
	String packsize;

	@Column(name = "price1")
	String price1;

	@Column(name = "price2")
	String price2;

	public Drugs() {
		super();
	}

	public Drugs(String id, String group_id, String group_name, String name, String packsize, String price1,
			String price2) {
		super();
		this.id = id;
		this.group_id = group_id;
		this.group_name = group_name;
		this.name = name;
		this.packsize = packsize;
		this.price1 = price1;
		this.price2 = price2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPacksize() {
		return packsize;
	}

	public void setPacksize(String packsize) {
		this.packsize = packsize;
	}

	public String getPrice1() {
		return price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Drugs [id=");
		builder.append(id);
		builder.append(", group_id=");
		builder.append(group_id);
		builder.append(", group_name=");
		builder.append(group_name);
		builder.append(", name=");
		builder.append(name);
		builder.append(", packsize=");
		builder.append(packsize);
		builder.append(", price1=");
		builder.append(price1);
		builder.append(", price2=");
		builder.append(price2);
		builder.append("]");
		return builder.toString();
	}
}
