package guru.springframework.jokesapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesGenerator implements JokesGenerator {

	private ChuckNorrisQuotes generator;

	@Autowired
	public ChuckNorrisJokesGenerator(ChuckNorrisQuotes generator) {
		this.generator = generator;
	}

	@Override
	public String getJoke() {
		return generator.getRandomQuote();
	}

}
