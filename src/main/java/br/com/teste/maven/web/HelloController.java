package br.com.teste.maven.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.core.loader.Application;
import br.com.teste.maven.dto.HelloDTO;
import br.com.teste.maven.dto.TesteEnumJsonFormat;
import br.com.teste.model.PessoaEntity;
import br.com.teste.repository.PessoaRepositoty;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	private PessoaRepositoty pessoaRepositoty;
	
	public PessoaRepositoty getPessoaRepositoty() {
		if (pessoaRepositoty == null) {
			pessoaRepositoty = Application.getSingleton(PessoaRepositoty.class);
		}
		return pessoaRepositoty;
	}

    @GetMapping(path = "/hello")
    public PessoaEntity hello() {
    	
    	PessoaEntity pessoa = new PessoaEntity();
    	
    	pessoa.setCnpj("95815776000120");
    	pessoa.setCpf("08479512358");
    	pessoa.setFone("47994506987");
    	pessoa.setNome("teste");
    	
    	return pessoa;
    	
//    	HelloDTO teste = new HelloDTO();
//    	teste.setMessage("teste");
//    	teste.setTesteTipoJson(TesteEnumJsonFormat.TESTE2);
//    	teste.setCep("89037852");
//    	teste.setCnpj("95836771000120");
//    	teste.setCpf("08695478924");
//    	teste.setFone("47995410589");
//    	return teste;
    }
}
