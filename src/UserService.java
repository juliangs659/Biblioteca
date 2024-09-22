import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

  private List<User> usuarios = new ArrayList<>();
  private long idCounter = 1;

  public User registrarUsuario(String nombre, String email, String password, String rol) {
    User nuevoUsuario = new User(idCounter++, nombre, email, password, rol);
    usuarios.add(nuevoUsuario);
    return nuevoUsuario;
  }

  public Optional<User> obtenerUsuarioPorEmail(String email) {
    return usuarios.stream().filter(usuario -> usuario.getEmail().equals(email)).findFirst();
  }

  public List<User> obtenerTodosLosUsuarios() {
    return usuarios;
  }
}

