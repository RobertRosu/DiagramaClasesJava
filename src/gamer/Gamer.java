package gamer;

import partida.Partida;
import usuario.Usuario;

public class Gamer extends Usuario{
	private String nickName;
	private Partida partida;
	
	public Gamer(String nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public void setEdad(int edad) {
		if(this.getEdad() >= 18) {
			edad = this.getEdad();
		}else {
			edad = 0;
		}
	}
}
