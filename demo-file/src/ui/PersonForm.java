package ui;

import java.util.Date;
import java.util.Scanner;
import dol.Student;
import misc.DateUtil;

public class PersonForm {
	Scanner scan;
	Student person;
	
	public PersonForm(Scanner scanner) {
		scan = scanner;
	}
	
	public PersonForm(Student p) {
		person = p;
	}
	
	
	public Student catchPerson() {
		Date fecha_ingreso = DateUtil.catchValidDate(scan, "Fecha de ingreso (dd/MM/yyyy): ");
                System.out.println("Por favor ingresar el numero de carnet");
                String no_carnet=scan.next();
		Student p = new Student(no_carnet,fecha_ingreso);
		System.out.println("Primer nombre: ");
		p.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		p.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		p.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		p.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		p.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		p.setBirthDate(date);
		
		return p;
	}
	
	public void showPerson() {
		System.out.printf("Primer nombre: %s\n" , person.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", person.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", person.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", person.getSecondSurname());
		
		System.out.printf("Género: %s\n", person.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(person.getBirthDate(), "dd/MM/yyyy"));
        
		System.out.printf("Numero de carnet: %s\n", person.getNo_carnet());
		
		System.out.printf("Fecha de ingreso: %s\n",DateUtil.dateToString(person.getFecha_ingreso(), "dd/MM/yyyy"));
		
		
			
	}
	
}
