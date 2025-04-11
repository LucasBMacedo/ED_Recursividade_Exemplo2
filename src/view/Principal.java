package view;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		int dividendo = 19;
		int divisor = 4;
		int div = dc.div(dividendo, divisor);
		System.out.println(div);
	}
}