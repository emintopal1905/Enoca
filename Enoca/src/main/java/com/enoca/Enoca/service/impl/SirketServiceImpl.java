package com.enoca.Enoca.service.impl;

import com.enoca.Enoca.dto.CalisanDto;
import com.enoca.Enoca.dto.SirketDto;
import com.enoca.Enoca.entity.Calisan;
import com.enoca.Enoca.entity.Sirket;
import com.enoca.Enoca.repo.CalisanRepository;
import com.enoca.Enoca.repo.SirketRepository;
import com.enoca.Enoca.service.CalisanService;
import com.enoca.Enoca.service.SirketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SirketServiceImpl implements SirketService {
    private final SirketRepository sirketRepository;
    @Override
    public SirketDto add(SirketDto sirketDto) {
        Sirket sirket = new Sirket();
        sirket.setId(sirketDto.getId());
        sirket.setSirketAdi(sirketDto.getSirketAdi());
        sirket.setSirketKodu(sirketDto.getSirketKodu());
        final Sirket addedSirket = sirketRepository.save(sirket);
        sirketDto.setId(addedSirket.getId());
        return sirketDto;
    }

    @Override
    public void delete(Long id) {
        sirketRepository.deleteById(id);
    }

    @Override
    public SirketDto update(SirketDto sirketDto) {

        return null;
    }

    @Override
    public List<SirketDto> getAll() {
        List<Sirket> sirketler = sirketRepository.findAll();
        List<SirketDto> sirketlerDto= new ArrayList<>();
        sirketler.forEach(sirket -> {
            SirketDto sirketDto = new SirketDto();
            sirketDto.setId(sirket.getId());
            sirketDto.setSirketAdi(sirket.getSirketAdi());
            sirketDto.setSirketKodu(sirket.getSirketKodu());
            sirketlerDto.add(sirketDto);
        });

        return sirketlerDto;
    }
}
