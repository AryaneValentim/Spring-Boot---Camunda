package br.com.senac.delegates;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("cadastroAprovadoDelegate")
public class CadastroAprovadoDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("CadastroAprovadoDelegate --");
		
		//retorna um objeto
		Integer parametro = (Integer)execution.getVariable("outroParametro");
		System.out.println("CadastroAprovadoDelegate Param--" + parametro);
	}
	
}
