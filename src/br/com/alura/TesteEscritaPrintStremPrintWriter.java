package br.com.alura;
import java.io.PrintWriter;
public class TesteEscritaPrintStremPrintWriter{
    public static void main(String[] args) throws Exception {
     
        //fluxo de entreda com um arquivo
       // OutputStream fos= new FileOutputStream("lorem2.txt");
        //Writer osw= new OutputStreamWriter(fos);
        //BufferedWriter bw= new BufferedWriter(osw);
        //BufferedWriter bw=new BufferedWriter(new FileWriter("lorem2.txt"));
       // PrintStream ps = new PrintStream("lorem2.txt");
       PrintWriter ps= new PrintWriter("lorem2.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        ps.println();
        ps.println();
        ps.println();
        ps.println("teste...");
        ps.close();
        System.out.println();
    }
}
