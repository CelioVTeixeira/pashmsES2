import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Habito_Alimentar {
	
	String Tipo_Refei��o;
	String hora;
	ArrayList<Dose_Prod> Doses_Prod = new ArrayList<Dose_Prod>();
	public String getTipo_Refei��o() {
		return Tipo_Refei��o;
	}
	public void setTipo_Refei��o(String tipo_Refei��o) {
		Tipo_Refei��o = tipo_Refei��o;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public ArrayList<Dose_Prod> getDoses_Prod() {
		return Doses_Prod;
	}
	public void setDoses_Prod(ArrayList<Dose_Prod> doses_Prod) {
		Doses_Prod = doses_Prod;
	}	
	
	
 
    
}
