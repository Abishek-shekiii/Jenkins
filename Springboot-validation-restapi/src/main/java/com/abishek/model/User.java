package com.abishek.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 3, max =5)
	private String userId;
	
	@Size(min = 3, max = 50)
    private String name;
     
    @NotBlank
    @Email(message = "Please enter a valid e-mail address")
    private String email;
     
    @NotBlank
    @Pattern(regexp = "^[A-Za-z][A-Za-z0-9!@#$%^&*]*$", message = "Password has low Strength")
    private String password;
     
    @NotBlank
    private String gender;
     
    @Size(max = 100)
    private String note;
     
    @AssertTrue
    private boolean married;
     
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
     
    @NotBlank
    private String profession;
 
    @Min(value = 20_000)
    @Max(value = 200_000)
    private long income;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public User() {}
	
	public User(@NotBlank @Size(min = 3, max = 5) String userId, @Size(min = 3, max = 50) String name,
			@NotBlank @Email(message = "Please enter a valid e-mail address") String email,
			@NotBlank @Pattern(regexp = "^[A-Za-z][A-Za-z0-9!@#$%^&*]*$", message = "Password has low Strength") String password,
			@NotBlank String gender, @Size(max = 100) String note, @AssertTrue boolean married, Date birthday,
			@NotBlank String profession, @Min(20000) @Max(200000) long income) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.note = note;
		this.married = married;
		this.birthday = birthday;
		this.profession = profession;
		this.income = income;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", gender=" + gender + ", note=" + note + ", married=" + married + ", birthday=" + birthday
				+ ", profession=" + profession + ", income=" + income + "]";
	}
 
}
