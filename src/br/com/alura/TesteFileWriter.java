package br.com.alura;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class TesteFileWriter{
    public static void main(String[] args) throws Exception {
     
        //fluxo de entreda com um arquivo
       // OutputStream fos= new FileOutputStream("lorem2.txt");
        //Writer osw= new OutputStreamWriter(fos);
        //BufferedWriter bw= new BufferedWriter(osw);
        BufferedWriter bw=new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        bw.newLine();
        bw.newLine();
       bw.write("teste...");
        System.out.println();
        bw.close();
    }
}
