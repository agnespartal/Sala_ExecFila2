package view;

import br.edu.fateczl.filaobj.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) throws Exception{
		
		Fila f = new Fila();
		
		for (int i = 1; i < 21; i++) {
		Cliente c1 = new Cliente();
		c1.nome = "Cliente"+ i;
		c1.qtdPecas = (int)((Math.random()*31)+20);
		c1.valorPecas = (float)((Math.random()*11)+5);
		f.insert(c1);
		}
		
		OperacaoController op = new OperacaoController();
		op.caixa(f);
	}

}
