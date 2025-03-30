package atividades;


import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;


public class Atividade1 {


	public static String obterDataAleatoriaPorExtenso() {
        Random random = new Random();
        int ano = random.nextInt(2024 - 1900) + 1900;
        int mes = random.nextInt(12) + 1; 
        int dia = random.nextInt(28) + 1; 
        LocalDate dataAleatoria = LocalDate.of(ano, mes, dia);
        int diaInt = dataAleatoria.getDayOfMonth();
        int mesInt = dataAleatoria.getMonthValue();
        String diaExtenso = obterDiaPorExtenso(diaInt);
        String mesExtenso = obterMesPorExtenso(mesInt);
        return diaExtenso + " de " + mesExtenso + " de " + ano;
    }
    private static String obterDiaPorExtenso(int dia) {
        return String.valueOf(dia);
    }
    private static String obterMesPorExtenso(int mes) {
        return LocalDate.of(2023, mes, 1).getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
    }
    public static void main(String[] args) {
        String dataAleatoriaPorExtenso = obterDataAleatoriaPorExtenso();
        System.out.println("Data: " + dataAleatoriaPorExtenso);
    }
}
