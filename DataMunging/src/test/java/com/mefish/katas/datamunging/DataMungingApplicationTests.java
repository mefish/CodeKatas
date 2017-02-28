package com.mefish.katas.datamunging;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataMungingApplicationTests {

	@Test
	public void contextLoads() {
		DataMungingApplication munge = new DataMungingApplication();
		assertNotNull(munge);
	}

}
