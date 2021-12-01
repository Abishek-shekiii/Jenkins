/*
 * package com.abishek;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.Table; import javax.validation.constraints.AssertTrue;
 * import javax.validation.constraints.Email; import
 * javax.validation.constraints.Max; import javax.validation.constraints.Min;
 * import javax.validation.constraints.NotBlank; import
 * javax.validation.constraints.Size;
 * 
 * @Entity
 * 
 * @Table(name="users") public class User {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
 * 
 * @Size(min = 3, max = 50) private String name;
 * 
 * @NotBlank
 * 
 * @Email(message = "Please enter a valid e-mail address") private String email;
 * 
 * @NotBlank
 * 
 * @Size(min = 8, max = 15) private String password;
 * 
 * @NotBlank private String gender;
 * 
 * @Size(max = 100) private String note;
 * 
 * @AssertTrue private boolean married;
 * 
 * // @DateTimeFormat(pattern = "yyyy-mm-dd") // private Date birthday;
 * 
 * @NotBlank private String profession;
 * 
 * @Min(value = 20_000)
 * 
 * @Max(value = 200_000) private long income;
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * public String getGender() { return gender; }
 * 
 * public void setGender(String gender) { this.gender = gender; }
 * 
 * public String getNote() { return note; }
 * 
 * public void setNote(String note) { this.note = note; }
 * 
 * public boolean isMarried() { return married; }
 * 
 * public void setMarried(boolean married) { this.married = married; }
 * 
 * // public Date getBirthday() { // return birthday; // } // // public void
 * setBirthday(Date birthday) { // this.birthday = birthday; // }
 * 
 * public String getProfession() { return profession; }
 * 
 * public void setProfession(String profession) { this.profession = profession;
 * }
 * 
 * public long getIncome() { return income; }
 * 
 * public void setIncome(long income) { this.income = income; } public long
 * getId() { return id; }
 * 
 * public void setId(long id) { this.id = id; }
 * 
 * public User() {}
 * 
 * public User(@Size(min = 3, max = 50) String name,
 * 
 * @NotBlank @Email(message = "Please enter a valid e-mail address") String
 * email,
 * 
 * @NotBlank @Size(min = 8, max = 15) String password, @NotBlank String
 * gender, @Size(max = 100) String note,
 * 
 * @AssertTrue boolean married, @NotBlank String
 * profession, @Min(20000) @Max(200000) long income) { super(); this.name =
 * name; this.email = email; this.password = password; this.gender = gender;
 * this.note = note; this.married = married; this.profession = profession;
 * this.income = income; }
 * 
 * @Override public String toString() { return "User [name=" + name + ", email="
 * + email + ", password=" + password + ", gender=" + gender + ", note=" + note
 * + ", married=" + married + ", profession=" + profession + ", income=" +
 * income + "]"; }
 * 
 * }
 */