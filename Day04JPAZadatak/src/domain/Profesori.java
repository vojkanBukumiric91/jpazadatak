package domain;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesori")
public class Profesori extends Korisnici {
	
	private String ime;
	private String prezime;
	private Zvanje zvanje;
	private Date datumRadnogOdnosa;
	
	 	@OneToOne()
	    @JoinColumn(name = "departmentid")
	    private Department department;
	
	public Profesori() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profesori(Long id, String username, String password, KorisnickaUloga korisnickaUloga) {
		super(id, username, password, korisnickaUloga);
		// TODO Auto-generated constructor stub
	}
	public Profesori(String ime, String prezime, Zvanje zvanje, Date datumRadnogOdnosa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zvanje = zvanje;
		this.datumRadnogOdnosa = datumRadnogOdnosa;
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
	public Zvanje getZvanje() {
		return zvanje;
	}
	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}
	public Date getDatumRadnogOdnosa() {
		return datumRadnogOdnosa;
	}
	public void setDatumRadnogOdnosa(Date datumRadnogOdnosa) {
		this.datumRadnogOdnosa = datumRadnogOdnosa;
	}
	@Override
	public String toString() {
		return "Profesori [ime=" + ime + ", prezime=" + prezime + ", zvanje=" + zvanje + ", datumRadnogOdnosa="
				+ datumRadnogOdnosa + "]";
	}
	
	
	
	

}
