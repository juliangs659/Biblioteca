import java.util.Arrays;
import java.util.Optional;

public class Main {

  public static void main(String[] args) {
    // Ejemplo de Uso.

    // Servicios
    BookService bookService = new BookService();
    UserService userService = new UserService();

    // Crear usuarios
    User admin = userService.registrarUsuario("Admin", "admin@biblioteca.com", "admin123", "admin");
    User usuario1 = userService.registrarUsuario("Juan Perez", "juan@example.com", "password", "usuario");

    // Subir libros
    byte[] contenidoLibro1 = "Este es el contenido del libro 1".getBytes();
    Book libro1 = bookService.agregarLibro("Aprende Java", "Autor 1", "Programación", contenidoLibro1, "java.pdf");

    byte[] contenidoLibro2 = "Este es el contenido del libro 2".getBytes();
    Book libro2 = bookService.agregarLibro("Aprende Spring", "Autor 2", "Frameworks", contenidoLibro2, "spring.pdf");

    // Listar todos los libros
    System.out.println("Libros en la biblioteca:");
    bookService.obtenerTodosLosLibros().forEach(libro ->
            System.out.println(libro.getTitulo() + " - " + libro.getAutor())
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
            System.out.println(libro.getTitulo() + " - " + libro.getAutor())
    );
  }
}
