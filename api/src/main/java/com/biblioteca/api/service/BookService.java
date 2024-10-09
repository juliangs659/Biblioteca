package com.biblioteca.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.biblioteca.api.model.Book;
import com.biblioteca.api.model.Estado;

public class BookService {

  /*
  En esta clase se encargara de la logica de negocio
  como guardar libros y obtenerlos
   */

  private List<Book> libros = new ArrayList<>();
  private long idCounter = 1;

  public Book agregarLibro(String titulo, String categoria, Estado estado, String contenidoPdf) {
    Book nuevoLibro = new Book(idCounter++, titulo, categoria, estado, contenidoPdf);
    libros.add(nuevoLibro);
    return nuevoLibro;
  }

  public List<Book> obtenerTodosLosLibros() {
    return libros;
  }

  public Optional<Book> obtenerLibroPorId(long id) {
    return libros.stream().filter(libro -> libro.getId() == id).findFirst();
  }

  public void eliminarLibro(long id) {
    libros.removeIf(libro -> libro.getId() == id);
  }
}


