package gamesite.core;



import java.rmi.RemoteException;
import gamesite.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements MernisService{

	@Override
	public boolean checkUserid(Gamer gamer) {
		
		KPSPublicSoap user = new KPSPublicSoapProxy();
		
		try {
			return user.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateofBirth().getYear());
		
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch (RemoteException e){
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}
	

	


	

}
