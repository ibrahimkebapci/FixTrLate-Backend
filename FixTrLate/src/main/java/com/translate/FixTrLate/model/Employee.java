package com.translate.FixTrLate.model;

import com.fasterxml.jackson.core.SerializableString;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity //database ile mappleme işlemlerini yapabilmek için
@Data
@Table
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private long id;
    @Column(nullable = false, updatable = false)
    private Date start_date; //iş başlangıç tarihi
    @Column(nullable = false, updatable = false)
    private  Date due_date; //iş bitiş tarihi
    private String name;
    private String client;
    private String service; //müşteri için hangi dillerde çeviri yapılacağını gireceğimiz bölüm
    private float  quantity; // kelime başı alınacak ücret
    private Long unit; //girilecek kelime sayısı
    @Column(nullable = false,updatable = false)
    private String employeeCode;
    public Employee(){

    }
}
