package atividades;


import java.time.LocalDate;
import java.time.Period;
import java.util.Random;


public class Atividade2 {


	public static void contaTempo(int dia, int mes, int ano) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);
        Period periodo = Period.between(dataAtual, dataFutura);
        if (periodo.isNegative()) {
            System.out.println("A data fornecida já passou.");
        } else {
            System.out.println("Faltam " + periodo.getYears() + " anos, " + 
                               periodo.getMonths() + " meses e " + 
                               periodo.getDays() + " dias para " + 
                               dataFutura + ".");
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int dia = random.nextInt(28) + 1; 
        int mes = random.nextInt(12) + 1;
        int ano = random.nextInt(5) + 2025; 
        contaTempo(dia, mes, ano);
    }
}