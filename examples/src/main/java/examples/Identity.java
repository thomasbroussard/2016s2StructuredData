/**
 * 
 */
package examples;

/**
 * @author tbrou
 *
 */
public class Identity {
	private String displayName;
	private String email;
	private String phoneNumber;
	
	/**
	 * 
	 */
	public Identity() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param displayName
	 * @param email
	 * @param phoneNumber
	 */
	public Identity(String displayName, String email, String phoneNumber) {
		super();
		this.displayName = displayName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
