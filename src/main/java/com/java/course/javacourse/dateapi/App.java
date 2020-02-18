package com.java.course.javacourse.dateapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class App {

	public void verificar(int version) {

		if (version == 7) {
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();

			date1.set(1991, 0, 21);
			System.out.println(date1.after(date2));
		} else if (version == 8) {

			System.out.println("****Using LocalDate****");

			LocalDate date1 = LocalDate.of(1991, 01, 21);
			LocalDate date2 = LocalDate.now();

			System.out.println(date1.isAfter(date2));
			System.out.println(date1.isBefore(date2));

			System.out.println("****Using LocalTime****");

			LocalTime time1 = LocalTime.of(22, 30, 50);
			LocalTime time2 = LocalTime.now();

			System.out.println(time1.isAfter(time2));
			System.out.println(time1.isBefore(time2));

			System.out.println("****Using LocalDateTime****");

			LocalDateTime datetime1 = LocalDateTime.of(1991, 1, 21, 22, 30, 50);
			LocalDateTime datetime2 = LocalDateTime.now();

			System.out.println(datetime1.isAfter(datetime2));
			System.out.println(datetime1.isBefore(datetime2));

		}

	}

	// currentTimeMillis
	public void medirTime(int version) throws InterruptedException {
		if (version == 7) {
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} else if (version == 8) {
			Instant start = Instant.now();
			Thread.sleep(1000);
			Instant end = Instant.now();
			System.out.println(Duration.between(start, end).toMillis());

		}
	}

	public void periodoEntreFechas(int version) {

		if (version == 7) {
			Calendar nacimiento = Calendar.getInstance();
			Calendar actual = Calendar.getInstance();

			nacimiento.set(1991, 0, 21);
			actual.set(2017, 1, 04);

			int years = 0;

			while (nacimiento.before(actual)) {
				nacimiento.add(Calendar.YEAR, 1);
				if (nacimiento.before(actual))
					years++;
			}

			System.out.println("Years: " + years);

		} else if (version == 8) {
			LocalDate nacimiento = LocalDate.of(1992, 9, 12);
			LocalDate actual = LocalDate.now();

			Period period = Period.between(nacimiento, actual);
			System.out.println("Han Transcurrido " + period.getYears() + " years " + period.getDays() + " days "
					+ period.getMonths() + " Months");

		}

	}
	
	public void converter (int version) throws ParseException{
		if(version == 7) {
			String fecha = "21/01/1991";
			DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida =  formateador.parse(fecha);
			System.out.println(fechaConvertida);
			
			Date fechaActual = Calendar.getInstance().getTime();
			formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
			String fechaCadena = formateador.format(fechaActual);
			System.out.println(fechaCadena);
		}else if ( version == 8) {
			String fecha = "21/01/1991";
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
			System.out.println(fechaLocal);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app = new App();

		try {
//			app.verificar(8);
//			app.medirTime(8);
//			app.periodoEntreFechas(8);
			app.converter(8);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
