package partida;

import java.util.Date;

import gamer.Gamer;

public class Partida {
	private Date fecha;
	private String nombreJuego;
	private boolean online;
	private Gamer gamer;
	
	
	public Partida() {
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
}
