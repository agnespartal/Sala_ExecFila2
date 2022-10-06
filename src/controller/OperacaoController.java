package controller;

import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	public void caixa(Fila f) throws Exception {
			
		for (int i = 0; i < 20; i++) {
		Cliente c = (Cliente) f.remove();
		float res = c.qtdPecas * c.valorPecas;
		String valor = new DecimalFormat("####.00").format(res);
		System.out.println("Nome do Cliente: "+c.nome+"\nValor da compra: "+valor);
		}
	}
}
