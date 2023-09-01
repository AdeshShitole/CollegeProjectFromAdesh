package College.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
private int id;
private String name;
private double salary;
private String department;
private String qualification;

@Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
@Override
public String toString() {
	return "Staff [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
			+ ", qualification=" + qualification + "]";
}

}
