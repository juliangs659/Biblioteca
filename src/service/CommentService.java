package service;

import java.util.ArrayList;
import java.util.List;

import model.Comment;

public class CommentService {
    private List<Comment> comentarios = new ArrayList<>();
    private long idCounter = 1;

    public Comment crearCommentario(Long user_id, Long book_id, String comment, Double rating_value){
        Comment comentario = new Comment(idCounter++, user_id, book_id, comment, rating_value);
        comentarios.add(comentario);
        return comentario;
    }

    public void eliminarComentario(long id) {
        comentarios.removeIf(comentario -> comentario.getId() == id);
      }

    public List<Comment> obtenerTodosLosComentarios(){
        return comentarios;
    }
}
