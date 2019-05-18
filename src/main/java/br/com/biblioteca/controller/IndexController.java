package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.biblioteca.service.PessoaService;
import br.com.biblioteca.vo.Pessoa;

@Controller
public class IndexController {
	
	private PessoaService pessoaService;

	@RequestMapping("/index")
	String home() {
		return "index";
	}
	
	@Autowired(required=true)
	@Qualifier(value="pessoaService")
	public void setPessoaService(PessoaService ps){
		this.pessoaService = ps;
	}
	
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Pessoa());
		model.addAttribute("listPersons", this.pessoaService.listPessoas());
		return "person";
	}
	
}
