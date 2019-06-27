import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestesBlackBox {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
void test_idade_ok_0() throws FileNotFoundException, IOException {
		Paciente P
		=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		assertEquals(25,P.getidade());	
System.out.println("DadosCLiente_Idade:"+P.getidade());	
		//P.Nome_Pacient
		
		
	}
	@Test
	void test_idade_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		assertEquals(-1,P.getidade());
System.out.println("DadosCLiente_Idade:"+P.getidade());	
		//P.Nome_Pacient
		
		
	}
	@Test
	void test_idade_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.getidade());

		//P.Nome_Pacient
		
		
	} 
	@Test
	void test_idade_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.getidade());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(170,P.DadosFisicos.getAltura());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getAltura());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getAltura());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getAltura());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(400,P.DadosFisicos.getPeso());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getPeso());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getPeso());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getPeso());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(24,2,P.DadosFisicos.getIMC());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getIMC());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getIMC());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getIMC());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_bf_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(85,P.DadosFisicos.getB_F());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_bf_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getB_F());

		//P.Nome_Pacient
		
		
	}@Test
	void test_bf_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getB_F());

		//P.Nome_Pacient
		
		
	}@Test
	void test_bf_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getB_F());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(75,P.DadosFisicos.getH20());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getH20());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getH20());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getH20());

		//P.Nome_Pacient
		
		
	}	
	@Test
	void test_osso_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(1,P.DadosFisicos.getOsso());

		//P.Nome_Pacient
		
		
	}	
	@Test
	void test_osso_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-5,P.DadosFisicos.getOsso());

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_osso_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-5,P.DadosFisicos.getOsso());

		//P.Nome_Pacient
		
		
	}	
	@Test
	void test_osso_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-5,P.DadosFisicos.getOsso());

		//P.Nome_Pacient
		
		
	}	
	
	@Test
	void test_metabasal__ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(1.5,P.DadosFisicos.getMetabolismo_basal());

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_metabasal___menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getMetabolismo_basal());

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_metabasal___maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getMetabolismo_basal());

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_metabasal_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getMetabolismo_basal());

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_idade_meta_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(30,P.DadosFisicos.getIdade_Metabolica());

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_idade_meta_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getIdade_Metabolica());

		//P.Nome_Pacient
	
		
	}	
	@Test
	void test_idade_meta_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getIdade_Metabolica());

		//P.Nome_Pacient
	
		
	}	
	@Test
	void test_idade_meta_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getIdade_Metabolica());

		//P.Nome_Pacient	
	}	
	@Test
	void test_gordura_visceral_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(12,P.DadosFisicos.getGordura_Visceral());

		//P.Nome_Pacient	
	}	
		
	@Test
	void test_gordura_visceral_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getGordura_Visceral());

		//P.Nome_Pacient	
	}	
	@Test
	void test_gordura_visceral_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getGordura_Visceral());

		//P.Nome_Pacient	
	}	
		
	@Test
	void test_gordura_visceral_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals(-1,P.DadosFisicos.getGordura_Visceral());

		//P.Nome_Pacient	
	}
	@Test
	void test_profissao_ok1() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("Estudante",P.getprof());
		
		//P.Nome_Pacient	
	}	

	@Test
	void test_profissao_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("Error",P.getprof());
		
		//P.Nome_Pacient	
	}	
		

	@Test
	void test_profissao_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("Error",P.getprof());
		
		//P.Nome_Pacient	
	}	

	@Test
	void test_profissao_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("Error",P.getprof());
		
		//P.Nome_Pacient	
	}	
	
	@Test
	void test_nome_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("AndreAndre",P.getNome());
		
		//P.Nome_Pacient	
	}	
	@Test
	void test_nome_menor() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("error",P.getNome());
		
		//P.Nome_Pacient	
	}	
	@Test
	void test_nome_maior() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		System.out.println("DadosCLiente_NOME:"+P.getNome());	
		assertEquals("error",P.getNome());
		
		//P.Nome_Pacient	
	}	
	

	@Test
	void test_nome_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("error",P.getNome());
		
		//P.Nome_Pacient	
	}	

	@Test
	void test_sexo_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("Masculino",P.getsexo());
		
		//P.Nome_Pacient	
	}	
	@Test
	void test_sexo_mal() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("error",P.getsexo());
		
		//P.Nome_Pacient	
	}
	@Test
	void test_sexo_null() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("Error",P.getsexo());
		
		//P.Nome_Pacient	
	}
		
		
		
		
	@Test
	void test_energia_Kcal_ok() throws FileNotFoundException, IOException {
		 Produto P=null;
		CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
		ArrayList<Produto> Prodrutos=CSV.lerdados("D://Fichascsv//ficha_ok.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(2);
		assertEquals(237.00f,Teste,0.01);

		//P.Nome_Pacient	
	}	
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	void test_NomePaciente_ok() throws FileNotFoundException, IOException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
		System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertEquals("AndreAndre",P.getNome());

		//P.Nome_Pacient
		
		
	} 
	
	
	
	
	

}
