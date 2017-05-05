package players;

import jogo.AbstractPlayer;
import jogo.Casa;
import jogo.Jogada;
import jogo.JogoVelha;

import java.util.List;
import java.util.Random;

/**
 * Created by andre.bovendorp on 04/05/2017.
 */
public class AndreFirstPlayer extends AbstractPlayer {

    JogoVelha jogo;
    Random r;
    public AndreFirstPlayer(int depth){
        super(depth);
        jogo = new JogoVelha();
        r = new Random();
    }

    @Override
    public Casa jogar(int[][] tab) {
        List<Jogada> jogadaList = jogo.getJogadasValidas(tab,getMinhaMarcaTabuleiro());
        return jogadaList.get(r.nextInt(jogadaList.size())).getCasa();

    }
}
