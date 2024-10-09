/*package com.biblioteca.api;
/*import java.util.Optional;

import com.biblioteca.api.model.Book;
import com.biblioteca.api.model.Comment;
import com.biblioteca.api.model.Estado;
import com.biblioteca.api.model.User;
import com.biblioteca.api.service.BookService;
import com.biblioteca.api.service.CommentService;
import com.biblioteca.api.service.UserService;

public class Main {

  public static void main() {
    // Ejemplo de Uso.

    // Servicios
    BookService bookService = new BookService();
    UserService userService = new UserService();
    CommentService commentService = new CommentService();

    // Crear usuarios
    User admin = userService.registrarUsuario("Admin", "admin@biblioteca.com", "admin123", "admin");
    User usuario1 = userService.registrarUsuario("Juan Perez", "juan@example.com", "password", "user");

    // Mostrar los usuarios
    System.out.println("Usuarios: *****************");
    System.out.println(admin.getNombre() + " " + admin.getRol());
    System.out.println(usuario1.getNombre() + " " + usuario1.getRol());

    // Subir libros
    Book libro1 = bookService.agregarLibro("Aprende Java", "JAVA", Estado.OK, "java.pdf");
    Book libro2 = bookService.agregarLibro("Aprende Spring", "JAVA", Estado.OK, "spring.pdf");

    // Listar todos los libros
    System.out.println("Libros en la biblioteca: ************");
    bookService.obtenerTodosLosLibros().forEach(libro ->
            System.out.println(libro.getId() + "--" + libro.getTitulo() + " - " + libro.getEstado())
    );

    // Obtener libro por ID
    Optional<Book> libroObtenido = bookService.obtenerLibroPorId(1);
    libroObtenido.ifPresent(libro ->
            System.out.println("Libro obtenido: " + libro.getTitulo())
    );

    // Eliminar libro
    bookService.eliminarLibro(1);
    System.out.println("Libros después de eliminar:");
    bookService.obtenerTodosLosLibros().forEach(libro ->
            System.out.println(libro.getTitulo())
    );

    //  Comentarios
    Comment comentario1 = commentService.crearCommentario(usuario1.getId(), libro1.getId(), "El mejor libro que he leido.", 3.0);
    Comment comentario2 = commentService.crearCommentario(usuario1.getId(), libro1.getId(), "Segundo comentario", 4.0);
    Comment comentario3 = commentService.crearCommentario(usuario1.getId(), libro1.getId(), "Tercer comentario", 5.0);
    
    System.out.println(usuario1.getNombre() + ": comento: " + comentario1.getComment() + " Al libro: " + libro1.getTitulo() + " " + comentario1.getRating_value());
    System.out.println(usuario1.getNombre() + ": comento: " + comentario2.getComment() + " Al libro: " + libro1.getTitulo() + " " + comentario2.getRating_value());
    System.out.println(usuario1.getNombre() + ": comento: " + comentario3.getComment() + " Al libro: " + libro1.getTitulo() + " " + comentario3.getRating_value());
    
    System.out.println("****** Todos los comentarios ******");
    commentService.obtenerTodosLosComentarios().forEach(comentario -> 
    System.out.println(comentario.getComment()));
    
    System.out.println("****** Primer comentario ******");
    Optional<Comment> primerComentario = commentService.obtenerTodosLosComentarios().stream()
    .findFirst();
    primerComentario.ifPresent(p -> System.out.println("El primer comentario es: " + p.getComment()));
    
    System.out.println("****** Comentario con mayor rating ******");
    Optional<Comment> mayorRatingComentario = commentService.obtenerTodosLosComentarios().stream()
    .max((c1, c2) -> c1.getRating_value().compareTo(c2.getRating_value()));
    mayorRatingComentario.ifPresent(p -> System.out.println("El comentario con mayor rating: " + p.getComment()));

    // Eliminar comentario
    commentService.eliminarComentario(2);
    System.out.println("Despues de eliminar un comentario:");
    commentService.obtenerTodosLosComentarios().forEach(comentario -> 
    System.out.println(comentario.getComment()));   
  }
}*/
