import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVWriterdadosPlano {

	
	
	void escreverDados(ArrayList<String> Totais){
@SuppressWarnings("unused")
String P ="Energia (kcal);" + 
";;" + 
"Energia (kJ);;" + 
";;" + 
"�gua (g);;" + 
";;" + 
"Prote�na (g);;" + 
";;" + 
"Gordura total (g);;" + 
";;" + 
"Total HC dispon�veis (g);;" + 
";;" + 
"Total HC expresso em monossac�ridos (g);;" + 
";;" + 
"Mono + dissac�ridos (g);;" + 
";;" + 
"�cidos org�nicos (g);;" + 
";;" + 
"�lcool (g);;" + 
";;" + 
"Amido (g);;" + 
";;" + 
"Oligossac�ridos (g);;" + 
";;" + 
"Fibra alimentar (g);;" + 
";;" + 
"�cidos gordos saturados (g);;" + 
";;" + 
"�cidos gordos monoinsaturados (g);;" + 
";;" + 
"�cidos gordos polinsaturados  (g);;" + 
";;" + 
"�cidos gordos trans (g);;" + 
";;" + 
"�cido linoleico (g);;" + 
";;" + 
"Colesterol (mg);;" + 
";;" + 
"Vit A total (equivalentes retinol) (mg);;" + 
";;" + 
"Caroteno (mg);;" + 
";;" + 
"vit. D (�g);;" + 
";;" + 
"a-tocoferol (mg);;" + 
";;" + 
"Tiamina (mg);;" + 
";;" + 
"Riboflavina (mg);;" + 
";;" + 
"Equivalentes de niacina (mg);;" + 
";;" + 
"Niacina (mg);;" + 
";;" + 
"Triptofano/60 (mg);;" + 
"vit B6 (mg);;" + 
";;" + 
"Vit. B12 (�g);;" + 
";;" + 
"vit. C (mg);;" + 
";;" + 
"Folatos (�g);;" + 
";;" + 
"Cinza (g);;" + 
";;" + 
"Na (mg);;" + 
";;" + 
"K    (mg);;" + 
";;" + 
"Ca (mg);;" + 
";;" + 
"P (mg);;" + 
";;" + 
"Mg (mg);;" + 
";;" + 
"Fe (mg);;" + 
";;" + 
"Zn (mg);;" + 
";;" + 
"	\n;" ;
    try (PrintWriter writer = new PrintWriter(new File("D://Fichascsv//test.csv"))) {
Totais.toString();
writer.write(P.toString());
      StringBuilder sb = new StringBuilder();
      

      writer.write(Totais.toString());

      System.out.println("Totais do plano alimentar escritos em teste.csv!");

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}