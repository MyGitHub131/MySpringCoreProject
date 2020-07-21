package com.alliswell.beans;

public class Doctor {
	private int id;
	private String name;
	private String profession;
	private String contact_No;
	private String address;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	/*Doctor(int id, String name, String profession, String contact_No,
			String address) {
		this.id = id;
		this.name = name;
		this.profession = profession;
		this.contact_No = contact_No;
		this.address = address;
	}*/
	public void displayDoctorInfo(){
		//return "Doctor[Id : " + id + ",Name : " + name + ", Profession : " + profession + ",contact_No : " + contact_No + ",Address : " + address + "]";
		System.out.println("***@@@Doctor Information@@@***");
		System.out.println("------------------------------");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name );
		System.out.println("Profession : " + profession);
		System.out.println("contact_NO : " + contact_No);
		System.out.println("Address : " + address);
	}

	/*@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", profession="
				+ profession + ", contact_No=" + contact_No + ", address="
				+ address + "]";
	}*/
	

}
