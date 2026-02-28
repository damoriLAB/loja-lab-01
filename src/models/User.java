package models;

public class User{

	private String ID;
	private String name;
	private String lastName;

	

	public User(String iD, String name, String lastName) {
		ID = iD;
		this.name = name;
		this.lastName = lastName;
	}
	

	public User() {
	}


	public String getId(){
		return ID;
	}

	public String name(){
		return name;
	}

	public String getLastName(){
		return lastName;
	}

	@Override
    public String toString() {
        return name + " " + lastName;
    }


}
