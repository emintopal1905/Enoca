package com.enoca.Enoca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="calisan")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Calisan implements Serializable {
    @Id
    @SequenceGenerator(name="seq_calisan",allocationSize = 1)
    @GeneratedValue(generator = "seq_calisan",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="ad")
    private String ad;
    @Column(name="soyad")
    private String soyad;
    @Column(name="unvan")
    private String unvan;
    @ManyToOne
    @JoinColumn(name="sirket")
    private Sirket sirket;

}
