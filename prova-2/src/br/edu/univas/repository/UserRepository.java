package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.User;

public class UserRepository {

	private DatabaseConfiguration databaseConfiguration;

	@SuppressWarnings("static-access")
	public UserRepository() {
		databaseConfiguration = databaseConfiguration.getInstance();
	}

	public void insert(User user) {
		//proceed with insert object in database
	}
	
	public DatabaseConfiguration getDatabaseConfiguration() {
		return databaseConfiguration;
	}
}
