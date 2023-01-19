package com.enoca.Enoca.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SirketDto {
    private Long id;

    private String sirketAdi;

    private String sirketKodu;
}
