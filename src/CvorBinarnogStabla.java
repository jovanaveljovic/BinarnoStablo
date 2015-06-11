
public class CvorBinarnogStabla {



	private int kljuc;
	private String vrednost;
	private CvorBinarnogStabla levo;
	private CvorBinarnogStabla desno;
	
	
	public CvorBinarnogStabla(int kljuc, String vrednost, CvorBinarnogStabla levo,
			CvorBinarnogStabla desno) {
		
		this.kljuc = kljuc;
		this.vrednost = vrednost;
		this.levo = levo;
		this.desno = desno;
	}


	public int getKljuc() {
		return kljuc;
	}


	public void setKljuc(int kljuc) {
		this.kljuc = kljuc;
	}


	public String getVrednost() {
		return vrednost;
	}


	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}


	public CvorBinarnogStabla getLevo() {
		return levo;
	}


	public void setLevo(CvorBinarnogStabla levo) {
		this.levo = levo;
	}


	public CvorBinarnogStabla getDesno() {
		return desno;
	}


	public void setDesno(CvorBinarnogStabla desno) {
		this.desno = desno;
	}
}

