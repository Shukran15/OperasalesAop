package com.example.operasales.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Prime")
public class Primera {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String descripcion;

    @Column(name = "kategory")
    private Kategory kt;

    @Column(name = "free_place")
    private int freeplace;

    @OneToMany(mappedBy = "pr")
    private Set<Ticket> tickets;



    public Primera(){

    }


    public void minusPlace(){

        freeplace = freeplace - 1;
    }

    public void plusPlace(){

        freeplace = freeplace + 1;
    }

    public Primera(long id, String name, String descripcion, Kategory kt, int freeplace) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.kt = kt;
        this.freeplace = freeplace;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Kategory getKt() {
        return kt;
    }

    public void setKt(Kategory kt) {
        this.kt = kt;
    }

    public int getFreeplace() {
        return freeplace;
    }

    public void setFreeplace(int freeplace) {
        this.freeplace = freeplace;
    }

    @Override
    public String toString() {
        return "Primera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", kt=" + kt +
                ", freeplace=" + freeplace +
                '}';
    }
}
