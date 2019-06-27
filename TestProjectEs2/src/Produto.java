import java.util.ArrayList;
import java.util.HashMap;
public class Produto {
	
    String id_prod;
    String Nome;
	//HashMap<String,String> valores =new HashMap<String,String>();
  
    String[] Lista_Calculo;
    
    String getnome() {
		return Nome;
    	
    }
    ArrayList <Float> Lista_calculofloat = new ArrayList<Float>();
	 
	 
	 void converterparafloat() {
		 System.out.println("heyyyyyyyyyyyyyyyyyyyyyy");
		 int i=0;
		 while(i<=41) {
			 
			 if(i>=2) {
				 System.out.println(Lista_Calculo[i]);
				 
			
				 if(i==2) {
					 if(Float.parseFloat(Lista_Calculo[i])>901 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
						 Lista_calculofloat.add((float) -1);
					 }
					 
					 else
						 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
					 
				 }
				 
				 else
					 if(i==3) {
						 if(Float.parseFloat(Lista_Calculo[i])>3766 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
							 Lista_calculofloat.add((float) -1);
						 }
						 
						 else
							 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
						 
					 }
					 else
				 if(i==4 || i==5 || i==6 || i==7 || i==8 || i==9 || i==12 || i==15 ||i==23 || i==24 || i==31 || i==34 || i==41) {
					 if(Float.parseFloat(Lista_Calculo[i])>110 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
						 Lista_calculofloat.add((float) -1);
					 }
					 
					 else
						 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
					 
				 }
				 else
					 if(i==10 || i==13 || i==26) {
						 
						 //6
						 
					 }
					 else
						 if(i==11) {
							 //44
							 
							 
							 
						 }
						 else
							 if(i==14 || i==27 || i==28 || i==40) {
								 
								 //38
								 
								 
							 }
						 
							 else
								 if(i==16 || i==17 || i==19) {
									 if(Float.parseFloat(Lista_Calculo[i])>110 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
										 Lista_calculofloat.add((float) -1);
									 }
									 else
										 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
									 
								 }
								 else
									 if(i==18 || i==29) {
										//17 
										 
										 
										 
									 }
									 else
										 if(i==20 || i==37 ) {
											 //1280
											 
											 
											 
										 }
										 else
											 if(i==21) {
												 //14000
												 
												 
												 
											 }
											 else
												 if(i==22) {
													 //30730
													 
													 
													 
												 }
												 else
													 if(i==25 ||i==30) {
														 //3
														 
														 
														 
													 }
													 else
														 if(i==32 || i==39) {
															 //406
															 
															 
															 
														 }
														 else
															 if(i==33) {
																 //2500
																 
																 
																 
															 }
															 else
																 if(i==35) {
																	 //40000
																	 
																	 
																	 
																 }
															 else
																	 if(i==36) {
																		 //3930
																		 
																		 
																		 
																	 }
																	 else
																		 if(i==38) {
																			 //10523
																			 
																			 
																			 
																		 }
																
				 
					 
				 
				 
					 
				 
			 }
			 i++;
			 
		 }
		 
			int j=0;
			System.out.println("LISTA_CalculoFloat!!!!!!!!!!!!!!!");
			 while(j<=40) {
		 
				 System.out.println("indice:"+j+"valor:"+Lista_calculofloat.get(j));
				 j++;
			 }
		 
		 
	 }

}
