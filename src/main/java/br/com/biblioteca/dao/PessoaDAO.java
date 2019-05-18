package br.com.biblioteca.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import br.com.biblioteca.vo.Pessoa;

@Repository
public class PessoaDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addPessoa(Pessoa p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		System.out.println("Pessoa saved successfully, Pessoa Details="+p);
	}

	public void updatePessoa(Pessoa p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		System.out.println("Pessoa updated successfully, Pessoa Details="+p);
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> listPessoas() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Pessoa> PessoasList = session.createQuery("from Pessoa").list();
		for(Pessoa p : PessoasList){
			System.out.println("Pessoa List::"+p);
		}
		return PessoasList;
	}
}
