public class Eintraege {
	private int nummer;
	private String vorName;
	private String nachName;
	private String eMail;
	private String telefon;
	private boolean favorit;

	public Eintraege() {
	}

	public Eintraege(String vorName, String nachName, String eMail, String telefon) {
		this.vorName = vorName;
		this.nachName = nachName;
		this.eMail = eMail;
		this.telefon = telefon;
	}


}
