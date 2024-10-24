package school.sptech;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros;


    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public Biblioteca() {

        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null && livro.getTitulo() != null && !livro.getTitulo().isEmpty()) {
            livros.add(livro);
        }
    }

    public void removerLivroPorTitulo(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                break;
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            return null;
        }
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Integer contarLivros() {

        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano) {
        List<Livro> livrosAteAno = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getDataPublicacao().getYear() <= ano) {
                livrosAteAno.add(livro);
            }
        }
        return livrosAteAno;
    }

}
