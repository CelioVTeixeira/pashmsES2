import java.util.ArrayList; // import the ArrayList class


public class Paciente {
	
int id_pacient;	
String Nome_Pacient;
String Profisao;
int idade;
String sexo;
DadosFisicos DadosFisicos;
Plano P_Atual;
Plano P_Prescrito;
float Gasto_Total_Energetico;	
	

void adiciona_PAtual(){
	
}
void adiciona_Prescrito() {
	
	
}
int getidade() {
	return idade;
}
String getprof() {
	return Profisao;
}

String getNome() {
	return Nome_Pacient;
}
String getsexo() {
	return sexo;
}

float caculaHarrisBenedict() {
	
	if(sexo.equals("Masculino"))
		Gasto_Total_Energetico= (float) (66.5 + (13.8*DadosFisicos.peso)+ 5*DadosFisicos.Altura-(6.8*idade)*1.1);
		
	if(sexo.equals("Feminino"))
	Gasto_Total_Energetico= (float) (655.1 + (9.5*DadosFisicos.peso)+ 1.8*DadosFisicos.Altura-(4.7*idade)*1.1);
	
	return Gasto_Total_Energetico;
	
}
}
