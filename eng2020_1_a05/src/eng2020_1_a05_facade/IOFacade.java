package eng2020_1_a05_facade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;



public class IOFacade {
	private static String nomeArq;
    private static String texto;
    
    
    
	
	public void AqvTxt(String nome, String txt) throws IOException {
	nomeArq = nome+".txt";
		texto = txt;
		CriaArquivo();
		leArquivo();
	}
	
	public void AqvBn(String nome, String bn) throws IOException {
		nomeArq = nome+".bin";
		texto = bn;
		CriaArquivo();
		leArquivo();
		
	}
	public void AqvObj(String nome, String obj) throws IOException {
		nomeArq	 = nome+".obj";
		texto = obj;
		CriaArquivo();
		leArquivo();
		
	}
	
	
	private static void CriaArquivo() {
		try (PrintWriter writer = new PrintWriter(new File(nomeArq))) {
			writer.println(texto);
		} catch (FileNotFoundException e) {
			System.out.println(" erro ");
			e.printStackTrace();
		}
	}
	
	public static void leArquivo() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(nomeArq));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
	
	
}
	


