package com.eshramik.springboot.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "WORKER")
public class Worker implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7259097281034010912L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@NotEmpty
	@Column(name = "USERID", nullable = false)
	private String userID;
	@NotEmpty
	@Column(name = "EMAILID", nullable = false)
	private String emailID;
	@Column(name = "password")
	@Transient
	private String password;
	@Column(name = "enabled")
	private boolean enabled;	
	@Column(name = "confirmation_token")
	private String confirmationToken;
	@NotEmpty
	@Column(name = "AADHARNO", nullable = false)
	private String aadharNo;
	@NotEmpty
	@Column(name = "PANNO", nullable = false)
	private String panNo;
	@NotEmpty
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	@NotEmpty
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	@NotEmpty
	@Column(name = "MIDDLENAME", nullable = false)
	private String middleName;
	@NotEmpty
	@Column(name = "DOB", nullable = false)
	private Date dob;
	@NotEmpty
	@Column(name = "GENDER", nullable = false)
	private String gender;
	@NotEmpty
	@Column(name = "PERMANENTADD", nullable = false)
	private String permanentAdd;
	@NotEmpty
	@Column(name = "PRESENTADD", nullable = false)
	private String presentAdd;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPermanentAdd() {
		return permanentAdd;
	}

	public void setPermanentAdd(String permanentAdd) {
		this.permanentAdd = permanentAdd;
	}

	public String getPresentAdd() {
		return presentAdd;
	}

	public void setPresentAdd(String presentAdd) {
		this.presentAdd = presentAdd;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((aadharNo == null) ? 0 : aadharNo.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((panNo == null) ? 0 : panNo.hashCode());
		result = prime * result + ((permanentAdd == null) ? 0 : permanentAdd.hashCode());
		result = prime * result + ((presentAdd == null) ? 0 : presentAdd.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (ID != other.ID)
			return false;
		if (aadharNo == null) {
			if (other.aadharNo != null)
				return false;
		} else if (!aadharNo.equals(other.aadharNo))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (panNo == null) {
			if (other.panNo != null)
				return false;
		} else if (!panNo.equals(other.panNo))
			return false;
		if (permanentAdd == null) {
			if (other.permanentAdd != null)
				return false;
		} else if (!permanentAdd.equals(other.permanentAdd))
			return false;
		if (presentAdd == null) {
			if (other.presentAdd != null)
				return false;
		} else if (!presentAdd.equals(other.presentAdd))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", userID=" + userID + ", emailID=" + emailID + ", aadharNo=" + aadharNo + ", panNo="
				+ panNo + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", gender=" + gender + ", permanentAdd=" + permanentAdd + ", presentAdd=" + presentAdd + "]";
	}

}
