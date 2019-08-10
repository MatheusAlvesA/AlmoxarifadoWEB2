import java.math.BigDecimal;

import br.RH.PessoaJuridica;
import br.estoque.EntradaEstoque;
import br.estoque.Estoque;
import br.estoque.MovimentacaoEstoque;
import br.estoque.NotaFiscal;
import br.estoque.StatusMovimentacao;
import br.estoque.TipoEntrada;
import br.estoque.TipoMovimentacao;

public class App {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		MovimentacaoEstoque movimentacao = new MovimentacaoEstoque();
		EntradaEstoque entrada = new EntradaEstoque();
		
		NotaFiscal nota = new NotaFiscal();
		nota.setNumeroNF(50);
		nota.setTransportadora(new PessoaJuridica());
		entrada.setNotaFiscal(nota);
		entrada.setTipoEntrada(TipoEntrada.ENTRADA_AVULSA);
		entrada.setStatus(StatusMovimentacao.ABERTA);
		entrada.setCodigo("BCZN");
		
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setResponsavel("Matheus Alves");
		estoque.addMovimentacao(movimentacao);
		estoque.setQtdDecimal(new BigDecimal(42));
		
		System.out.println(estoque.toString());
		System.out.println("---");
		System.out.println(entrada.toString());
		
	}

}
