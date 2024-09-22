import java.util.Date;

public class Book {
    private Long id;
    private String titulo;
    private String autor;
    private String categoria;
    private String contenido; // Puede ser la URL al recurso
    private Date fechaPublicacion;
    private String descripcion;
    private int cantidadPaginas;
    private String lenguaje;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getContenido() {
    return contenido;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  public Date getFechaPublicacion() {
    return fechaPublicacion;
  }

  public void setFechaPublicacion(Date fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getCantidadPaginas() {
    return cantidadPaginas;
  }

  public void setCantidadPaginas(int cantidadPaginas) {
    this.cantidadPaginas = cantidadPaginas;
  }

  public String getLenguaje() {
    return lenguaje;
  }

  public void setLenguaje(String lenguaje) {
    this.lenguaje = lenguaje;
  }
}


