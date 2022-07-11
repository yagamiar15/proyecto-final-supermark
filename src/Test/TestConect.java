package Test;

import Utilidad.conexion_BD;

public class TestConect {
	public static void main(String[] args) {
		conexion_BD cnn = new conexion_BD("root","","supermark");
		
		System.out.println(cnn.connect());
		cnn.disconnect();
	}
}