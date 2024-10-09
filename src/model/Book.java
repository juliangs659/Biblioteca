package model;

import java.util.Date;

public class Book {

  private long id;
  private String titulo;
  private String categoria;
  private Estado estado; //('uploaded','review','ok')
  private String contenidoPdf;
  private Date fechaSubida;

  public Book(long id, String titulo, String categoria, Estado estado, String contenidoPdf) {
    this.id = id;
    this.titulo = titulo;
    this.categoria = categoria;
    this.estado = estado;
    this.contenidoPdf = contenidoPdf;
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

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public String getContenidoPdf() {
    return contenidoPdf;
  }

  public void setContenidoPdf(String contenidoPdf) {
    this.contenidoPdf = contenidoPdf;
  }

  public Date getFechaSubida() {
    return fechaSubida;
  }
}
