package domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance
@DiscriminatorColumn(name="TYPE")
@Table(name="korisnici")
public abstract class Korisnici {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private KorisnickaUloga korisnickaUloga;
	
	public Korisnici() {
		
	}

	public Korisnici(Long id, String username, String password, KorisnickaUloga korisnickaUloga) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.korisnickaUloga = korisnickaUloga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public KorisnickaUloga getKorisnickaUloga() {
		return korisnickaUloga;
	}

	public void setKorisnickaUloga(KorisnickaUloga korisnickaUloga) {
		this.korisnickaUloga = korisnickaUloga;
	}

	@Override
	public String toString() {
		return "Korisnici [id=" + id + ", username=" + username + ", password=" + password + ", korisnickaUloga="
				+ korisnickaUloga + "]";
	}
	
	
	

	
	

	
	

}
