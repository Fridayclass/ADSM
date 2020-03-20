package eng2020_1_a03;

public class Incremental {
private static Incremental inc = null;
private static int count = 0;
private int numero;

public Incremental() {
numero = ++count;
}

public static Incremental getInstance() {
	if(inc==null) {
	inc = new Incremental();
	return inc;
}else
	return inc;
	}


public String toString() {
return "Incremental " + numero;
}
}
