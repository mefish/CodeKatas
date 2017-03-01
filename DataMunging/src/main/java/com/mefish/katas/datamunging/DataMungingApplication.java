package com.mefish.katas.datamunging;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataMungingApplication {

	private DataMungingConfig mungeConfig;
	public DataMungingApplication() {
		mungeConfig = new DataMungingConfig();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DataMungingApplication.class, args);
	}
	
	public boolean getConfigLoaded() {
		return mungeConfig != null;
	}
	
	public int GetMinimumTempSpread() throws IOException {
		throw new IOException();
	}
}
