package diadia;

import diadia.ambienti.Labirinto;
import diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Labirinto
 * @version base 1.0
 */

public class Partita {

	private Labirinto maze = new Labirinto();
	private boolean finita;
	private Giocatore player = new Giocatore();
	
	public Partita(){
		this.maze.init();
		this.finita = false;
	}

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.maze.getStanzaCorrente()== maze.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (player.getCFU() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	public Giocatore getPlayer() {
		return this.player;
	}
	
	public Labirinto getLabirinto() {
		return this.maze;
	}
}