package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

	/**
	 * Méthode execute
	 * 
	 * @param param
	 */
	public void executer(String param) {
		LOG.debug("Traitement 1 : param = {}", param);
	}
}