import com.fatec.e2.model.*;

public class ModelTest {

    private int totalTest = 0;
    private int errorTest = 0;
    private int passedTest = 0;
	
	class Posicao {
		public int valor;
		public Posicao(int valor) {this.valor = valor;}
	}

    public static void main(String[] args) {
        ModelTest m = new ModelTest();
        m.testAll();
    }

    public void testAll() {
        Object[] array = new Object[30];
		Posicao pos = new Posicao(0);
        testFivePessoa(array, pos);
        testFiveProfissional(array, pos);
        testFiveLugar(array, pos);
        testFiveAlunoFatecSJC(array, pos);
        testFiveInstrumentoMusical(array, pos);
		testFiveCalcado(array, pos);
        testIfArrayHaveFiveObjectsOfAnyClasses(array);
        finalizeTests();
    }

    public void finalizeTests() {
        System.out.println("\n\t" + totalTest + " testes realizados, "
                + passedTest + " testes aprovados e "
                + errorTest + " testes reprovados.");
    }


    public void checkTest(boolean testPassed) {
        totalTest++;
        if (!testPassed) {
            System.out.println("Failed Test");
            errorTest++;
        } else {
            passedTest++;
        }
    }

    public static <T> void test(T expected, T actual) throws Exception {
        if (expected == null || actual == null) {
            throw new Exception("Está nulo");
        } else if (!expected.equals(actual)) {
            throw new Exception("Não são iguais");
        }
    }

    public void testFivePessoa(Object[] array, Posicao pos) {
        int n = pos.valor + 5;
        System.out.println("TEST: testPessoa()");
        for (; pos.valor < n && pos.valor < array.length; ++pos.valor) {
            array[pos.valor] = new Pessoa();
            testPessoa((Pessoa)array[pos.valor]);
        }
    }

    public void testPessoa(Pessoa p) {
        boolean passed = false;
        p.setAge(0);
        p.setName("AAA");
        p.setGender("female");
        p.setNaturalidade("brasileiro");
        p.setEndereco(new Lugar());

        try {
            test(0, p.getAge());
            test("AAA", p.getName());
            test("female", p.getGender());
            test("brasileiro", p.getNaturalidade());
            test(false, p.hateForeigners());
            test("To be or not to be, that's the question!", p.reason());
            test("hello dear friend!", p.talk());
            passed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        checkTest(passed);
    }

    public void testFiveProfissional(Object[] array, Posicao pos) {
        int n = pos.valor + 5;
        System.out.println("TEST: testProfissional()");
        for (; pos.valor < n && pos.valor < array.length; ++pos.valor) {
            array[pos.valor] = new Profissional();
            // Como profissional é Pessoa
            testPessoa((Pessoa)array[pos.valor]);
            testProfissional((Profissional)array[pos.valor]);
        }
    }

    public void testProfissional(Profissional p) {
        boolean passed = false;
        p.setArea("Developer");
        p.setCtps("1245aa");
        p.setDegree("bacharel");
        p.setEmployed(true);
        p.setHaveXP(false);

        try {
            test("Developer", p.getArea());
            test("1245aa", p.getCtps());
            test("bacharel", p.getDegree());
            test(true, p.getEmployed());
            test(false, p.getHaveXP());
            test("I'm really doing stuff, do not bother!!", p.toWork());
            test("I'm fine bro!", p.vacation());
            test(2500.32, p.bePaid());
            passed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        checkTest(passed);
    }

    public void testFiveLugar(Object[] array, Posicao pos) {
        int n = pos.valor + 5;
        System.out.println("TEST: testLugar()");
        for (; pos.valor < n && pos.valor < array.length; ++pos.valor) {
            array[pos.valor] = new Lugar();
            testLugar((Lugar)array[pos.valor]);
        }
    }

    public void testLugar(Lugar l) {
        boolean passed = false;
        l.setRua("José Otávio de Macedo");
        l.setNumero("615ab");
        l.setBairro("panorama");
        l.setCidade("cacapava");
        l.setUf("sp");
        l.setCep("12289456");

        try {
            test("615ab", l.getNumero());
            test("José Otávio de Macedo", l.getRua());
            test("panorama", l.getBairro());
            test("cacapava", l.getCidade());
            test("sp", l.getUf());
            test("12289456", l.getCep());
            test("Hello, i'm in cacapava", l.imHere());
            test("Moro aqui, em cacapava", l.moroAqui());
            passed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        checkTest(passed);
    }
	
	public void testFiveAlunoFatecSJC(Object[] array, Posicao pos) {
		int n = pos.valor + 5;
        System.out.println("TEST: testAlunoFatecSJC()");
        for (; pos.valor< n && pos.valor < array.length; ++pos.valor) {
            array[pos.valor] = new AlunoFatecSJC();
            // como aluno também é pessoa
            testPessoa((Pessoa) array[pos.valor]);
            testAlunoFatecSJC((AlunoFatecSJC) array[pos.valor]);
        }
	}
	
	public void testAlunoFatecSJC(AlunoFatecSJC alu) {
		boolean passed = false;
		alu.setRa("ABC123456");
		alu.setSemestreAtual(4);
		alu.setMediaNota(8.5);
		try {
            test("ABC123456", alu.getRa());
            test(4, alu.getSemestreAtual());
            alu.passaDeSemestre();
            test(5, alu.getSemestreAtual());
            test(8.5, alu.getMediaNota());
            alu.calculaMedia(10.0, 10.0, 10.0, 10.0);
            test(10.0, alu.getMediaNota());
            test("Moço, posso pagar meia? Sou estudante!!", alu.pedeDescontoNoCinema());
            passed = true;
        } catch (Exception e) {
		    e.printStackTrace();
        }
		checkTest(passed);
	}
	
	public void testFiveInstrumentoMusical(Object[] array, Posicao pos) {
		int n = pos.valor + 5;
        System.out.println("TEST: testInstrumentoMusical()");
		for (; pos.valor < n; ++pos.valor) {
			array[pos.valor] = new InstrumentoMusical();
			testInstrumentoMusical((InstrumentoMusical) array[pos.valor]);
		}
	}
	
	public void testInstrumentoMusical(InstrumentoMusical ins) {
		boolean passed = false;
		ins.setAfinacao("E A D G B E");
        ins.setPossuiCordas(true);
        ins.setTipo("violao");

        try {
            test("E A D G B E", ins.getAfinacao());
            test(true, ins.isPossuiCordas());
            test("violao", ins.getTipo());
            test("Estou tocando uma... música po", ins.tocar());
            test("Parei de Tocar!", ins.parar());
            test("Ah não, vai que eu toco denovo!", ins.guardar());
            passed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
		checkTest(passed);
	}
	
	public void testFiveCalcado(Object[] array, Posicao pos) {
		int n = pos.valor + 5;
        System.out.println("TEST: testCalcado()");
		for (; pos.valor < n; ++pos.valor) {
			array[pos.valor] = new Calcado();
			testCalcado((Calcado) array[pos.valor]);
		}
	}
	
	public void testCalcado(Calcado cal) {
		boolean passed = false;
		cal.setMarca("nike");
		cal.setMaterial("borracha");
		cal.setModelo("air");
		cal.setPreco(100.0);
		cal.setTamanho(42);

		try {
		    test("nike", cal.getMarca());
		    test("borracha", cal.getMaterial());
		    test("air", cal.getModelo());
		    test(100.0, cal.getPreco());
		    test(42, cal.getTamanho());
		    test("Estou andando no meu nike", cal.andar());
		    test(true, cal.podeCorrer());
		    test("Estou correndo no meu nike", cal.correr());
		    cal.setMarca("adidas");
            test("Estou andando no meu adidas", cal.andar());
            test(true, cal.podeCorrer());
            test("Estou correndo no meu adidas", cal.correr());
            cal.setMarca("converse");
            test("Estou andando no meu converse", cal.andar());
            test(false, cal.podeCorrer());
            test("Estou andando no meu converse", cal.andar());
            passed = true;
        } catch (Exception e) {
		    e.printStackTrace();
        }
		checkTest(passed);
	}

    public void testIfArrayHaveFiveObjectsOfAnyClasses(Object[] array) {
        int pes = 0, pro = 0, lug = 0, cal = 0, ins = 0, alu = 0;
        boolean passed = false;
        System.out.println("TEST: testIfArrayHaveFiveObjectsOfAnyClasses()");
        for (Object o : array) {
            switch (o.getClass().getName()) {
                case "com.fatec.e2.model.Pessoa": ++pes; break;
                case "com.fatec.e2.model.Profissional": ++pro; break;
                case "com.fatec.e2.model.Lugar": ++lug; break;
                case "com.fatec.e2.model.Calcado": ++cal; break;
                case "com.fatec.e2.model.AlunoFatecSJC": ++alu; break;
                case "com.fatec.e2.model.InstrumentoMusical": ++ins; break;
            }
            if ((pes + pro + lug + cal + alu + ins) == array.length) {
                passed = true;
            }
        }
        checkTest(passed);
    }
}
