package employee;

import java.util.ArrayList;

import java.util.List;

public class GestionnaireEmployee extends Employee {
	 private static List<Employee> employee; 
	 public GestionnaireEmployee(String nom,String prenom,int date,String role) {
		 super(nom,prenom,date,role);
		 this.employee = new ArrayList<>();
	 }
	 public void ajouter(String nom,String prenom,int date,String role) {
		 Employee employee_ajouter= new Employee(nom,prenom,date,role);
		
		 employee.add(employee_ajouter);
	 }
	 public void remove(List<Employee> employee,int index) {
		 employee.remove(index);
	 }
	 public static void afficher() {
		 
		 for(Employee emp:employee) {
		 System.out.println("les listes des personnes sont:"+emp);
	        }}	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee ep1= new Employee("maliki","maroua",2024,"chef de projet");
       Employee ep2= new Employee("maliki","zineb",2024,"developpeur");
       double sal=ep1.salaire("chef de projets", 10, 400);
       GestionnaireEmployee ep3= new GestionnaireEmployee("amamou","ahmed",2020,"ingenieure");
       ep3.ajouter("mohamed", "ahmed", 2019, "developpeur");
       GestionnaireEmployee.afficher();
       
       
	}

}
