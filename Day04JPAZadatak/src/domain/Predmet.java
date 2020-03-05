package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="predmet")
public class Predmet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String naziv;
	private int espb;
	
	private String semestar;
	
	@OneToOne()
    @JoinColumn(name = "studijskiprogramid")
	private StudijskiProgram studijskiProgram;

	public Predmet() {
		super();
	}
	
	

	public Predmet(Long id, String naziv, int espb, String semestar, StudijskiProgram studijskiProgram) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.espb = espb;
		this.semestar = semestar;
		this.studijskiProgram = studijskiProgram;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getEspb() {
		return espb;
	}

	public void setEspb(int espb) {
		this.espb = espb;
	}

	public String getSemestar() {
		return semestar;
	}

	public void setSemestar(String semestar) {
		this.semestar = semestar;
	}

	public StudijskiProgram getStudijskiProgram() {
		return studijskiProgram;
	}

	public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}



	@Override
	public String toString() {
		return "Predmet [id=" + id + ", naziv=" + naziv + ", espb=" + espb + ", semestar=" + semestar
				+ ", studijskiProgram=" + studijskiProgram + "]";
	}
	
	
	

}
