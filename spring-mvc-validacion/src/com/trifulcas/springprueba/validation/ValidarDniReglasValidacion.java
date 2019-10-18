package com.trifulcas.springprueba.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarDniReglasValidacion implements ConstraintValidator<ValidarDni, String> {

	@Override
	public void initialize(ValidarDni dni) {
	}

	@Override
	public boolean isValid(String dni, ConstraintValidatorContext cxt) {
		boolean valido = false;
		char[] letraDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		Pattern pat = Pattern.compile("[0-9]{7,8}[A-Za-z]");
		Matcher mat = pat.matcher(dni);
		if (mat.matches()) {
			char letra = Character.toUpperCase(dni.charAt(8));
			int numdni = Integer.parseInt(dni.substring(0, 8));
			valido = letra == letraDni[numdni % 23];
		}

		return valido;
	}

}