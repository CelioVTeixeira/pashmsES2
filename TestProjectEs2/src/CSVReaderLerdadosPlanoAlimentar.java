
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReaderLerdadosPlanoAlimentar {

	Plano  lerdados(String csvFile) throws Exception {
	Plano P=new Plano();
	P.Totais.add(0, "0.0");
	P.Totais.add(1, "0.0");
	P.Totais.add(2, "0.0");
	P.Totais.add(3, "0.0");
	P.Totais.add(4, "0.0");
	P.Totais.add(5, "0.0");
	P.Totais.add(6, "0.0");
	P.Totais.add(7, "0.0");
	P.Totais.add(8, "0.0");
	P.Totais.add(9, "0.0");
	P.Totais.add(10, "0.0");
	P.Totais.add(11, "0.0");
	P.Totais.add(12, "0.0");
	P.Totais.add(13, "0.0");
	P.Totais.add(14, "0.0");
	P.Totais.add(15, "0.0");
	P.Totais.add(16, "0.0");
	P.Totais.add(17, "0.0");
	P.Totais.add(18, "0.0");
	P.Totais.add(19, "0.0");
	P.Totais.add(20, "0.0");
	P.Totais.add(21, "0.0");
	P.Totais.add(22, "0.0");
	P.Totais.add(23, "0.0");
	P.Totais.add(24, "0.0");
	P.Totais.add(25, "0.0");
	P.Totais.add(26, "0.0");
	P.Totais.add(27, "0.0");
	P.Totais.add(28, "0.0");
	P.Totais.add(29, "0.0");
	P.Totais.add(30, "0.0");
	P.Totais.add(31, "0.0");
	P.Totais.add(32, "0.0");
	P.Totais.add(33, "0.0");
	P.Totais.add(34, "0.0");
	P.Totais.add(35, "0.0");
	P.Totais.add(36, "0.0");
	P.Totais.add(37, "0.0");
	P.Totais.add(38, "0.0");
	P.Totais.add(39, "0.0");
	
	Habito_Alimentar H = null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Produtos;
		Produtos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		//  String csvFile = "D:/Users/Andre Dias/Desktop/ES2/CALCULOS.csv";
	        String line = "";
	        String cvsSplitBy = ";";
	        String var="";
	        int v=0;
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
int iterator=0;
	            while (((line = br.readLine()) != null)) {

	                // use comma as separator
	              
	            	String[] Prod = line.split(cvsSplitBy);
	
	            	var=Prod[0].toString();
	            	if(Prod[0].equals("teste")||Prod[0].equals("Levantar")||Prod[0].equals("Pequeno Almoço")||Prod[0].equals("Meio da Manhã 1")||Prod[0].equals("Meio da Manhã 2")||Prod[0].equals("Almoço")||Prod[0].equals("Meio da Tarde 1")||Prod[0].equals("Meio da Tarde 2")||Prod[0].equals("Jantar")||Prod[0].equals("Ceia")) {
	            		if(iterator==0) {
	            			iterator++;
	            		}
	            		else {
	            		P.Habitos.add(H);

	 	               System.out.println("Habito Tipo Refeição:"+H.Tipo_Refeição);
	 	              System.out.println("Habito Hora:"+H.hora);
	            		
	            		}
	            		var=Prod[0].toString();
	            		H=new Habito_Alimentar();
	            		H.hora=Prod[1].toString();
	            		H.Tipo_Refeição=Prod[0];
	            		v=0;
	            		System.out.println("v"+v);
	            	}
	            	else
	            	{   v++;
	            		System.out.println("v"+v);
	            		Dose_Prod Dose_p=new Dose_Prod();
	            	   Dose_p.N_Produto=Prod[0];
	            	   Dose_p.Dosagem=Float.parseFloat(Prod[1]);
	            	  System.out.print("Dose"+Float.parseFloat(Prod[1]));
	            	   H.Doses_Prod.add(Dose_p);
	            	  Float TotalKcal=Float.parseFloat(P.Totais.get(0));
	            	  Float Kcal=(float) 0;
	            	  Float TotalKj=Float.parseFloat(P.Totais.get(1));
	            	  Float Kj=(float) 0;
	            	  Float TotalAgua=Float.parseFloat(P.Totais.get(2));
	            	  Float Agua=(float) 0;
	            	  Float TotalProteina=Float.parseFloat(P.Totais.get(3));
	            	  Float Proteina=(float) 0;
	            	  Float TotalGorduratotal=Float.parseFloat(P.Totais.get(4));
	            	  Float Gorduratotal=(float) 0;
	            	  Float Total_HC_disponiveis=Float.parseFloat(P.Totais.get(5));
	               	  Float HC_disponiveis=(float) 0;
	               	  Float Total_HC_expresso_em_monossacáridos=Float.parseFloat(P.Totais.get(6));
	               	  Float HC_expresso_em_monossacáridos=(float) 0;
	               	 Float Total_Mono_dissacridos=Float.parseFloat(P.Totais.get(7));
	               	  Float Mono_dissacaridos=(float) 0;
	             	 Float Total_Acidos_organicos=Float.parseFloat(P.Totais.get(8));
	               	  Float Acidos_organicos=(float) 0;
	               	 Float Total_alchool=Float.parseFloat(P.Totais.get(9));
	               	  Float alchool=(float) 0;
	               	Float TotalAmido=Float.parseFloat(P.Totais.get(10));
	            	  Float Amido=(float) 0;
	            	  
	            	  
Float TotalOligossacaridos=Float.parseFloat(P.Totais.get(11));
	            	  Float Oligossacaridos=(float) 0;
Float TotalFibra_alimentar=Float.parseFloat(P.Totais.get(12));
	            	  Float Fibra_alimentar=(float) 0;
Float TotalAcidos_gordos_saturados=Float.parseFloat(P.Totais.get(13));
	            	  Float Acidos_gordos_saturados=(float) 0;
Float TotalAcidos_gordos_monoinsaturados=Float.parseFloat(P.Totais.get(14));
	            	  Float Acidos_gordos_monoinsaturados=(float) 0;
Float TotalAcidos_gordos_polinsaturados=Float.parseFloat(P.Totais.get(15));
	            	  Float Acidos_gordos_polinsaturados=(float) 0;
Float TotalAcidos_gordos_trans=Float.parseFloat(P.Totais.get(16));
	            	  Float Acidos_gordos_trans=(float) 0;
Float TotalAcido_linoleico=Float.parseFloat(P.Totais.get(17));
	            	  Float Acido_linoleico=(float) 0;
Float TotalColesterol=Float.parseFloat(P.Totais.get(18));
	            	  Float Colesterol=(float) 0;
Float TotalVitA_total=Float.parseFloat(P.Totais.get(19));
	            	  Float VitA=(float) 0;
Float TotalCaroteno=Float.parseFloat(P.Totais.get(20));
	            	  Float Caroteno=(float) 0;
Float TotalVitD=Float.parseFloat(P.Totais.get(21));
	            	  Float VitD=(float) 0;
Float TotalA_tocoferol=Float.parseFloat(P.Totais.get(22));
	            	  Float A_tocoferol=(float) 0;
Float TotalTiamina=Float.parseFloat(P.Totais.get(23));
	            	  Float Tiamina=(float) 0;
Float TotalRiboflavina=Float.parseFloat(P.Totais.get(24));
	            	  Float Riboflavina=(float) 0;
Float TotalEquivalentes_de_niacina=Float.parseFloat(P.Totais.get(25));
	            	  Float Equivalentes_de_niacina=(float) 0;
Float TotalNiacina=Float.parseFloat(P.Totais.get(26));
	            	  Float Niacina=(float) 0;
Float TotalTriptofano=Float.parseFloat(P.Totais.get(27));
	            	  Float Triptofano=(float) 0;
Float TotalVitB6=Float.parseFloat(P.Totais.get(28));
	            	  Float VitB6=(float) 0;
Float TotalVitB12=Float.parseFloat(P.Totais.get(29));
	            	  Float VitB12=(float) 0;
Float TotalVitC=Float.parseFloat(P.Totais.get(30));
	            	  Float VitC=(float) 0;
Float TotalFolatos=Float.parseFloat(P.Totais.get(31));
	            	  Float Folatos=(float) 0;
Float TotalCinza=Float.parseFloat(P.Totais.get(32));
	            	  Float Cinza=(float) 0;
Float TotalNa=Float.parseFloat(P.Totais.get(33));
	            	  Float Na=(float) 0;
Float TotalK=Float.parseFloat(P.Totais.get(34));
	            	  Float K=(float) 0;
Float TotalCa=Float.parseFloat(P.Totais.get(35));
	            	  Float Ca=(float) 0;
Float TotalP1=Float.parseFloat(P.Totais.get(36));
	            	  Float P1=(float) 0;
Float TotalMg=Float.parseFloat(P.Totais.get(37));
	            	  Float Mg=(float) 0;
Float TotalFe=Float.parseFloat(P.Totais.get(38));
	            	  Float Fe=(float) 0;
Float TotalZn=Float.parseFloat(P.Totais.get(39));
	            	  Float Zn=(float) 0;
	            	  
	            	 
	            	  int i=0;
	            	  while(i!=Produtos.size()) {
	            	String Teste=Produtos.get(i).Nome;
	            	if(Teste.equals(Prod[0])) {
	            		
	            		Kcal=Produtos.get(i).Lista_calculofloat.get(2);
	            	     System.out.println(" Kcal:"+Produtos.get(i).Lista_calculofloat.get(2));
	            	     System.out.println("Dose"+Dose_p.Dosagem);
	            		 TotalKcal=TotalKcal+Kcal*(Float.parseFloat(Prod[1])/100);
	            		 System.out.println("3simples:"+Kcal*(Float.parseFloat(Prod[1])/100));
	            		 Kj=Produtos.get(i).Lista_calculofloat.get(3);
	            		 System.out.println(" Kj:"+Produtos.get(i).Lista_calculofloat.get(3));
	            	     System.out.println(" I:"+i);
	            		 TotalKj=TotalKj+Kj*(Float.parseFloat(Prod[1])/100);
	            		 Agua=Produtos.get(i).Lista_calculofloat.get(4);
	            		 System.out.println(" Agua:"+Produtos.get(i).Lista_calculofloat.get(4));
	            	     System.out.println(" I:"+i);
	            		 TotalAgua=TotalAgua+Agua*(Float.parseFloat(Prod[1])/100);
	            		 Gorduratotal=Produtos.get(i).Lista_calculofloat.get(5);
	            		 System.out.println(" Gorduratotal:"+Produtos.get(i).Lista_calculofloat.get(5));
	            	     System.out.println(" I:"+i);
	            	     TotalGorduratotal=TotalGorduratotal+Gorduratotal*(Float.parseFloat(Prod[1])/100);	
	            		 Proteina=Produtos.get(i).Lista_calculofloat.get(6);
	            		 System.out.println(" Proteina:"+Produtos.get(i).Lista_calculofloat.get(6));
	            	     System.out.println(" I:"+i);
	            		 TotalProteina=TotalProteina+Proteina*(Float.parseFloat(Prod[1])/100);
	            		 HC_disponiveis=Produtos.get(i).Lista_calculofloat.get(7);
	            		 System.out.println("HC_disponiveis:"+Produtos.get(i).Lista_calculofloat.get(7));
	            	     System.out.println(" I:"+i);
	            	     Total_HC_disponiveis=Total_HC_disponiveis+HC_disponiveis*(Float.parseFloat(Prod[1])/100);
	            	     HC_expresso_em_monossacáridos=Produtos.get(i).Lista_calculofloat.get(6);
	            		 System.out.println("HC_expresso_em_monossacáridos:"+Produtos.get(i).Lista_calculofloat.get(6));
	            	     System.out.println(" I:"+i);
	            	     Total_HC_expresso_em_monossacáridos=Total_HC_expresso_em_monossacáridos+HC_expresso_em_monossacáridos;
	            	     Mono_dissacaridos=Produtos.get(i).Lista_calculofloat.get(7);
	            		 System.out.println("Mono_dissacaridos:"+Produtos.get(i).Lista_calculofloat.get(7));
	            	     System.out.println(" I:"+i);
	            	     Total_Mono_dissacridos=Total_Mono_dissacridos+Mono_dissacaridos*(Float.parseFloat(Prod[1])/100);
	            	     Acidos_organicos=Produtos.get(i).Lista_calculofloat.get(8);
	            		 System.out.println(" Acidos_organicos:"+Produtos.get(i).Lista_calculofloat.get(8));
	            	     System.out.println(" I:"+i);
	            	     Total_Acidos_organicos=Total_Acidos_organicos+ Acidos_organicos*(Float.parseFloat(Prod[1])/100);
	            	     Total_alchool=Produtos.get(i).Lista_calculofloat.get(9);
	            		 System.out.println(" Total_alchool:"+Produtos.get(i).Lista_calculofloat.get(9));
	            	     System.out.println(" I:"+i);
	            	     Total_alchool=Total_alchool+ Total_alchool*(Float.parseFloat(Prod[1])/100);
	             	
	            	     Amido=Produtos.get(i).Lista_calculofloat.get(10);
	            		 System.out.println(" Total_Amido:"+Produtos.get(i).Lista_calculofloat.get(10));
	            	     System.out.println(" I:"+i);
	            	     TotalAmido=TotalAmido+ Amido*(Float.parseFloat(Prod[1])/100);
	            	     Oligossacaridos=Produtos.get(i).Lista_calculofloat.get(11);
	            	 	System.out.println(" Oligossacaridos:"+Produtos.get(i).Lista_calculofloat.get(11));
	            	 	System.out.println(" I:"+i);
	            	  	TotalOligossacaridos=TotalOligossacaridos+ Oligossacaridos*(Float.parseFloat(Prod[1])/100);
	            	 Fibra_alimentar=Produtos.get(i).Lista_calculofloat.get(12);
	            	 	System.out.println(" Fibra alimentar:"+Produtos.get(i).Lista_calculofloat.get(12));
	            	 	System.out.println(" I:"+i);
	            	 	TotalFibra_alimentar=TotalFibra_alimentar+Fibra_alimentar*(Float.parseFloat(Prod[1])/100);
	            	 Acidos_gordos_saturados=Produtos.get(i).Lista_calculofloat.get(13);
	            	 	System.out.println(" Acidos gordos saturados:"+Produtos.get(i).Lista_calculofloat.get(13));
	            	 	System.out.println(" I:"+i);
	            	 	TotalAcidos_gordos_saturados=TotalAcidos_gordos_saturados+Acidos_gordos_saturados*(Float.parseFloat(Prod[1])/100);
	            	 Acidos_gordos_monoinsaturados=Produtos.get(i).Lista_calculofloat.get(14);
	            	 	System.out.println(" Acidos gordos monoinsaturados:"+Produtos.get(i).Lista_calculofloat.get(14));
	            	 	System.out.println(" I:"+i);
	            	 	TotalAcidos_gordos_monoinsaturados=TotalAcidos_gordos_monoinsaturados+Acidos_gordos_monoinsaturados*(Float.parseFloat(Prod[1])/100);
	            	 Acidos_gordos_polinsaturados=Produtos.get(i).Lista_calculofloat.get(15);
	            	 	System.out.println(" Acidos_gordos_polinsaturados:"+Produtos.get(i).Lista_calculofloat.get(15));
	            	 	System.out.println(" I:"+i);
	            	 	TotalAcidos_gordos_polinsaturados=TotalAcidos_gordos_polinsaturados+Acidos_gordos_polinsaturados*(Float.parseFloat(Prod[1])/100);	
	            	 Acidos_gordos_trans=Produtos.get(i).Lista_calculofloat.get(16);
	            	 	System.out.println(" Acidos_gordos_trans:"+Produtos.get(i).Lista_calculofloat.get(16));
	            	 	System.out.println(" I:"+i);
	            	 	TotalAcidos_gordos_trans=TotalAcidos_gordos_trans+Acidos_gordos_trans*(Float.parseFloat(Prod[1])/100);
	            	 Acido_linoleico=Produtos.get(i).Lista_calculofloat.get(17);
	            	 	System.out.println("Acido_linoleico:"+Produtos.get(i).Lista_calculofloat.get(17));
	            	 	System.out.println(" I:"+i);
	            	 	TotalAcido_linoleico=TotalAcido_linoleico+Acido_linoleico*(Float.parseFloat(Prod[1])/100);
	            	 Colesterol=Produtos.get(i).Lista_calculofloat.get(18);
	            	 	System.out.println("Colesterol:"+Produtos.get(i).Lista_calculofloat.get(18));
	            	 	System.out.println(" I:"+i);
	            	 	TotalColesterol=TotalColesterol+Colesterol*(Float.parseFloat(Prod[1])/100);
	            	 VitA=Produtos.get(i).Lista_calculofloat.get(19);
	            	 	System.out.println("VitA_Total_:"+Produtos.get(i).Lista_calculofloat.get(19));
	            	 	System.out.println(" I:"+i);
	            	 	TotalVitA_total=TotalVitA_total+VitA*(Float.parseFloat(Prod[1])/100);
	            	 Caroteno=Produtos.get(i).Lista_calculofloat.get(20);
	            	 	System.out.println(" Caroteno:"+Produtos.get(i).Lista_calculofloat.get(20));
	            	 	System.out.println(" I:"+i);
	            	 	TotalCaroteno=TotalCaroteno+ Caroteno*(Float.parseFloat(Prod[1])/100);
	            	 VitD=Produtos.get(i).Lista_calculofloat.get(21);
	            	 	System.out.println(" VitD:"+Produtos.get(i).Lista_calculofloat.get(21));
	            	 	System.out.println(" I:"+i);
	            	 	TotalVitD=TotalVitD+ VitD*(Float.parseFloat(Prod[1])/100);
	            	 A_tocoferol=Produtos.get(i).Lista_calculofloat.get(22);
	            	 	System.out.println(" A_tocoferol:"+Produtos.get(i).Lista_calculofloat.get(22));
	            	 	System.out.println(" I:"+i);
	            	 	TotalA_tocoferol=TotalA_tocoferol+ A_tocoferol*(Float.parseFloat(Prod[1])/100);
	            	 Tiamina=Produtos.get(i).Lista_calculofloat.get(23);
	            	 	System.out.println(" Tiamina:"+Produtos.get(i).Lista_calculofloat.get(23));
	            	 	System.out.println(" I:"+i);
	            	 	TotalTiamina=TotalTiamina+ Tiamina*(Float.parseFloat(Prod[1])/100);
	            	 Riboflavina=Produtos.get(i).Lista_calculofloat.get(24);
	            	 	System.out.println(" Riboflavina:"+Produtos.get(i).Lista_calculofloat.get(24));
	            	 	System.out.println(" I:"+i);
	            	 	TotalRiboflavina=TotalRiboflavina+Riboflavina*(Float.parseFloat(Prod[1])/100);
	            	 Equivalentes_de_niacina=Produtos.get(i).Lista_calculofloat.get(25);
	            	 	System.out.println(" Equivalentes_de_niacina:"+Produtos.get(i).Lista_calculofloat.get(25));
	            	 	System.out.println(" I:"+i);
	            	 	TotalEquivalentes_de_niacina=TotalEquivalentes_de_niacina+Equivalentes_de_niacina*(Float.parseFloat(Prod[1])/100);
	            	 Niacina=Produtos.get(i).Lista_calculofloat.get(26);
	            	 	System.out.println(" Niacina:"+Produtos.get(i).Lista_calculofloat.get(26));
	            	 	System.out.println(" I:"+i);
	            	 	TotalNiacina=TotalNiacina+Niacina*(Float.parseFloat(Prod[1])/100);
	            	 Triptofano=Produtos.get(i).Lista_calculofloat.get(27);
	            	 	System.out.println(" Triptofano:"+Produtos.get(i).Lista_calculofloat.get(27));
	            	 	System.out.println(" I:"+i);
	            	 	TotalTriptofano=TotalTriptofano+Triptofano*(Float.parseFloat(Prod[1])/100);	
	            	 VitB6=Produtos.get(i).Lista_calculofloat.get(28);
	            	 	System.out.println(" VitB6:"+Produtos.get(i).Lista_calculofloat.get(28));
	            	 	System.out.println(" I:"+i);
	            	 	TotalVitB6=TotalVitB6+VitB6*(Float.parseFloat(Prod[1])/100);
	            	 VitB12=Produtos.get(i).Lista_calculofloat.get(29);
	            	 	System.out.println("VitB12:"+Produtos.get(i).Lista_calculofloat.get(29));
	            	 	System.out.println(" I:"+i);
	            	 	TotalVitB12=TotalVitB12+VitB12*(Float.parseFloat(Prod[1])/100);
	            	 VitC=Produtos.get(i).Lista_calculofloat.get(30);
	            	 	System.out.println("VitC:"+Produtos.get(i).Lista_calculofloat.get(30));
	            	 	System.out.println(" I:"+i);
	            	 	TotalVitC=TotalVitC+VitC;
	            	 Folatos=Produtos.get(i).Lista_calculofloat.get(31);
	            	 	System.out.println("Folatos:"+Produtos.get(i).Lista_calculofloat.get(31));
	            	 	System.out.println(" I:"+i);
	            	 	TotalFolatos=TotalFolatos+Folatos*(Float.parseFloat(Prod[1])/100);
	            	 Cinza=Produtos.get(i).Lista_calculofloat.get(32);
	            	 	System.out.println(" Cinza:"+Produtos.get(i).Lista_calculofloat.get(32));
	            	 	System.out.println(" I:"+i);
	            	 	TotalCinza=TotalCinza+ Cinza*(Float.parseFloat(Prod[1])/100);
	            	 Na=Produtos.get(i).Lista_calculofloat.get(33);
	            	 	System.out.println(" Na:"+Produtos.get(i).Lista_calculofloat.get(33));
	            	 	System.out.println(" I:"+i);
	            	 	TotalNa=TotalNa+ Na*(Float.parseFloat(Prod[1])/100);
	            	 K=Produtos.get(i).Lista_calculofloat.get(34);
	            	 	System.out.println(" K:"+Produtos.get(i).Lista_calculofloat.get(34));
	            	 	System.out.println(" I:"+i);
	            	 	TotalK=TotalK+ K*(Float.parseFloat(Prod[1])/100);
	            	 Ca=Produtos.get(i).Lista_calculofloat.get(35);
	            	 	System.out.println(" Ca:"+Produtos.get(i).Lista_calculofloat.get(35));
	            	 	System.out.println(" I:"+i);
	            	 	TotalCa=TotalCa+ Ca*(Float.parseFloat(Prod[1])/100);
	            	 P1=Produtos.get(i).Lista_calculofloat.get(36);
	            	 	System.out.println(" P:"+Produtos.get(i).Lista_calculofloat.get(36));
	            	 	System.out.println(" I:"+i);
	            	 	TotalP1=TotalP1+P1*(Float.parseFloat(Prod[1])/100);
	            	 Mg=Produtos.get(i).Lista_calculofloat.get(37);
	            	 	System.out.println(" Mg:"+Produtos.get(i).Lista_calculofloat.get(37));
	            	 	System.out.println(" I:"+i);
	            	 	TotalMg=TotalMg+Mg*(Float.parseFloat(Prod[1])/100);
	            	 Fe=Produtos.get(i).Lista_calculofloat.get(38);
	            	 	System.out.println(" VitFe:"+Produtos.get(i).Lista_calculofloat.get(38));
	            	 	System.out.println(" I:"+i);
	            	 	TotalFe=TotalFe+Fe*(Float.parseFloat(Prod[1])/100);
	            	 Zn=Produtos.get(i).Lista_calculofloat.get(39);
	            	 	System.out.println(" Zn:"+Produtos.get(i).Lista_calculofloat.get(39));
	            	 	System.out.println(" I:"+i);
	            	 	TotalZn=TotalZn+Zn*(Float.parseFloat(Prod[1])/100);
	            	     
	            		 
	            	}
	            	
	            		i++;  
	            	  }
	            	
	            	   P.Totais.add(0,(TotalKcal).toString());
	                   System.out.println("TOTAL Kcal:"+TotalKcal);
	                   P.Totais.add(1,(TotalKj).toString());
	                   System.out.println("TOTAL Kj:"+TotalKj);
	                   P.Totais.add(2,(TotalAgua).toString());
	                   System.out.println("TOTAL Agua:"+TotalAgua);
	            
	               
	                   P.Totais.add(3,(TotalProteina).toString());
	                   System.out.println("TOTAL Proteina:"+TotalProteina);
	                   P.Totais.add(4,(TotalGorduratotal).toString());
	                   System.out.println("TOTAL Gordura total:"+TotalGorduratotal);
	                   P.Totais.add(5,(Total_HC_disponiveis).toString());
	                   System.out.println("TOTAL Total HC disponiveis:"+Total_HC_disponiveis);  
	                   P.Totais.add(6,(Total_HC_expresso_em_monossacáridos).toString());
	                   System.out.println("TOTAL Total HC expresso em monossacaridos:"+Total_HC_expresso_em_monossacáridos);
	                   P.Totais.add(7,(Total_Mono_dissacridos).toString());
	                   System.out.println("TOTAL Mono + dissacáridos :"+Mono_dissacaridos );
	                   P.Totais.add(8,(Total_Acidos_organicos).toString());
	                   System.out.println("TOTAL Acidos organicos:"+Total_Acidos_organicos);
	                   P.Totais.add(9,(Total_alchool).toString());
	                   System.out.println("TOTAL Alcool:"+Total_alchool);
	                   P.Totais.add(10,(TotalAmido).toString());
	                   System.out.println("TOTAL Amido:"+TotalAmido);
	                   P.Totais.add(11,(TotalOligossacaridos).toString());
	                   System.out.println("TOTAL Oligossacaridos:"+TotalOligossacaridos); 
	                   P.Totais.add(12,(TotalFibra_alimentar).toString());
	                   System.out.println("TOTAL Fibra alimentar:"+TotalFibra_alimentar);
	                   P.Totais.add(13,(TotalAcidos_gordos_saturados).toString());
	                   System.out.println("TOTAL Acidos gordos saturados:"+TotalAcidos_gordos_saturados);
	                   P.Totais.add(14,(TotalAcidos_gordos_monoinsaturados).toString());
	                   System.out.println("TOTAL Acidos gordos monoinsaturados:"+TotalAcidos_gordos_monoinsaturados);
	                   P.Totais.add(15,(TotalAcidos_gordos_polinsaturados).toString());
	                   System.out.println("TOTAL Acidos gordos polinsaturados:"+TotalAcidos_gordos_polinsaturados);
	                   P.Totais.add(16,(TotalAcidos_gordos_trans).toString());
	                   System.out.println("TOTAL Acidos gordos trans:"+TotalAcidos_gordos_trans);
	                   P.Totais.add(17,(TotalAcido_linoleico).toString());
	                   System.out.println("TOTAL Acido linoleico:"+TotalAcido_linoleico);
	                   P.Totais.add(18,(TotalColesterol).toString());
	                   System.out.println("TOTAL Colesterol:"+TotalColesterol);  
	                   P.Totais.add(19,(TotalVitA_total).toString());
	                   System.out.println("TOTAL Vit A total:"+TotalVitA_total);
	                   P.Totais.add(20,(TotalCaroteno).toString());
	                   System.out.println("TOTAL Caroteno:"+TotalCaroteno);
	                   P.Totais.add(21,(TotalVitD).toString());
	                   System.out.println("TOTAL Vit. D:"+TotalVitD);
	                   P.Totais.add(22,(TotalA_tocoferol).toString());
	                   System.out.println("TOTAL A-tocoferol:"+TotalA_tocoferol);
	                   P.Totais.add(23,(TotalTiamina).toString());
	                   System.out.println("TOTAL Tiamina:"+TotalTiamina);
	                   P.Totais.add(24,(TotalRiboflavina).toString());
	                   System.out.println("TOTAL Riboflavina:"+TotalRiboflavina); 
	                   P.Totais.add(25,(TotalEquivalentes_de_niacina).toString());
	                   System.out.println("TOTAL Equivalentes de niacina:"+TotalEquivalentes_de_niacina);
	                   P.Totais.add(26,(TotalNiacina).toString());
	                   System.out.println("TOTAL Niacina:"+TotalNiacina);
	                   P.Totais.add(27,(TotalTriptofano).toString());
	                   System.out.println("TOTAL Triptofano:"+TotalTriptofano);
	                   P.Totais.add(28,(TotalVitB6).toString());
	                   System.out.println("TOTAL Vit B6:"+TotalVitB6);
	                   P.Totais.add(29,(TotalVitB12).toString());
	                   System.out.println("TOTAL Vit B12:"+TotalVitB12);
	                   P.Totais.add(30,(TotalVitC).toString());
	                   System.out.println("TOTAL Vit C:"+TotalVitC);
	                   P.Totais.add(31,(TotalFolatos).toString());
	                   System.out.println("TOTAL Folatos:"+TotalFolatos);
	                   P.Totais.add(32,(TotalCinza).toString());
	                   System.out.println("TOTAL Cinza:"+TotalCinza);
	                   P.Totais.add(33,(TotalNa).toString());
	                   System.out.println("TOTAL Na:"+TotalNa);
	                   P.Totais.add(34,(TotalK).toString());
	                   System.out.println("TOTAL K:"+TotalK); 
	                   P.Totais.add(35,(TotalCa).toString());
	                   System.out.println("TOTAL Ca:"+TotalCa);
	                   P.Totais.add(36,(TotalP1).toString());
	                   System.out.println("TOTAL P:"+TotalP1);
	                   P.Totais.add(37,(TotalMg).toString());
	                   System.out.println("TOTAL Mg:"+TotalMg);
	                   P.Totais.add(38,(TotalFe).toString());
	                   System.out.println("TOTAL Vit Fe:"+TotalFe);
	                   P.Totais.add(39,(TotalZn).toString());
	                   System.out.println("TOTAL Zn:"+TotalZn); 
                       System.out.println("String"+P.Totais.toString());

	                   
	            	}
	            	
	
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
			return P;
		
	     
	   	
	}
	
	
	

	
	
	}

//       void funccsvreader( ArrayList<Produto> Produtos ) {
    	