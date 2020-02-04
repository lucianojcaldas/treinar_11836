package br.com.dvl.escutafone;

import java.io.IOException;

public class principal {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		leocotronPorta porta = new leocotronPorta();
		porta.iniciar();
	}

}
