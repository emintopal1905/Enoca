package com.enoca.Enoca.service;

import com.enoca.Enoca.dto.CalisanDto;
import com.enoca.Enoca.dto.SirketDto;

import java.util.List;

public interface SirketService {

    SirketDto add(SirketDto sirketDto);
    void delete(Long id);
    SirketDto update(SirketDto sirketDto);
    List<SirketDto> getAll();

}
