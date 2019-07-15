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
	  Paciente.P_Atual=P;
	  System.out.println("Nome_Paciente:"+Paciente.getNome());
	  System.out.println("Sexo:"+Paciente.getsexo());
	  System.out.println("Idade:"+ Paciente.getidade());
	  System.out.println("Peso:"+ Paciente.DadosFisicos.getPeso());
	  int i=1;
	  
	  while(Paciente.P_Atual.Habitos.size()!=i) {
		  int j=0;
		  System.out.println("---------------------------------------------------------------------");
		  System.out.println("REFEICAO:::"+Paciente.P_Atual.Habitos.get(i).Tipo_Refeição);
		  System.out.println("---------------------------------------------------------------------");
		  while(Paciente.P_Atual.Habitos.get(i).Doses_Prod.size()!=j){
		  System.out.println("Nutrientes"+Paciente.P_Atual.Habitos.get(i).Doses_Prod.get(j).N_Produto);
		  System.out.println("Nutrientes"+Paciente.P_Atual.Habitos.get(i).Doses_Prod.get(j).Dosagem);
		  j++;
		  }
		  i++;
	  }
	  
	  //System.out.println(Paciente.P_Atual.Habitos.get(0)toString());
	  System.out.println("Gasto_total_Energetico :"+Gasto_Total_Energetico+"Para manter o peso de:"+Paciente.DadosFisicos.peso);	
	  System.out.println("Gasto_Energias_Plano_Atual:"+Paciente.P_Atual.Totais.get(1)+"Kj");
	  System.out.println("O paciente esta a consumir:"+Paciente.determina_Relacao_GTE_TotalHabitoAlimentar()+"%    "+ "em relação ao que devia consumir para manter o peso de:"+Paciente.DadosFisicos.peso);
	//Gasto_Total_Energetico=Paciente.caculaHarrisBenedict();
	  
	}

}
