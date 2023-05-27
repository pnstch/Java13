package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CARS")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "DATE")
    private Date date;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", date=" + date +
                '}';
    }
}
