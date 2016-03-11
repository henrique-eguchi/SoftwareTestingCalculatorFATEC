package br.fatec.servico;

public class Calculadora {
	public int soma(String parcelas)
	{
		int resultado = 0;
		
		String[] vetorDeNumeros = parcelas.split(",");
		
		for(String numero : vetorDeNumeros)
		{
			resultado += Integer.parseInt(numero);
		}
		
		return resultado;
	}
}
