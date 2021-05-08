package Customer;



public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	public int dateOfBirth;
	public String nationallyId;

	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationallyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationallyId = nationallyId;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	

	public String getNationallyId() {
		return nationallyId;
	}

	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
