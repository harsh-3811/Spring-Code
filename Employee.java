//Pojo or model or Bean
package pack.core.spring;

public class Employee {
int eid;
String ename;
int esalary;
Employee()
{
	}
public Employee(int eid, String ename, int esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}

}

