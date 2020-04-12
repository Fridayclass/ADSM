package subject;

import observador.ConsomeNoticia;

public interface Assunto {
	void registraObservador(ConsomeNoticia observer);
	void removeObservador(ConsomeNoticia observer);
	void notificaTodos();
}