package tech.honeysharma.techbme.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bloodbank")
public class BloodBank {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "state")
	private String state;

	@Column(name = "district")
	private String district;

	@Column(name = "city")
	private String city;

	@Column(name = "address")
	private String address;

	@Column(name = "pincode")
	private String pincode;

	@Column(name = "number")
	private String number;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "helpline")
	private String helpline;

	@Column(name = "email")
	private String email;

	@Column(name = "website")
	private String website;

	@Column(name = "nodal_officer")
	private String nodal_officer;

	@Column(name = "contact_nodal_officer")
	private String contact_nodal_officer;

	@Column(name = "mobile_nodal_officer")
	private String mobile_nodal_officer;

	@Column(name = "email_nodal_officer")
	private String email_nodal_officer;

	@Column(name = "category")
	private String category;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHelpline() {
		return helpline;
	}

	public void setHelpline(String helpline) {
		this.helpline = helpline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getNodal_officer() {
		return nodal_officer;
	}

	public void setNodal_officer(String nodal_officer) {
		this.nodal_officer = nodal_officer;
	}

	public String getContact_nodal_officer() {
		return contact_nodal_officer;
	}

	public void setContact_nodal_officer(String contact_nodal_officer) {
		this.contact_nodal_officer = contact_nodal_officer;
	}

	public String getMobile_nodal_officer() {
		return mobile_nodal_officer;
	}

	public void setMobile_nodal_officer(String mobile_nodal_officer) {
		this.mobile_nodal_officer = mobile_nodal_officer;
	}

	public String getEmail_nodal_officer() {
		return email_nodal_officer;
	}

	public void setEmail_nodal_officer(String email_nodal_officer) {
		this.email_nodal_officer = email_nodal_officer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
