package br.com.senac.delegates;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("receberMercadoriaDelegate")
public class ReceberMercadoriaDelegate implements JavaDelegate {
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("ReceberMercadoriaDelegate --");
	}
	
}
