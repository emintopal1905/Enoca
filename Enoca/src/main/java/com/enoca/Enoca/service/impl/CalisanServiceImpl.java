package com.enoca.Enoca.service.impl;

import com.enoca.Enoca.dto.CalisanDto;
import com.enoca.Enoca.entity.Calisan;
import com.enoca.Enoca.repo.CalisanRepository;
import com.enoca.Enoca.service.CalisanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CalisanServiceImpl implements CalisanService {


    private final CalisanRepository calisanRepository;
    @Override
    public CalisanDto add(CalisanDto calisanDto) {
        Calisan calisan = new Calisan();
        calisan.setAd(calisanDto.getAd());
        calisan.setSoyad(calisanDto.getSoyad());
        calisan.setUnvan(calisanDto.getUnvan());
        calisan.setSirket(calisanDto.getSirket());
        final Calisan addedCalisan = calisanRepository.save(calisan);
        calisanDto.setId(addedCalisan.getId());
        return calisanDto;
    }

    @Override
    public void delete(Long id) {
        calisanRepository.deleteById(id);
    }

    @Override
    public CalisanDto update(CalisanDto calisanDto) {
        return null;
    }

    @Override
    public List<CalisanDto> getAll() {
        List<Calisan> calisanlar = calisanRepository.findAll();
        List<CalisanDto> calisanlarDto= new ArrayList<>();
        calisanlar.forEach(calisan -> {
            CalisanDto calisanDto = new CalisanDto();
            calisanDto.setId(calisan.getId());
            calisanDto.setAd(calisan.getAd());
            calisanDto.setSoyad(calisan.getSoyad());
            calisanDto.setUnvan(calisan.getUnvan());
            calisanDto.setSirket(calisan.getSirket());
            calisanlarDto.add(calisanDto);
        });

        return calisanlarDto;
    }
}
