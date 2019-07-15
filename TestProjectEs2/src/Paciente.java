import java.util.ArrayList; // import the ArrayList class


public class Paciente {
	
int id_pacient;	
String Nome_Pacient;
String Profisao;
int idade;
String sexo;
DadosFisicos DadosFisicos;
Plano P_Atual;
float fator_lesao=1;
float fator_termico=(float) 1.1;
public float getFator_termico() {
	return fator_termico;
}
public void setFator_termico(float fator_termico) {
	this.fator_termico = fator_termico;
}
public float getFator_lesao() {
	return fator_lesao;
}
public void setFator_lesao(float fator_lesao) {
	this.fator_lesao = fator_lesao;
}

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
		Gasto_Total_Energetico= (float) (66.5 + (13.8*DadosFisicos.peso)+ 5*DadosFisicos.Altura-(6.8*idade)*fator_termico*fator_lesao);
		
	if(sexo.equals("Feminino"))
	Gasto_Total_Energetico= (float) (655.1 + (9.5*DadosFisicos.peso)+ 1.8*DadosFisicos.Altura-(4.7*idade)*fator_termico*fator_lesao);
	
	return Gasto_Total_Energetico;
	
}
}
