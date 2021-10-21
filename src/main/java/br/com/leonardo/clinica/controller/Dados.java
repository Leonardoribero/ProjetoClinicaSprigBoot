package br.com.leonardo.clinica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
/*
 * Em nosso projeto iremos utilizar anotações ( Annotations que 
 * são elementos de tipificarão de codigo, ou seja, são aplicações que 
 * fazemos no codigo para informar o que aquela linha ou grupo de comando 
 * deve fazer e como deve ser entendido 
 * no caso abaixo, estamos dizendo que nossa classe Dados é um controlador 
 * de fluxo que receberá em Rest Responderá dados no formato 
 * Rest
*/



	
    public class Dados {


	@ GetMapping
   public String inicial () {
      return "Olá!voce está na pagina incial do projeto";
	}
	public  List() <Cliente> clientes{
		List  <Cliente> lts = new ArrayList<Cliente>();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		

	c1.seteNome("Claudio");
	c2.seteNome("rodrigo");
	
	lst.add (c1);
	lst.add(c2);
	return lst;
	}
	
    @GetMapping ("/cliente")
	   public list<Cliente> cliente  () {
	      return "heloisa Nascimento";
    } 
   @GetMapping ("/clientes")
   public String clientes( ) { 
      return "barbara e Angelica";
 }
 public String ("/cadastro)
	 return "cadastro realizado";
 

  public String atualizar ()
    return "Dados atualizados";
  public String apagar ("/apagar") 
}

