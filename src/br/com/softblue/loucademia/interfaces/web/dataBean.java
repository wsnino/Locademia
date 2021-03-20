package br.com.softblue.loucademia.interfaces.web;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.domain.aluno.Aluno.Sexo;

@Named
@ApplicationScoped
public class dataBean implements Serializable {

	public Sexo[] getSexos() {
		return Sexo.values();				
	}
}
