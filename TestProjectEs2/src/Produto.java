import java.util.ArrayList;
import java.util.HashMap;

import Exception.ExceptionError1;
import Exception.ExceptionError11;
import Exception.ExceptionError12;
import Exception.ExceptionError15;
import Exception.ExceptionError17;
import Exception.ExceptionError19;
import Exception.ExceptionError2;
import Exception.ExceptionError21;
import Exception.ExceptionError22;
import Exception.ExceptionError23;
import Exception.ExceptionError26;
import Exception.ExceptionError3;
import Exception.ExceptionError33;
import Exception.ExceptionError34;
import Exception.ExceptionError36;
import Exception.ExceptionError37;
import Exception.ExceptionError39;
import Exception.ExceptionError4;
import Exception.ExceptionError5;

public class Produto {
	
    String id_prod;
    String Nome;
	//HashMap<String,String> valores =new HashMap<String,String>();
  
    String[] Lista_Calculo;
    
    String getnome() {
		return Nome;
    	
    }
    ArrayList <Float> Lista_calculofloat = new ArrayList<Float>();
	 
	 
	 void converterparafloat() throws Exception {
		 System.out.println("heyyyyyyyyyyyyyyyyyyyyyy");
		 int i=0;
		 while(i<43) {
			// System.out.println("indice:"+i);
			
		         if(i==0) {
		        	 if(Lista_Calculo[i].contains("IS")==false || Lista_Calculo[i].length()<=2 )
		        		 throw new ExceptionError1();
		        	 else {
		        	 id_prod=Lista_Calculo[0];
		        	 Lista_calculofloat.add((float) 0.00);
		        	 }
		         
		         }
		         if(i==1) {
		        	 if(  Lista_Calculo[i].length()>100|| Lista_Calculo[i].length()<3 || Lista_Calculo[i].isEmpty() )
		        		 throw new ExceptionError2();
		        	 else	{ 
		        	 Nome=Lista_Calculo[1];
		        	 Lista_calculofloat.add((float) 0.00);
		        	 }
		         
		         }
				 if(i==2) {
					 if(Float.parseFloat(Lista_Calculo[i])>901 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].isEmpty() ) {
						 throw new ExceptionError3();
					 }
					 
					 else
						 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
					// Lista_calculofloat.set(i,Float.parseFloat(Lista_Calculo[i]));
					 System.out.println("heyyyyyyyyyyyyyyyyyyyyyy");
				 }
				 
				 else
					 if(i==3) {
						 if(Float.parseFloat(Lista_Calculo[i])>3766 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
							 throw new ExceptionError4();
						 }
						 
						 else
							 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
						 System.out.println("heyyyyyyyyyyyyyyyyyyyyyy");
						 
					 }
					 else
				 if(i==4 || i==5 || i==6 || i==7 || i==8 || i==9 || i==12 || i==15 ||i==23 || i==24 || i==31 || i==34 || i==41 || i==42) {
					 if(Float.parseFloat(Lista_Calculo[i])>110 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
						 throw new ExceptionError5();
					 }
					 
					 else
						 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
					 System.out.println("heyyyyyyyyyyyyyyyyyyyyyy");
				 }
				 else
					 if(i==10 || i==13 || i==26) {
						 if(Float.parseFloat(Lista_Calculo[i])>6 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
							 throw new ExceptionError11();
						 }
						 
					 else
						 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
						 //6
					 }
			 
					 else
						 if(i==11) {
							 //44
							 if(Float.parseFloat(Lista_Calculo[i])>44 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
								 throw new ExceptionError12();
							 }
							 else
								 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
							 
							 
						 }
						 else
							 if(i==14 || i==27 || i==28 || i==40) {
								 if(Float.parseFloat(Lista_Calculo[i])>38 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
								 throw new ExceptionError15();
								 }
								 else
									 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
								 
								 
							 }
						 
							 else
								 if(i==16 || i==17 || i==19) {
									 if(Float.parseFloat(Lista_Calculo[i])>110 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
										 throw new ExceptionError17();
									 }
									 else
										 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
									 
								 }
								 else
									 if(i==18 || i==29) {
										//17 
										 if(Float.parseFloat(Lista_Calculo[i])>17 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
											 throw new ExceptionError19();
											
										 }
											 
										 else
											 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
											 
										 
										 
										 
									 }
									 else
										 if(i==20 || i==37 ) {
											 //1280
											 if(Float.parseFloat(Lista_Calculo[i])>1280 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
												 throw new ExceptionError21();
											 }
											 else
												 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
											 
											 
											 
										 }
										 else
											 if(i==21) {
												 //14000
												 if(Float.parseFloat(Lista_Calculo[i])>14000 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
													 throw new ExceptionError22();
												 }
												 else
													 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
												 
												 
											 }
											 else
												 if(i==22) {
													 //30730
													 if(Float.parseFloat(Lista_Calculo[i])>30730 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
														 throw new ExceptionError23();
													 }
													 else
														 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
													 
													 
												 }
												 else
													 if(i==25 ||i==30) {
														 //3
														 if(Float.parseFloat(Lista_Calculo[i])>3 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
															 throw new ExceptionError26();	
														 }
														 else
															 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
														 
														 
														 
													 }
													 else
														 if(i==32 || i==39) {
															 
															 //406
															 if(Float.parseFloat(Lista_Calculo[i])>406 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
																 throw new ExceptionError33();
															 }
															 else
																 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
															 
															 
														 }
														 else
															 if(i==33) {
																 //2500
																 if(Float.parseFloat(Lista_Calculo[i])>2500 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
																	 throw new ExceptionError34();
																 }
																 else
																	 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
																 System.out.println("333333333333");									 
																 
															 }
															 else
																 if(i==35) {
																	 //40000
																	 if(Float.parseFloat(Lista_Calculo[i])>40000 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
																		 throw new ExceptionError36();
																	 }
																	 else
																		 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
																	 
																	 
																	 
																 }
															 else
																	 if(i==36) {
																		 //3930
																		 if(Float.parseFloat(Lista_Calculo[i])>3930 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
																			 throw new ExceptionError37();
																		 }
																		 else
																			 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
																		 
																		 
																		 
																	 }
																	 else
																		 if(i==38) {
																			 //10523
																		
																			 if(Float.parseFloat(Lista_Calculo[i])>15023 || Float.parseFloat(Lista_Calculo[i])<0 || Lista_Calculo[i].equals(null) ) {
																				 throw new ExceptionError39();	
																			 }
																			 else
																				 Lista_calculofloat.add(Float.parseFloat(Lista_Calculo[i]));
																			 
																		 
																		 }
			 
				 
					 
				 
		 
					 
				 
			 
			 i++;
			 
		 }
		 
			int j=2;
			System.out.println("Listaindice 4:"+Lista_calculofloat.get(41));
			
		 
		 
	 }

}
