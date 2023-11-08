package net.javaguides.springboot.model;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Data
@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "first_name", nullable = false)
private String firstName;
@Column(name = "last_name")
private String lastName;
@Column(name = "email")
private String email;
public Object getEmail() {
    return null;
}
public void setEmail(Object email2) {
  // TODO document why this method is empty
}
public Object getLastName() {
    return null;
}
public void setLastName(Object lastName2) {
  // TODO document why this method is empty
}
public Object getFirstName() {
    return null;
}
public void setFirstName(Object firstName2) {
  // TODO document why this method is empty
}
}