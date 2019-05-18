package br.com.biblioteca.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.dao.PessoaDAO;
import br.com.biblioteca.vo.Pessoa;

@Service
public class PessoaService {

	@Autowired(required=true)
	private PessoaDAO pessoaDAO;

	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}
	
	@Transactional
	public void addPessoa(Pessoa p) {
		this.pessoaDAO.addPessoa(p);
	}

	@Transactional
	public void updatePessoa(Pessoa p) {
		this.pessoaDAO.updatePessoa(p);
	}

	@Transactional
	public List<Pessoa> listPessoas() {
		return this.pessoaDAO.listPessoas();
	}
}
