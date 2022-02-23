package pack.core.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.setEid(101);
		e.setEname("Ravi");
		e.setEsalary(30000);
		System.out.println(e);
		// Inversion o Control(IOC)
		//1.Add jar files
		//2.Configure objects of a java into XML file
		//3.Use IOC container : BeanFactory or ApplicationContext to get objects constructed of them
	ApplicationContext context =new ClassPathXmlApplicationContext("employeebean.xml");
	Employee e1= (Employee)context.getBean("emp1");
	Employee e2=context.getBean("emp2",Employee.class);
	
	System.out.println("-----Spring IOC in Action--------");
	
	System.out.println(e1);
	System.out.println(e2);
	
	}
}

