package it.cs.unicam.pa2021.giochidicarte;

import java.util.List;

/**
 * Classe astratta che, tramite l'implementazione
 * dell'interfaccia Player, permette di andare a definire
 * un generico giocatore di carte.
 *
 * @param <C> tipo di carte con cui giocher&agrave; il giocatore
 */
public abstract class AbstractPlayer<C extends Card> implements Player<C> {

    private static int idPlayer;

    private final int id = idPlayer;

    public AbstractPlayer() {
        idPlayer++;
    }

    public int getIdPlayer() {
        return this.id;
    }

    @Override
    public List<C> getCarteInMano() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<C> getCartePossedute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract C giocaCarta(int carta);

    @Override
    public void pescaCarta(List<C> from, int carta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void pescaCarte(List<C> from, int carte) { throw new UnsupportedOperationException(); }

    @Override
    public String toString() {
        return "AbstractPlayer{" +
                "id=" + id +
                '}';
    }
}
