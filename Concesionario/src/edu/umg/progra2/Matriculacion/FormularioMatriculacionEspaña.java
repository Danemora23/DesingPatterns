package edu.umg.progra2.Matriculacion;

public class FormularioMatriculacionEspaņa extends FormularioMatriculacion{

	public FormularioMatriculacionEspaņa(FormularioImpl implementacion) {
		super(implementacion);
		// TODO Auto-generated constructor stub
		

	}
	protected boolean controlZona(String matriculacion) {
		// TODO Auto-generated method stub
		return matriculacion.length() ==7;
	}
}
