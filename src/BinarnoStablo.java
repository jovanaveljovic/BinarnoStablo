
public class BinarnoStablo {

	
CvorBinarnogStabla koren;
	
	public void ubaci(CvorBinarnogStabla e){
		if(koren==null){
			koren=new CvorBinarnogStabla(e.getKljuc(), e.getVrednost(), null, null);
		}
		else {	
			if(koren.getKljuc()>e.getKljuc()){
				if(koren.getLevo()==null)
					koren.setLevo(e);
				else{
					koren=koren.getLevo();
					ubaci(e);
				}
			}else {
				if(koren.getDesno()==null)
					koren.setDesno(e);
				else{
					koren=koren.getDesno();
					ubaci(e);
					}
				}
			}
		}
	
	
	
	public void izbaciListPolulist(CvorBinarnogStabla k, CvorBinarnogStabla e){
		CvorBinarnogStabla rod = roditelj(k, e);
		CvorBinarnogStabla dete = null;
		
		if(e.getLevo()!=null)
			dete = e.getLevo();
		else
			dete = e.getDesno();
		
		if(rod==null)
			koren=dete;
		else{
			if(rod.getDesno()==e)
				rod.setDesno(e);
			else
				rod.setLevo(e);
		}
		
	}
	
	public void izbaci(CvorBinarnogStabla k, int kljuc){
		CvorBinarnogStabla c = pronadji2(k, kljuc);
		if(c==null)
			return;
		if(k.getLevo()!=null && k.getDesno()!=null){
			CvorBinarnogStabla max = maxCvor(k.getLevo()); 
			k.setKljuc(max.getKljuc());
			izbaciListPolulist(k, max);
			
		}
		else{
			izbaciListPolulist(k, c);
		}
		
		
		
	}
	
	
	public CvorBinarnogStabla roditelj(CvorBinarnogStabla k, CvorBinarnogStabla e){
		if(k==null || e==k)
			return null;
		if(k.getLevo()==e || k.getDesno()==e)
			return k;
		if(e.getKljuc()<k.getKljuc())
			return roditelj(k.getLevo(), e);
		else
			return roditelj(k.getDesno(), e);
		
	}
	
	public String pronadji(CvorBinarnogStabla p, int k){
		if(p==null)
			return null;
		if(p.getKljuc()==k)
			return p.getVrednost();
		if(k<p.getKljuc())
			return pronadji(p.getLevo(), k);
		else
			return pronadji(p.getDesno(), k);
		
	}
	
	public CvorBinarnogStabla pronadji2(CvorBinarnogStabla k, int kljuc ){
		if(k==null || k.getKljuc()==kljuc)
			return k;
		if(kljuc<k.getKljuc())
			return pronadji2(k.getLevo(), kljuc);
		else 
			return pronadji2(k.getDesno(), kljuc);
	}
	
	
	public CvorBinarnogStabla maxCvor(CvorBinarnogStabla k){
		if(k.getDesno()==null)
			return null;
		return maxCvor(k.getDesno());
	}
	

}
