
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReaderLerdadosNut {

	ArrayList<Produto> lerdados(String csvFile) throws Exception {
		ArrayList<Produto> Produtos=new ArrayList<Produto>();
		//  String csvFile = "D:/Users/Andre Dias/Desktop/ES2/CALCULOS.csv";
	        String line = "";
	        String cvsSplitBy = ";";
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
int iterator=0;
	            while (((line = br.readLine()) != null)) {

	                // use comma as separator
	              
	            	String[] Prod = line.split(cvsSplitBy);
	Produto P=new Produto();
	P.id_prod=Prod[0];
	P.Nome=Prod[1];
	P.Lista_Calculo=Prod;
	   System.out.println("Lista_Calculo:"+P.Lista_Calculo.length);
	P.converterparafloat();
	Produtos.add(P);
			
	
	iterator++;
	/*
	Dose_Prod D_P = new Dose_Prod();
	D_P.Dosagem=(float)70.00;
	D_P.N_Produto=P.Npome;
	D_P.Lista_Calculo.add(Prod);

	*/
	               System.out.println("IDProd [code= " + Prod[0] + " , nomeProd=" + Prod[1] + "]");

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	     /*   System.out.println("----------------------------Lista--------------------------");
	        for (int i = 0; i < Produtos.size(); i++) {
				System.out.print("IDPROD:"+Produtos.get(i).id_prod);
				System.out.println("---IDNome:"+Produtos.get(i).Nome);
				System.out.println("---Lista:"+Produtos.get(i).id_prod);
			}
	       */
			return Produtos; 
	     
	   	
	}
	
	
	

	
	
	}

//       void funccsvreader( ArrayList<Produto> Produtos ) {
    	