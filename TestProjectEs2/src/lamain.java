import java.io.FileNotFoundException;
import java.io.IOException;

public class lamain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CSVReaderLerdadosPlanoAlimentar CSV=new CSVReaderLerdadosPlanoAlimentar();
	Plano P=CSV.lerdados("D://Fichascsv//PlanoAlimentar.csv");	
   
	  CSVWriterdadosPlano CSVW=new CSVWriterdadosPlano();
	  CSVW.escreverDados(P.Totais);
		//CSVReaderLerdadosNut Csv=new CSVReaderLerdadosNut();
		//Csv.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		  
		
	  CSVReaderdadosPacientes CSVPaciente= new CSVReaderdadosPacientes();
	  
	  Paciente Paciente;
	  Paciente=CSVPaciente.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
	  Float Gasto_Total_Energetico = null;
	  Gasto_Total_Energetico=Paciente.caculaHarrisBenedict();
	  System.out.println("Gasto_total_Ener:"+Gasto_Total_Energetico);	
	//Gasto_Total_Energetico=Paciente.caculaHarrisBenedict();
	  
	}

}
