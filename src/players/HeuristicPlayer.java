package players;

import jogo.AbstractPlayer;
import jogo.Casa;
import jogo.Jogada;
import jogo.JogoVelha;

import java.util.List;

/**
 * Created by andre.bovendorp on 04/05/2017.
 */
public class HeuristicPlayer extends AbstractPlayer {
    JogoVelha jogo;

    public HeuristicPlayer(int depth){
        super(depth);
        jogo = new JogoVelha();
    }

    @Override
    public Casa jogar(int[][] tab) {
        List<Jogada> jogadaList = jogo.getJogadasValidas(tab,getMinhaMarcaTabuleiro());
        for (Jogada j: jogadaList){

        }
        return new Casa(0,0);
    }

    private int heuristic(int[][] tab, int depth, int value){
        int x = 0;

        return value += x;
    }

}
