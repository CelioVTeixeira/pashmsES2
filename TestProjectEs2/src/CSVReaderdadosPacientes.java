


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class CSVReaderdadosPacientes {
	
	Paciente lerdadospaciente(String csvFile2) throws FileNotFoundException, IOException {
		
		System.out.println("--------------------------------------------------------------------");	
      //  String csvFile2 = "D://Fichascsv/ficha.csv";
   	 String line2 = "";
        String cvsSplitBy2 = ";";
        Paciente P=new Paciente();
        P.DadosFisicos=new DadosFisicos();
        
		System.out.println("CSV:"+csvFile2);
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
   int iterator=0;
            while (((line2 = br.readLine()) != null)) {
            	
            	
            	String[] Linha = line2.split(cvsSplitBy2);
            //	System.out.println("lenght"+Linha.length);	
            	if(Linha[0].equals("Nome")) {
            		if( Linha[1].length()>20 ||Linha[1].length()<3  ||(Linha[1].isEmpty() && Linha[1]==null)) {
            			P.Nome_Pacient="error";
            		}
            		else {
            		P.Nome_Pacient=Linha[1];
            		}
            	}
            	if(Linha[0].equals("Idade")) {
            		if(Integer.parseInt(Linha[1])>130 || Integer.parseInt(Linha[1])<13 ||Linha[1].equals("")) {
            			P.idade=-1;
            		}
            		else {
            			P.idade=Integer.parseInt(Linha[1]);
            		}
            	
            		
            	}
            	if(Linha[0].equals("Altura")) {
            		if(Integer.parseInt(Linha[1])>250 ||Integer.parseInt(Linha[1])<50 ||Linha[1].equals("")) {
            			P.DadosFisicos.Altura=-1;
            		}
            		else {
            		P.DadosFisicos.Altura=Integer.parseInt(Linha[1]);
            		}
            	}
            	if(Linha[0].equals("Peso")) {
            		if(Float.parseFloat(Linha[1])<18 ||Float.parseFloat(Linha[1])>600 ||Linha[1].equals("")) {
            			P.DadosFisicos.peso=-1;
            		}
            		else
            		P.DadosFisicos.peso=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("IMC")) {
            		if(Float.parseFloat(Linha[1])<10 ||Float.parseFloat(Linha[1])>60 ||Linha[1].equals("")) {
            		P.DadosFisicos.IMC=-1;
            		}
            		else {
            			P.DadosFisicos.IMC=Float.parseFloat(Linha[1]);
            		}
            		
            	}
            	if(Linha[0].equals("BF")) {
            		if(Float.parseFloat(Linha[1])<0 ||Float.parseFloat(Linha[1])>85 ||Linha[1].equals("")) {
            			P.DadosFisicos.B_F=-1;
            		}
            			else
            			P.DadosFisicos.B_F=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("Musculo")) {
            		if(Float.parseFloat(Linha[1])<5 ||Float.parseFloat(Linha[1])>120 ||Linha[1].equals("")) 
            		P.DadosFisicos.Musculo=Float.parseFloat(Linha[1]);
            		else
            			P.DadosFisicos.Musculo=-1;
            	}
            	if(Linha[0].equals("h2o")) {
            		if(Float.parseFloat(Linha[1])<70 ||Float.parseFloat(Linha[1])>80 ||Linha[1].equals("")) {
            		P.DadosFisicos.h20=-1;
            		}
            		else
            			P.DadosFisicos.h20=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("osso")) {
            		if(Float.parseFloat(Linha[1])<-4 ||Float.parseFloat(Linha[1])>2 ||Linha[1].equals("")) {
            			P.DadosFisicos.osso=-5;
            		}	
            		else
            		P.DadosFisicos.osso=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("Idade_meta")) {
            		if(Float.parseFloat(Linha[1])<13||Float.parseFloat(Linha[1])>100 ||Linha[1].equals("")) {
            			P.DadosFisicos.Idade_Metabolica=-1;
            		}
            		else
            		P.DadosFisicos.Idade_Metabolica=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("Metablismo_basal")) {
              		if(Float.parseFloat(Linha[1])<1.2 ||Float.parseFloat(Linha[1])>(2.1)||Linha[1].equals("")) {
              			P.DadosFisicos.Metabolismo_basal=-1;
              		}
              		else
         		P.DadosFisicos.Metabolismo_basal=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("Gordura_visceral")) {
            		if(Float.parseFloat(Linha[1])<1||Float.parseFloat(Linha[1])>(70)||Linha[1].equals("")) {
            			P.DadosFisicos.Gordura_Visceral=-1;
            		}
            		else
            		P.DadosFisicos.Gordura_Visceral=Float.parseFloat(Linha[1]);
            	}
            	if(Linha[0].equals("Profissao")) {
            		if((Linha[1].isEmpty() && Linha[1]==null) ||Linha[1].length()>30||Linha[1].length()<7) {
            			P.Profisao="Error";
            			System.out.println("CSV:"+csvFile2);	
                			
            			System.out.println("DadosCLiente_Prof:"+P.getprof());	
            		
            		}
            		else {
        			System.out.println("CSV:"+csvFile2);	
        			P.Profisao=Linha[1];
        			System.out.println("DadosCLiente_Prof:"+P.getprof());	
            		}
            		//P.Profisao=Linha[1];
            	}
            	if(Linha[0].equals("Sexo")) {
            		if((Linha[1].isEmpty() && Linha[1]==null)||!Linha[1].equals("Masculino")||!Linha[1].equals("Feminino")) {
            			P.sexo="error";
            		}
            		else {
            		P.sexo=Linha[1];
            		}
            	}
            	if(Linha.length>1) {
            		// System.out.println("----------Valor:" + Linha[1]);
            	}
            		
        	// System.out.println("----------Nome:" + P.Nome_Pacient);
        	 //System.out.println("----------peso:" + P.DadosFisicos.peso);
            }
            return P;
            }
		
	}

//	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		ArrayList<Produto> Produtos=new ArrayList<Produto>();
		  String csvFile = "D:CALCULOSOK.csv";
	        String line = "";
	        String cvsSplitBy = ";";
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
int iterator=0;
	            while (((line = br.readLine()) != null)) {

	                // use comma as separator
	              
	            	String[] Prod = line.split(cvsSplitBy);
	Produto P=new Produto();
	Produtos.add(P);
	P.id_prod=Prod[0];
	P.Nome=Prod[1];
	P.Lista_Calculo=Prod;
	P.converterparafloat();
	iterator++;

	               System.out.println("IDProd [code= " + Prod[0] + " , nomeProd=" + Prod[1] + "]");

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	     */
	/*
	        System.out.println("--------------------------------------------------------------------");	
	        String csvFile2 = "D:ficha.csv";
	   	 String line2 = "";
	        String cvsSplitBy2 = ";";
	        Paciente P=new Paciente();
	        P.DadosFisicos=new DadosFisicos();
	        
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
	   int iterator=0;
	            while (((line2 = br.readLine()) != null)) {
	            	
	            	
	            	String[] Linha = line2.split(cvsSplitBy2);
	            //	System.out.println("lenght"+Linha.length);	
	            	if(Linha[0].equals("Nome")) {
	            		if( Linha[1].length()>20 ||Linha[1].equals("")) {
	            			P.Nome_Pacient="error";
	            		}
	            		else {
	            		P.Nome_Pacient=Linha[1];
	            		}
	            	}
	            	if(Linha[0].equals("Idade")) {
	            		if(Integer.parseInt(Linha[1])>130 ||Integer.parseInt(Linha[1])<13 ||Linha[1].equals("")) {
	            			P.idade=-1;
	            		}
	            		else {
	            			P.idade=Integer.parseInt(Linha[1]);
	            		}
	            	
	            		
	            	}
	            	if(Linha[0].equals("Altura")) {
	            		if(Integer.parseInt(Linha[1])>250 ||Integer.parseInt(Linha[1])<50 ||Linha[1].equals("")) {
	            			P.DadosFisicos.Altura=-1;
	            		}
	            		else {
	            		P.DadosFisicos.Altura=Integer.parseInt(Linha[1]);
	            		}
	            	}
	            	if(Linha[0].equals("Peso")) {
	            		if(Float.parseFloat(Linha[1])<18 ||Float.parseFloat(Linha[1])>600 ||Linha[1].equals("")) {
	            			P.DadosFisicos.peso=-1;
	            		}
	            		else
	            		P.DadosFisicos.peso=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("IMC")) {
	            		if(Float.parseFloat(Linha[1])<10 ||Float.parseFloat(Linha[1])>60 ||Linha[1].equals("")) {
	            		P.DadosFisicos.IMC=-1;
	            		}
	            		else {
	            			P.DadosFisicos.IMC=Float.parseFloat(Linha[1]);
	            		}
	            		
	            	}
	            	if(Linha[0].equals("BF")) {
	            		if(Float.parseFloat(Linha[1])<0 ||Float.parseFloat(Linha[1])>60 ||Linha[1].equals("")) {
	            			P.DadosFisicos.B_F=-1;
	            		}
	            			else
	            			P.DadosFisicos.B_F=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("Musculo")) {
	            		P.DadosFisicos.Musculo=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("h2o")) {
	            		if(Float.parseFloat(Linha[1])<70 ||Float.parseFloat(Linha[1])>80 ||Linha[1].equals("")) {
	            		P.DadosFisicos.h20=-1;
	            		}
	            		else
	            			P.DadosFisicos.h20=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("osso")) {
	            		if(Float.parseFloat(Linha[1])<-4 ||Float.parseFloat(Linha[1])>2 ||Linha[1].equals("")) {
	            			P.DadosFisicos.osso=-5;
	            		}	
	            			else
	            		P.DadosFisicos.osso=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("Idade_meta")) {
	            		if(Float.parseFloat(Linha[1])<13||Float.parseFloat(Linha[1])>100 ||Linha[1].equals("")) {
	            			P.DadosFisicos.Idade_Metabolica=-1;
	            		}
	            		else
	            		P.DadosFisicos.Idade_Metabolica=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("Metablismo_basal")) {
	              		if(Float.parseFloat(Linha[1])<110||Float.parseFloat(Linha[1])>(10000)||Linha[1].equals("")) {
	              			P.DadosFisicos.Metabolismo_basal=-1;
	              		}
	              		
	         		P.DadosFisicos.Metabolismo_basal=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("Gordura_visceral")) {
	            		if(Float.parseFloat(Linha[1])<110||Float.parseFloat(Linha[1])>(10000)||Linha[1].equals("")) {
	            			P.DadosFisicos.Gordura_Visceral=-1;
	            		}
	            		P.DadosFisicos.Gordura_Visceral=Float.parseFloat(Linha[1]);
	            	}
	            	if(Linha[0].equals("Profissao")) {
	            		if(Linha[1].equals("")||Linha[1].length()>30||Linha[1].length()<7) {
	            			P.Profisao="Error";
	            		}
	            		P.Profisao=Linha[1];
	            	}
	            	if(Linha[0].equals("Sexo")) {
	            		if(Linha[1].equals("")||!Linha[1].equals("Masculino")||!Linha[1].equals("Feminino")) {
	            			P.sexo="error";
	            		}
	            		P.sexo=Linha[1];
	            	}
	            	if(Linha.length>1) {
	            		 System.out.println("----------Valor:" + Linha[1]);
	            	}
	            		
            	 System.out.println("----------Nome:" + P.Nome_Pacient);
            	 System.out.println("----------peso:" + P.DadosFisicos.peso);
	            }
	            }
	       // Teste=P;

	}
	
	
	
*/
	
	}

//       void funccsvreader( ArrayList<Produto> Produtos ) {
    	

      
