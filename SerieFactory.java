import java.util.ArrayList;

public class SerieFactory implements VideoFactory {

    @Override
    public Video criarVideo(int codigo, String titulo, String diretor, String genero, int ano_lancamento,
            ArrayList<String> atoresPrincipais) {

        return new Serie(codigo, titulo, diretor, ano_lancamento, genero, atoresPrincipais, 0);
    }

    @Override
    public void removerAtoresPrincipais() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerAtoresPrincipais'");
    }

}
