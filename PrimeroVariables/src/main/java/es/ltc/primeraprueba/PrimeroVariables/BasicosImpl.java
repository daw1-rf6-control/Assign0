package es.ltc.primeraprueba.PrimeroVariables;
/**
 * Primeros ejercicios de manejo de variables y operadores
 * @author Leticia
 *
 */
public class BasicosImpl implements Basicos {

	@Override
	public boolean esPar(int y) {
		
		return (y%2)==0;
	}

	@Override
	public boolean esImpar(int y) {
		
		return (y%2)!=0;
	}
	

}
