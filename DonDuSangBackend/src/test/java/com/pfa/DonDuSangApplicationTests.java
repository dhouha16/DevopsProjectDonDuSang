package com.pfa;

import com.pfa.entitties.Personne;
import com.pfa.entitties.TypeSang;
import com.pfa.service.IPersonneService;
import com.pfa.service.impl.PersonneServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DonDuSangApplicationTests {

	@Autowired
	IPersonneService iPersonneService;
	@Test
	void contextLoads() {
	}

	@Test
	public void addPersonne() {
		Personne personne = new Personne(6492, "ben henda", "dhouha",
				new Date(), TypeSang.A ,"dhouha@gmail.com",
				"123", "58652874", "femme"
				);
		Personne personne1 = iPersonneService.addPersonne(personne);
		Assert.assertEquals(personne.getPrenom(), personne1.getPrenom());
	}
}
