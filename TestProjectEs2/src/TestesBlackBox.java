import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
import Exception.ExceptionError_BF;
import Exception.ExceptionError_Idade_meta;



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
void test_idade_ok_0() throws  Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(25,P.getidade());	
			System.out.println("DadosCLiente_Idade:"+P.getidade());	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//P.Nome_Pacient
		

		
	}
	@Test
	void test_idade_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		////P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_idade.csv");
			
		});
//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		//P.Nome_Pacient
		
		
	}
	@Test
	void test_idade_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
	//	//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_idade.csv");
			
		});
		

		//P.Nome_Pacient
		
		
	} 
	@Test
	void test_idade_null() throws FileNotFoundException, IOException,Exception,java.lang.ArrayIndexOutOfBoundsException {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_idade.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_ok() throws  Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			System.out.println("DadosCLiente_Idade:"+P.getidade());	
			assertEquals(170,P.DadosFisicos.getAltura());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_Altura.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_Altura.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Altura_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_Altura.csv");
			
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_ok() throws Exception{
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(400,P.DadosFisicos.getPeso());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_Peso.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		////P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_Peso.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_Peso_null() throws FileNotFoundException, IOException,Exception {
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_Peso.csv");
			
		});
		
	}
	@Test
	void test_IMC_ok() throws Exception{
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(24,2,P.DadosFisicos.getIMC());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		
		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_Menor_IMC.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_Maior_IMC.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_IMC_null() throws FileNotFoundException, IOException,Exception {
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_IMC.csv");	
		});
		
		
	}
	@Test
	void test_bf_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(85,P.DadosFisicos.getB_F());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_bf_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_Menor_BF.csv");
			
		});

		//P.Nome_Pacient
		
		
	}@Test
	void test_bf_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_Maior_BF.csv");
			
		});

		//P.Nome_Pacient
		
		
	}@Test
	void test_bf_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_BF.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(75,P.DadosFisicos.getH20());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_h2o.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_h2o.csv");
			
		});
		//P.Nome_Pacient
		
		
	}
	@Test
	void test_h2o_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_h2o.csv");
			
		});

		//P.Nome_Pacient
		
		
	}	
	@Test
	void test_osso_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(1,P.DadosFisicos.getOsso());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient
		
		
	}	
	@Test
	void test_osso_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_Menor_Osso.csv");
			
		});

		//P.Nome_Pacient
		
		
	}
	@Test
	void test_osso_maior() throws FileNotFoundException, IOException,Exception, Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_Maior_Osso.csv");
			
		});

		//P.Nome_Pacient
		
		
	}	
	@Test
	void test_osso_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_Osso.csv");
			
		});

		//P.Nome_Pacient
		
		
	}	
	
	@Test
	void test_metabasal__ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(1.5,P.DadosFisicos.getMetabolismo_basal());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		//assertEquals(1.5,P.DadosFisicos.getMetabolismo_basal());

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_metabasal___menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_meta_basal.csv");
			
		});

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_metabasal___maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_meta_basal.csv");
			
		});
			
	

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_metabasal_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_meta_basal.csv");
			
		});
		//P.Nome_Pacient
	
		
	}
	@Test
	void test_idade_meta_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(30,P.DadosFisicos.getIdade_Metabolica());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient
	
		
	}
	@Test
	void test_idade_meta_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ExceptionError_Idade_meta.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_idade_meta.csv");
			
		});

		//P.Nome_Pacient
	
		
	}	
	@Test
	void test_idade_meta_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ExceptionError_Idade_meta.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_idade_meta.csv");
			
		});

		//P.Nome_Pacient
	
		
	}	
	@Test
	void test_idade_meta_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_idade_meta.csv");
			
		});

		//P.Nome_Pacient	
	}	
	@Test
	void test_gordura_visceral_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals(12,P.DadosFisicos.getGordura_Visceral());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient	
	}	
		
	@Test
	void test_gordura_visceral_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_gordura_visceral.csv");
			
		});

		//P.Nome_Pacient	
	}	
	@Test
	void test_gordura_visceral_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_gordura_visceral.csv");
			
		});

		//P.Nome_Pacient	
	}	
		
	@Test
	void test_gordura_visceral_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_gordura_visceral.csv");
			
		});

		//P.Nome_Pacient	
	}
	@Test
	void test_profissao_ok1() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals("Estudante",P.getprof());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		
		//P.Nome_Pacient	
	}	

	@Test
	void test_profissao_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_profissao.csv");
			
		});
		
		//P.Nome_Pacient	
	}	
		

	@Test
	void test_profissao_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_profissao.csv");
			
		});
		
		//P.Nome_Pacient	
	}	

	@Test
	void test_profissao_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_profissao.csv");
			
		});
		
		//P.Nome_Pacient	
	}	
	
	@Test
	void test_nome_ok() throws Exception{
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals("AndreAndre",P.getNome());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		
		
		//P.Nome_Pacient	
	}	
	@Test
	void test_nome_menor() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
	//	//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_Nome.csv");
			
		});
		
		//P.Nome_Pacient	
	}	
	@Test
	void test_nome_maior() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		////P=CSV.lerdadospaciente("D://Fichascsv//ficha_maior.csv");
		//System.out.println("DadosCLiente_NOME:"+P.getNome());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_maior_Nome.csv");
			
		});
		
		//P.Nome_Pacient	
	}	
	

	@Test
	void test_nome_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_Nome.csv");
			
		});
		
		//P.Nome_Pacient	
	}	

	@Test
	void test_sexo_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			assertEquals("Masculino",P.getsexo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	
		
		//P.Nome_Pacient	
	}	
	@Test
	void test_sexo_mal() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_menor.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(Exception .class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_menor_sexo.csv");
			
		});
		
		//P.Nome_Pacient	
	}
	@Test
	void test_sexo_null() throws FileNotFoundException, IOException,Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		//P=CSV.lerdadospaciente("D://Fichascsv//ficha_null.csv");
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		assertThrows(ArrayIndexOutOfBoundsException.class,()->{
			CSV.lerdadospaciente("D://Fichascsv//ficha_null_sexo.csv");
			
		});
		
		//P.Nome_Pacient	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////---------------------(--------/----------/---------/-------------)----------------------///////////////////////////////////////////////////
		
	@Test
	void test_IDNut_0_menor() throws FileNotFoundException {
		 Produto P=null;
		CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
		ArrayList<Produto> Prodrutos;
		assertThrows(ExceptionError1.class,()->{
			
		 CSV.lerdados("D://Fichascsv//ficha_menor_0.csv");
		

		
			
		});
		

		//P.Nome_Pacient	
	}	
	@Test
	void test_IDNut_1_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(ExceptionError2.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_1.csv");
			

			
				
			});
			

		
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient	
	}	
	
	@Test
	void test_IDNut_2_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_2.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}	
	
	
	@Test
	void test_IDNut_3_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_3.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}	
	
	@Test
	void test_IDNut_4_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_4.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_5_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_5.csv");
			

			
				
			});

		

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_6_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_6.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_7_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_7.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_8_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_8.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_9_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_9.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_10_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_5.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_11_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_11.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_12_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_12.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_13_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_13.csv");
			

			
				
			});
	}
		
	@Test
	void test_IDNut_14_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_14.csv");
			

			
				
			});
	}
	
	@Test
	void test_IDNut_15_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_15.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_16_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_16.csv");
			

			
				
			});
	}
	
	
	@Test
	void test_IDNut_17_menor() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_17.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_18_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_11.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_19_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_19.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_20_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_20.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_21_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_21.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_22_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_22.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_23_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_23.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_24_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_24.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_25_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_25.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_26_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_26.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_27_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_27.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_28_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_28.csv");
			

			
				
			});
		

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_29_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_29.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_30_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_30.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_31_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_31.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_32_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_11.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}

	@Test
	void test_IDNut_33_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_33.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_34_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_34.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_35_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_35.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_36_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_36.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
		
		
	@Test
	void test_IDNut_37_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_37.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	
	@Test
	void test_IDNut_38_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_38.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_39_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_39.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_40_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_40.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_41_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_41.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_42_menor() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_menor_42.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
		
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////---------------------(--------/----------/---------/-------------)----------------------///////////////////////////////////////////////////
	
	@Test
	void test_IDNut_0_null1() throws FileNotFoundException {
		 Produto P=null;
		CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
		ArrayList<Produto> Prodrutos;
		assertThrows(ExceptionError1.class,()->{
			
		 CSV.lerdados("D://Fichascsv//ficha_null_0.csv");
		

		
			
		});
		

		//P.Nome_Pacient	
	}	
	@Test
	void test_IDNut_1_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(ExceptionError2.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_1.csv");
			

			
				
			});
			

		
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient	
	}	
	
	@Test
	void test_IDNut_2_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_2.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}	
	
	
	@Test
	void test_IDNut_3_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_3.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}	
	
	@Test
	void test_IDNut_4_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_4.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_5_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_5.csv");
			

			
				
			});

		

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_6_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_6.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_7_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_7.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_8_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_8.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_9_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_9.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_10_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_5.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_11_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_11.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_12_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_12.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_13_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_13.csv");
			

			
				
			});
	}
		
	@Test
	void test_IDNut_14_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_14.csv");
			

			
				
			});
	}
	
	@Test
	void test_IDNut_15_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_15.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_16_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_16.csv");
			

			
				
			});
	}
	
	
	@Test
	void test_IDNut_17_null() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_17.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_18_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_11.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_19_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_19.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_20_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_20.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_21_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_21.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_22_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_22.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_23_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_23.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_24_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_24.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_25_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_25.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_26_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_26.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_27_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_27.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_28_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_28.csv");
			

			
				
			});
		

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_29_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_29.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_30_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_30.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_31_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_31.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_32_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_11.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}

	@Test
	void test_IDNut_33_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_33.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_34_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_34.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_35_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_35.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_36_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_36.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
		
		
	@Test
	void test_IDNut_37_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_37.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	
	@Test
	void test_IDNut_38_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_38.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_39_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_39.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_40_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_40.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_41_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_41.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_42_null() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_42.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}

	
	
	
	

	/////////////////////////////////////////////////////////////////////////////////////---------------------(--------/----------/---------/-------------)----------------------///////////////////////////////////////////////////
		
	@Test
	void test_IDNut_0_maior() throws FileNotFoundException {
		 Produto P=null;
		CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
		ArrayList<Produto> Prodrutos;
		assertThrows(ExceptionError1.class,()->{
			
		 CSV.lerdados("D://Fichascsv//ficha_maior_0.csv");
		

		
			
		});
		

		//P.Nome_Pacient	
	}	
	@Test
	void test_IDNut_1_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(ExceptionError2.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_null_1.csv");
			

			
				
			});
			

		
		//System.out.println("DadosCLiente_Idade:"+P.getidade());	
		

		//P.Nome_Pacient	
	}	
	
	@Test
	void test_IDNut_2_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_2.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}	
	
	
	@Test
	void test_IDNut_3_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_3.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}	
	
	@Test
	void test_IDNut_4_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_4.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_5_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_5.csv");
			

			
				
			});

		

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_6_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_6.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_7_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_7.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_8_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_8.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_9_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_9.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_10_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_5.csv");
			

			
				
			});



		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_11_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_11.csv");
			

			
				
			});


		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_12_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_12.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_13_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_13.csv");
			

			
				
			});
	}
		
	@Test
	void test_IDNut_14_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_14.csv");
			

			
				
			});
	}
	
	@Test
	void test_IDNut_15_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_15.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_16_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_16.csv");
			

			
				
			});
	}
	
	
	@Test
	void test_IDNut_17_maior() throws Exception {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_17.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_18_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_11.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_19_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_19.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_20_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_20.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_21_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_21.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_22_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_22.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_23_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_23.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_24_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_24.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_25_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_25.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_26_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_26.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_27_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_27.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_28_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_28.csv");
			

			
				
			});
		

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_29_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_29.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_30_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_30.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_31_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_31.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_32_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_11.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}

	@Test
	void test_IDNut_33_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_33.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_34_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_34.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	@Test
	void test_IDNut_35_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_35.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_36_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_36.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
		
		
	@Test
	void test_IDNut_37_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_37.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	
	
	@Test
	void test_IDNut_38_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_38.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_39_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_39.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
	@Test
	void test_IDNut_40_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_40.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_41_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_41.csv");
			

			
				
			});
		//P.Nome_Pacient	
	}
		
	@Test
	void test_IDNut_42_maior() throws Exception  {
		 Produto P=null;
			CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
			ArrayList<Produto> Prodrutos;
			assertThrows(Exception.class,()->{
				
			 CSV.lerdados("D://Fichascsv//ficha_maior_42.csv");
			

			
				
			});

		//P.Nome_Pacient	
	}
		
	
	
	
	

	
	
	
	
	
	
	
	
	
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	void test_NomePaciente_ok() throws Exception {
		Paciente P=null;
		CSVReaderdadosPacientes CSV = new CSVReaderdadosPacientes();
		try {
			P=CSV.lerdadospaciente("D://Fichascsv//ficha_ok.csv");
			System.out.println("DadosCLiente_Idade:"+P.getidade());	
			assertEquals("AndreAndre",P.getNome());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//P.Nome_Pacient
		
		
	} 
	
	
	
	
	


//---------------------------------------------------------------------------------NullNutrientesTestes-------------------------------------------------------------------------------------------------------------------------------
@Test
void test_IDNut_0_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		String Teste=P.id_prod;
		assertEquals(Teste,"IS019");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}	
@Test
void test_IDNut_1_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		String Teste=P.Nome;
		assertEquals(Teste,"Leite Cabra cru");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}	

@Test
void test_IDNut_2_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(2);
		assertEquals(69.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}	


@Test
void test_IDNut_3_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(3);
		assertEquals(290.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}	

@Test
void test_IDNut_4_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(4);
		assertEquals(86.90f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_5_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(5);
		assertEquals(3.80f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_6_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(6);
		assertEquals(4.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_7_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(7);
		assertEquals(4.60f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_8_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(8);
		assertEquals(4.80f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_9_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(9);
		assertEquals(4.60f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_10_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(10);
		assertEquals(0.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_11_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(11);
		assertEquals(0.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_12_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(12);
		assertEquals(0.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_13_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(13);
		assertEquals(0.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_14_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(14);
		assertEquals(0.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_15_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(15);
		assertEquals(2.60f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_16_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(16);
		assertEquals(1.10f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}


@Test
void test_IDNut_17_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(17);
		assertEquals(0.1f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_18_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(18);
		assertEquals(0.10f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_19_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(19);
		assertEquals(0.10f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_20_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(20);
		assertEquals(11.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_21_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(21);
		assertEquals(0.053f,Teste,0.001);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_22_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(21);
		assertEquals(0.053f,Teste,0.001);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_23_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(22);
		assertEquals(53.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_24_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(23);
		assertEquals(00.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_25_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(24);
		assertEquals(0.05f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_26_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(25);
		assertEquals(0.03f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_27_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(26);
		assertEquals(0.05f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_28_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(27);
		assertEquals(0.1f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_29_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(28);
		assertEquals(1.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_30_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(29);
		assertEquals(0.3f,Teste,0.3);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_31_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(30);
		assertEquals(0.70f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_32_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(31);
		assertEquals(0.04f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_33_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(32);
		assertEquals(0.08f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_34_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(33);
		assertEquals(3.00f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}

@Test
void test_IDNut_35_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(34);
		assertEquals(1.0f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_36_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(35);
		assertEquals(0.85f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
	
@Test
void test_IDNut_37_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(36);
		assertEquals(40.0,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}


@Test
void test_IDNut_38_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(37);
		assertEquals(181.0f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_39_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(38);
		assertEquals(153.0f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
@Test
void test_IDNut_40_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(39);
		assertEquals(120.0f,Teste,0.01);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_41_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(40);
		assertEquals(20.0f,Teste,0.01);
	} catch (IOException e) {
		// TODO Austo-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_42_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(41);
		assertEquals(0.2f,Teste,0.01);
	} catch (IOException e) {
		// TODO Austo-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	
@Test
void test_IDNut_43_ok() throws Exception  {
	 Produto P=null;
	CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
	ArrayList<Produto> Prodrutos;
	try {
		Prodrutos = CSV.lerdados("D://Fichascsv//ficha_nut_ok.csv");
		P=Prodrutos.get(0);
		Float Teste=P.Lista_calculofloat.get(42);
		assertEquals(0.3f,Teste,0.01);
	} catch (IOException e) {
		// TODO Austo-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	//P.Nome_Pacient	
}
	

@Test
void testPlanoAlimentar_TipoRefeição() throws Exception {
	
	
	
	try {
		CSVReaderLerdadosPlanoAlimentar CSV=new CSVReaderLerdadosPlanoAlimentar();
		Plano P = CSV.lerdados("D://Fichascsv//PlanoAlimentar.csv");
		P.Habitos.get(1).getTipo_Refeição();
		assertEquals(P.Habitos.get(1).getTipo_Refeição(),"Levantar");
	} catch (IOException e) {
		// TODO Austo-generated catch block
		e.printStackTrace();
	}
	//System.out.println("DadosCLiente_Idade:"+P.getidade());	
	

	
	
}








@Test
void test_IDNut_0_null() throws Exception  {
	 Produto P=null;
		CSVReaderLerdadosNut CSV = new CSVReaderLerdadosNut();
		ArrayList<Produto> Prodrutos;
		assertThrows(ExceptionError1.class,()->{
			
		 CSV.lerdados("D://Fichascsv//ficha_null_0.csv");
		

		
			
		});


} 
}








