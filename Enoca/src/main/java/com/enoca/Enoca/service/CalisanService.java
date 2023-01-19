package com.enoca.Enoca.service;

import com.enoca.Enoca.dto.CalisanDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface CalisanService {

    CalisanDto add(CalisanDto calisanDto);
    void delete(Long id);
    CalisanDto update(CalisanDto calisanDto);
    List<CalisanDto> getAll();
}
