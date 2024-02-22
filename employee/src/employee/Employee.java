package employee;

public class Employee {
    private String nom;
    private  String prenom;
    private double salaire;
    private int date;
    private String role;
    private int heure;
    private int bonus;

    
    
    public Employee(String nom,String prenom,int date,String role) {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.date=date;
    	this.role=role;
    	
    }
    
    
   
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	public int getDate() {
		return date;
	}



	public void setDate(int date) {
		this.date = date;
	}


    public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public double salaire(String role,int heure,int bonus) {
    	if(role=="chef de projets") {
    		salaire=(heure*200)+bonus;
    	}
    	else if (role=="ingenieure") {
    		salaire=(heure*150)+bonus;
    	}
    	else {
    		salaire=(heure*100)+bonus;
    	}
    	
    	return salaire;
    }
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
