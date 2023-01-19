package com.enoca.Enoca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="sirket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Sirket implements Serializable {
    @Id
    @SequenceGenerator(name="seq_sirket",allocationSize = 1)
    @GeneratedValue(generator = "seq_sirket",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="sirketAdi")
    private String sirketAdi;
    @Column(name="sirketKodu")
    private String sirketKodu;

}
