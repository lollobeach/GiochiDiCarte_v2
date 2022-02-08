package it.cs.unicam.pa2021.giochidicarte;

import java.util.List;
import java.util.function.Predicate;

public abstract class AbstractMatch<P extends Player<? extends Card>,D extends Deck<? extends Card>,F extends Field<? extends Card>> implements Match<P,D,F> {

    private final List<P> listaGiocatori;
    private List<D> listaMazzi;
    private final F campoDaGioco;

    public AbstractMatch(List<P> giocatori, List<D> mazzi, F campoDaGioco) {
        this.listaGiocatori = giocatori;
        this.listaMazzi = mazzi;
        this.campoDaGioco = campoDaGioco;
    }

    public AbstractMatch(List<P> giocatori, F campoDaGioco) {
        this.listaGiocatori = giocatori;
        this.campoDaGioco = campoDaGioco;
    }

    @Override
    public List<P> getPlayersInGame() {
        return this.listaGiocatori;
    }

    @Override
    public List<P> getPlayersOutGame() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract P getWinnerPlayer(Predicate<P> p);

    @Override
    public List<D> getDeck() {
        return this.listaMazzi;
    }

    @Override
    public F getField() {
        return this.campoDaGioco;
    }

    @Override
    public abstract void execute();
 }
