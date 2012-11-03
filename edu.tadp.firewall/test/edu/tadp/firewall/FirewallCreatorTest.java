package edu.tadp.firewall;

import org.junit.Test;

import ar.edu.tadp.firewall.Firewall;

public class FirewallCreatorTest {
	
	@Test
	public void testCreateFirewall() {
		Firewall aFirewall = FirewallCreator.createFirewall("aFirewall.firewall");
		
		aFirewall.toString();
	}

}
