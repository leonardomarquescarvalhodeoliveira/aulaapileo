package br.com.leo.aulaapileo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaapileoApplication {

	//@Autowired
	//private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaapileoApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	
		
	}*/

}

