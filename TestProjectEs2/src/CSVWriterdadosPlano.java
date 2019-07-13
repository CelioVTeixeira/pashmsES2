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
"Água (g);;" + 
";;" + 
"Proteína (g);;" + 
";;" + 
"Gordura total (g);;" + 
";;" + 
"Total HC disponíveis (g);;" + 
";;" + 
"Total HC expresso em monossacáridos (g);;" + 
";;" + 
"Mono + dissacáridos (g);;" + 
";;" + 
"Ácidos orgânicos (g);;" + 
";;" + 
"Álcool (g);;" + 
";;" + 
"Amido (g);;" + 
";;" + 
"Oligossacáridos (g);;" + 
";;" + 
"Fibra alimentar (g);;" + 
";;" + 
"Ácidos gordos saturados (g);;" + 
";;" + 
"Ácidos gordos monoinsaturados (g);;" + 
";;" + 
"Ácidos gordos polinsaturados  (g);;" + 
";;" + 
"Ácidos gordos trans (g);;" + 
";;" + 
"Ácido linoleico (g);;" + 
";;" + 
"Colesterol (mg);;" + 
";;" + 
"Vit A total (equivalentes retinol) (mg);;" + 
";;" + 
"Caroteno (mg);;" + 
";;" + 
"vit. D (µg);;" + 
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
"Vit. B12 (µg);;" + 
";;" + 
"vit. C (mg);;" + 
";;" + 
"Folatos (µg);;" + 
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