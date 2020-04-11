package eng2020_1_a05_facade;
import java.io.IOException;


public class IOteste {

	public static void main(String[] args)throws IOException {
		
		IOFacade io = new IOFacade();
		io.AqvTxt("ArquivoTXT", "texto");
		io.AqvBn("ArquivoBin"," binario");
		io.AqvObj("ArquivoObj"," Objeto");
	}

}
