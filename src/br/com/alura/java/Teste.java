package br.com.alura.java;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

public static void main(String[] args) throws Exception{
 Scanner scanner = new Scanner (new File("contas.csv"));
 while(scanner.hasNextLine()){
 String linha=scanner.nextLine();
 System.out.println(linha);
 Scanner linhScanner= new Scanner(linha);
 linhScanner.useLocale(Locale.US);
 linhScanner.useDelimiter(",");
 String tipoConta = linhScanner.next();
 int agencia = linhScanner.nextInt();
 int numero = linhScanner.nextInt();
 String Titular = linhScanner.next();
 Double saldo = linhScanner.nextDouble();
 String valorFormatado= String.format("%s-%04d-%04d, %s: %s", tipoConta, agencia,numero,Titular,saldo);
 System.out.println(valorFormatado);
 linhScanner.close();

 //String[]valores= linha.split(",");
 //System.out.println(valores[3]);
}

 scanner.close();
}
}
