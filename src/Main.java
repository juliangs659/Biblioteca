import java.util.Optional;

import model.Book;
import model.Estado;
import model.User;
import service.BookService;
import service.UserService;

public class Main {

  public static void main(String[] args) {
    // Ejemplo de Uso.

    // Servicios
    BookService bookService = new BookService();
    UserService userService = new UserService();

    // Crear usuarios
    User admin = userService.registrarUsuario("Admin", "admin@biblioteca.com", "admin123", "admin");
    User usuario1 = userService.registrarUsuario("Juan Perez", "juan@example.com", "password", "user");

    // Mostrar los usuarios
    System.out.println("Usuarios: *****************");
    System.out.println(admin.getNombre() + " " + admin.getRol());
    System.out.println(usuario1.getNombre() + " " + usuario1.getRol());

    // Subir libros
    bookService.agregarLibro("Aprende Java", "JAVA", Estado.OK, "java.pdf");
 
    bookService.agregarLibro("Aprende Spring", "JAVA", Estado.OK, "spring.pdf");

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
  }
}
