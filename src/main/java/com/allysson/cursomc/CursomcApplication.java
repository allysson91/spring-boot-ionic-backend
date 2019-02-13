package com.allysson.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allysson.cursomc.domain.Categoria;
import com.allysson.cursomc.domain.Cidade;
import com.allysson.cursomc.domain.Cliente;
import com.allysson.cursomc.domain.Endereco;
import com.allysson.cursomc.domain.Estado;
import com.allysson.cursomc.domain.ItemPedido;
import com.allysson.cursomc.domain.Pagamento;
import com.allysson.cursomc.domain.PagamentoComBoleto;
import com.allysson.cursomc.domain.PagamentoComCartao;
import com.allysson.cursomc.domain.Pedido;
import com.allysson.cursomc.domain.Produto;
import com.allysson.cursomc.domain.enums.EstadoPagamento;
import com.allysson.cursomc.domain.enums.TipoCliente;
import com.allysson.cursomc.repositories.CategoriaRepository;
import com.allysson.cursomc.repositories.CidadeRepository;
import com.allysson.cursomc.repositories.ClienteRepository;
import com.allysson.cursomc.repositories.EnderecoRepository;
import com.allysson.cursomc.repositories.EstadoRepository;
import com.allysson.cursomc.repositories.ItemPedidoRepository;
import com.allysson.cursomc.repositories.PagamentoRepository;
import com.allysson.cursomc.repositories.PedidoRepository;
import com.allysson.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
