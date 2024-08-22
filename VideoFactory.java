import java.util.ArrayList;

//Interface da Fábrica Abstrata de Videos 
public interface VideoFactory {

    Video criarVideo(int codigo, String titulo, String diretor, String genero, int ano_lancamento,
            ArrayList<String> atoresPrincipais);

    void removerAtoresPrincipais();

}
