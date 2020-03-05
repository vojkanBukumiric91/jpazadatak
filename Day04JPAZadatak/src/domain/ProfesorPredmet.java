package domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ProfesorPredmet", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"PROFESOR_ID","PREDMET_ID"})
		})
public class ProfesorPredmet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@ManyToOne
	@JoinColumn(name = "PROFESOR_ID",referencedColumnName = "ID")
	private Profesori profesori;
	

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "PREDMET_ID",referencedColumnName = "ID")
	private Predmet predmet;


	public ProfesorPredmet() {
		
	}


	public ProfesorPredmet(Long id, Profesori profesori, Predmet predmet) {
		super();
		this.id = id;
		this.profesori = profesori;
		this.predmet = predmet;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Profesori getProfesori() {
		return profesori;
	}


	public void setProfesori(Profesori profesori) {
		this.profesori = profesori;
	}


	public Predmet getPredmet() {
		return predmet;
	}


	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}


	@Override
	public String toString() {
		return "ProfesorPredmet [id=" + id + ", profesori=" + profesori + ", predmet=" + predmet + "]";
	}
	
	
	

}
