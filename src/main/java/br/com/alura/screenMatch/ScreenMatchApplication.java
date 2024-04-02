package br.com.alura.screenMatch;

import br.com.alura.screenMatch.model.DadosSerie;
import br.com.alura.screenMatch.service.ConsumoApi;
import br.com.alura.screenMatch.service.ConvertDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConsumoApi consumo = new ConsumoApi();

		var json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=f871336f");
		System.out.println(json);

		ConvertDados conversor =  new ConvertDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
