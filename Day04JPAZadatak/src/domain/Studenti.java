package domain;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@DiscriminatorColumn(name="TYPE")
@Table(name="studenti")
public class Studenti extends Korisnici {

	private String ime;
	private String prezime;
	private String brojIndexa;
	private Date datumRodjenja;
	
	@OneToOne()
	@JoinColumn(name="studijski_programid")
	private StudijskiProgram studijskiProgram;
	public Studenti() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studenti(Long id, String username, String password, KorisnickaUloga korisnickaUloga) {
		super(id, username, password, korisnickaUloga);
		// TODO Auto-generated constructor stub
	}
	public Studenti(String ime, String prezime, String brojIndexa, Date datumRodjenja,
			StudijskiProgram studijskiProgram) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndexa = brojIndexa;
		this.datumRodjenja = datumRodjenja;
		this.studijskiProgram = studijskiProgram;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public StudijskiProgram getStudijskiProgram() {
		return studijskiProgram;
	}
	public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}
	@Override
	public String toString() {
		return "Studenti [ime=" + ime + ", prezime=" + prezime + ", brojIndexa=" + brojIndexa + ", datumRodjenja="
				+ datumRodjenja + ", studijskiProgram=" + studijskiProgram + "]";
	}
	
	
	
	

}
