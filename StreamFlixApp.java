import java.util.ArrayList;

public class StreamFlixApp {

    public static void main(String[] args) {

        SerieFactory sf = new SerieFactory();
        FilmeFactory ff = new FilmeFactory();

        ArrayList<String> atores = new ArrayList<>();
        atores.add("Ator 1");
        atores.add("Ator 2");
        atores.add("Ator 3");
        atores.add("Ator 4");
        atores.add("Ator 5");

        Video filme1 = ff.criarVideo(1, "Filme 1", "Diretor Filme 1", "Genero 1", 2024, atores);
        Video serie1 = sf.criarVideo(2, "Serie 1", "Diretor Serie 1", "Genero 1", 2024, atores);

        // Usuario
        Usuario user1 = new Usuario(1, "Fulano de tal", "fulano@email.com", "Cartao Credito", "123456");

        user1.adicionarFavoritos(filme1);
        user1.adicionarFavoritos(serie1);

        System.out.println(user1.exibir());

    }

}
