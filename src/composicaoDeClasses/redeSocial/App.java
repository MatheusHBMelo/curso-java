package composicaoDeClasses.redeSocial;

import composicaoDeClasses.redeSocial.entities.Comment;
import composicaoDeClasses.redeSocial.entities.Post;

public class App {
    public static void main(String[] args) {
        // Comentários 01 e 02 - Hard Code
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        // Instanciando o post #1 e adicionando os dois comentários
        Post p1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComments(c1);
        p1.addComments(c2);

        // Comentários 03 e 04 - Hard Code
        Comment c3 = new Comment("Good night.");
        Comment c4 = new Comment("May the Force be with you.");

        // Instanciando o post #1 e adicionando os dois comentários
        Post p2 = new Post("Good night guys", "See you tomorrow", 5);
        p2.addComments(c3);
        p2.addComments(c4);

        // Testando os resultados
        System.out.println(p1);
        System.out.println(p2);
    }
}
