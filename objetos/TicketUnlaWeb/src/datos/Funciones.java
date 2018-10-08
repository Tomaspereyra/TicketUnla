package datos;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Funciones {

	public static int traerAnio(GregorianCalendar f) {
		return f.get(Calendar.YEAR);
	}

	/*
	 * public static String traerFechaCorta ( GregorianCalendar f ){ String
	 * fechaCorta = "" ; // definir fecha corta dd/mm/aaaa delongitud=10 return
	 * fechaCorta; }
	 */

	public static boolean esBisiesto(int anio) {
		boolean bisiesto;
		if(anio%4==0  && (anio%100!=0 || anio%400==0)) {
			
			bisiesto = true;
		}
		else {
			bisiesto=false;
		}
		
		return bisiesto;
	}

	public static int traerMes(GregorianCalendar fecha) {
		return fecha.get(Calendar.MONTH);

	}

	public static int traerDia(GregorianCalendar fecha) {
		return fecha.get(Calendar.DAY_OF_MONTH);

	}

	public static boolean esFechaValida(int anio, int mes, int dia) {

		boolean fechavalida = true;

		switch (mes) {

		case 1:
			if (dia > 31)
				fechavalida = false;
			break;
		case 2:
			if (dia > 28 && !esBisiesto(anio))
				fechavalida = false;
			break;
		case 3:
			if (dia > 31)
				fechavalida = false;
			break;
		case 4:
			if (dia > 30)
				fechavalida = false;
			break;
		case 5:
			if (dia > 31)
				fechavalida = false;
			break;
		case 6:
			if (dia > 30)
				fechavalida = false;
			break;
		case 7:
			if (dia > 31)
				fechavalida = false;
			break;
		case 8:
			if (dia > 31)
				fechavalida = false;
			break;
		case 9:
			if (dia > 30)
				fechavalida = false;
			break;
		case 10:
			if (dia > 31)
				fechavalida = false;
			break;
		case 11:
			if (dia > 30)
				fechavalida = false;
			break;
		case 12:
			if (dia > 31)
				fechavalida = false;
			break;
		default:
			fechavalida = false;
		}
		return fechavalida;
	}
public static GregorianCalendar traerFecha(int anio,int mes,int dia) {
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(esFechaValida(anio,mes,dia)) {
		resultado.set(anio, mes, dia);
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		
		return resultado;
		
	}
	public static GregorianCalendar traerFecha(int anio, int mes, int dia,
			int hora, int minutos) {
		GregorianCalendar resultado = new GregorianCalendar();
		if (esFechaValida(anio, mes, dia)) {
			resultado.set(anio, mes , dia, hora, minutos); /*
															 * le pongo -1 al
															 * mes porque
															 * gregoriancalendar
															 * comienza en 0 y
															 * termina en 11
															 */
			resultado.setTime(resultado.getTime()); /*
													 * setea el resto de valores
													 * pasandole una fecha
													 */

		} else {
			resultado = null;
		}

		return resultado;
	}

	public static GregorianCalendar traerFecha(String fecha) {

		GregorianCalendar resultado = new GregorianCalendar();
		if (fecha.length() == 10) {
			String dia = fecha.substring(0, 2);
			String mes = fecha.substring(3, 5);
			String anio = fecha.substring(6, 10);

			resultado.set(Integer.parseInt(anio), Integer.parseInt(mes) - 1,
					Integer.parseInt(dia)); // paso de string a int
			resultado.setTime(resultado.getTime());
		} else {
			resultado = null;
		}
		return resultado;
	}

	public static String traerFechaCorta(GregorianCalendar fecha) {
		return (String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)) + "/"
				+ String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/" + String
					.valueOf(fecha.get(Calendar.YEAR)));

	}

	public static String traerFechaCortaHora(GregorianCalendar fecha) {
		return (String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)) + "/"
				+ String.valueOf(fecha.get(Calendar.MONTH) + 1) + "/"
				+ String.valueOf(fecha.get(Calendar.YEAR)) + "  "
				+ String.valueOf(fecha.get(Calendar.HOUR_OF_DAY)) + "." + String
					.valueOf(fecha.get(Calendar.MINUTE) + "."
							+ String.valueOf(fecha.get(Calendar.SECOND))));

	}

	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha,
			int cantDias) {
		GregorianCalendar resultado = new GregorianCalendar();
		resultado.add(Calendar.DAY_OF_YEAR, cantDias);
		return resultado;
	}

	public static boolean esDiaHabil(GregorianCalendar fecha) {
		boolean esDiaHabil = true; /* elegir maxima probabilidad */
		if (!(fecha.get(Calendar.DAY_OF_WEEK) >= 2 && fecha
				.get(Calendar.DAY_OF_WEEK) <= 6)) {
			esDiaHabil = false;
		}
		return esDiaHabil;
	}

	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {

		String resultado = new String();
		int dia = fecha.get(Calendar.DAY_OF_WEEK);
		switch (dia) {

		case 1:
			resultado = "Domingo";
			break;
		case 2:
			resultado = "Lunes";
			break;
		case 3:
			resultado = "Martes";
			break;
		case 4:
			resultado = "Miercoles";
			break;
		case 5:
			resultado = "Jueves";
			break;
		case 6:
			resultado = "Viernes";
			break;
		case 7:
			resultado = "Sabado";
			break;

		}

		return resultado;
	}

	public static String traerMesEnLetras(GregorianCalendar fecha) {
		String resultado = new String();
		int mes = fecha.get(Calendar.MONTH);
		switch (mes) {

		case 0:
			resultado = "Enero";
			break;
		case 1:
			resultado = "Febrero";
			break;
		case 2:
			resultado = "Marzo";
			break;
		case 3:
			resultado = "Abril";
			break;
		case 4:
			resultado = "Mayo";
			break;
		case 5:
			resultado = "Junio";
			break;
		case 6:
			resultado = "Julio";
			break;
		case 7:
			resultado = "Agosto";
			break;
		case 8:
			resultado = "Septiempre";
			break;
		case 9:
			resultado = "Octubre";
			break;
		case 10:
			resultado = "Noviembre";
			break;
		case 11:
			resultado = "Diciembre";
			break;
		}

		return resultado;
	}

	public static String traerFechaLarga(GregorianCalendar fecha) {

		return ((String.valueOf(Funciones.traerDiaDeLaSemana(fecha)) + " de " + (String
				.valueOf(fecha.get(Calendar.DAY_OF_WEEK))
				+ " "
				+ (String.valueOf(Funciones.traerMesEnLetras(fecha))) + " del " + (String
					.valueOf(fecha.get(Calendar.YEAR))))));

	}

	public static boolean sonFechasIguales(GregorianCalendar fecha,
			GregorianCalendar fecha1) {
		return (!(Funciones.traerAnio(fecha) == Funciones.traerAnio(fecha1))
				&& (Funciones.traerMes(fecha) == Funciones.traerMes(fecha1)) && (Funciones
					.traerDia(fecha) == Funciones.traerDia(fecha1)));
	}

	public static boolean sonFechasHorasIguales(GregorianCalendar fecha,
			GregorianCalendar fecha1) {
		boolean sonFechasHorasIguales = true;
		if (!(Funciones.traerAnio(fecha) == Funciones.traerAnio(fecha1))
				&& (Funciones.traerMes(fecha) == Funciones.traerMes(fecha1))
				&& (Funciones.traerDia(fecha) == Funciones.traerDia(fecha1))
				&& (Funciones.traerFechaCortaHora(fecha) == Funciones
						.traerFechaCortaHora(fecha1))) {
			sonFechasHorasIguales = false;
		}
		return sonFechasHorasIguales;
	}

	public static int traerCantDiasDeUnMes(int anio, int mes) {
		int resultado = 0;
		switch (mes) {

		case 1:
			resultado = 31;
		case 2:
			if (esBisiesto(anio))
				resultado = 29;
			else
				resultado = 28;
			break;
		case 3:
			resultado = 31;
		case 4:
			resultado = 30;
		case 5:
			resultado = 31;
		case 6:
			resultado = 30;
		case 7:
			resultado = 31;
		case 8:
			resultado = 31;
		case 9:
			resultado = 30;
		case 10:
			resultado = 31;
		case 11:
			resultado = 30;
		case 12:
			resultado = 31;
		}

		return resultado;
	}

	public static double aproximar2Decimales(double valor) {
		return Math.rint(valor * 100) / 100;
	}

	public static boolean esNumero(char c) {
		boolean esNumero = true;
		if (!(Character.isDigit(c)))
			esNumero = false;
		return esNumero;
	}

	public static boolean esLetra(char c) {
		boolean esLetra = false;
		if (!(Character.isDigit(c)))
			esLetra = true;
		return esLetra;
	}

	public static boolean esCadenaNros(String cadena) {
		boolean esCadenaNros = true;

		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isDigit(c) == false) {
				esCadenaNros = false;
			}
		}

		return esCadenaNros;
	}

	public static boolean esCadenaLetras(String cadena) {
		boolean esCadenaLetras = true;

		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isLetter(c) == false) {
				esCadenaLetras = false;
			}
		}

		return esCadenaLetras;
	}

	public static double convertirADouble(int n) {
		return ((double) n);
	}

}