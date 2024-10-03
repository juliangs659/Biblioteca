package model;

public class Book_autor {
    private Long id_book;    
    private Long id_autor;
    
    public Long getId_autor() {
        return id_autor;
    }

    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }
}
