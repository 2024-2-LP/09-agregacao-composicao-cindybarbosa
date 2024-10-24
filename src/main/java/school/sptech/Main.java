package school.sptech;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("A rainha vermelha", "Victoria Aveyard", LocalDate.of(2015, 6, 16));
        Livro livro2 = new Livro("A arte de viver com simplicidade", "SHUNMYO MASUNO", LocalDate.of(2019, 6, 18));

        Avaliacao avaliacao1 = new Avaliacao("O mundo de Mare Barrow é dividido pelo sangue: vermelho ou prateado. Mare e sua família são vermelhos: plebeus, humildes, destinados a servir uma elite prateada cujos poderes sobrenaturais os tornam quase deuses.", 1500.0);

        Avaliacao avaliacao2 = new Avaliacao("Está tão relacionada a práticas e comportamentos quanto está ligada à reflexão. Em seu livro, ele explica os principais conceitos da vida zen e ensina 100 lições simples para colocá-los em prática.", 1900.0);

        livro1.adicionarAvaliacao(avaliacao1);
        livro2.adicionarAvaliacao(avaliacao2);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("A rainha vermelha");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo() + ", Autor: " + livroEncontrado.getAutor() + ", Data de publicação: " + livroEncontrado.getDataPublicacao());
        } else {
            System.out.println("Livro não encontrado.");
        }

        if (livroEncontrado != null) {
            for (Avaliacao avaliacao : livroEncontrado.getAvaliacoes()) {
                System.out.println("Avaliação: " + avaliacao.getDescricao() + ", Comentário: " + avaliacao.getQtdEstrelas());
            }
        }
    }
}
