import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Habito_Alimentar {
	
	String Tipo_Refeição;
	String hora;
	ArrayList<Dose_Prod> Doses_Prod = new ArrayList<Dose_Prod>();
	public String getTipo_Refeição() {
		return Tipo_Refeição;
	}
	public void setTipo_Refeição(String tipo_Refeição) {
		Tipo_Refeição = tipo_Refeição;
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
