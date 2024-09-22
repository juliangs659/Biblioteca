import java.util.Date;

public class Book {

  private long id;
  private String titulo;
  private String autor;
  private String categoria;
  private byte[] contenidoPdf;
  private String nombreArchivo;
  private Date fechaSubida;

  public Book(long id, String titulo, String autor, String categoria, byte[] contenidoPdf, String nombreArchivo) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.categoria = categoria;
    this.contenidoPdf = contenidoPdf;
    this.nombreArchivo = nombreArchivo;
    this.fechaSubida = new Date(); // Se asigna la fecha actual
  }

  // Getters y Setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
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

  public byte[] getContenidoPdf() {
    return contenidoPdf;
  }

  public void setContenidoPdf(byte[] contenidoPdf) {
    this.contenidoPdf = contenidoPdf;
  }

  public String getNombreArchivo() {
    return nombreArchivo;
  }

  public void setNombreArchivo(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo;
  }

  public Date getFechaSubida() {
    return fechaSubida;
  }
}
