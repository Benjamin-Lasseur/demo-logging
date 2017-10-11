package dev.console;

import dev.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * Instanciation de l'AppService
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implémentation Logback");
		new AppService().executer("valeur 1");

	}
}