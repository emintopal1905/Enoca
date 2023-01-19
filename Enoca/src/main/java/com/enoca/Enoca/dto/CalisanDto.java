package com.enoca.Enoca.dto;

import com.enoca.Enoca.entity.Sirket;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalisanDto {

    private Long id;
    private String ad;
    private String soyad;
    private String unvan;
    private Sirket sirket;
}
