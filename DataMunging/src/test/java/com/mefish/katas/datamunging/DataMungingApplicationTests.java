package com.mefish.katas.datamunging;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataMungingApplicationTests {

	@Test
	public void contextLoads() {
		DataMungingApplication munge = new DataMungingApplication();
		assertTrue(munge.getConfigLoaded());
	}
	
	@Test(expected = IOException.class)
	public void IfFileNotFoundThrowsFileNotFoundException() throws IOException {
		DataMungingApplication munge = new DataMungingApplication();
		int day = munge.GetMinimumTempSpread();
	}
	
	@Test
	public void CanLoadFileInteractor() {
		DataMungingApplication munge = new DataMungingApplication();
		munge.OpenFile();
		assertTrue(munge.getIsFileOpen());
	}
}
