package model;

import java.util.Date;

public class View {
    private Long id;
    private Long book_id;
    private Date fecha_hora;

    public View(Long id, Long book_id){
        this.id = id;
        this.book_id = book_id;
        this.fecha_hora = new Date();
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
}
