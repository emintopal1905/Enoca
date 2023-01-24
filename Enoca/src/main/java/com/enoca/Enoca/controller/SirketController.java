package com.enoca.Enoca.controller;

import com.enoca.Enoca.dto.CalisanDto;
import com.enoca.Enoca.dto.SirketDto;
import com.enoca.Enoca.service.CalisanService;
import com.enoca.Enoca.service.SirketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sirket")
@RequiredArgsConstructor
public class SirketController {

    private final SirketService sirketService;
    @PostMapping("/add")
    public ResponseEntity<SirketDto> add(@RequestBody SirketDto sirketDto) {
        return ResponseEntity.ok(sirketService.add(sirketDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<SirketDto>> getAll() {
        return ResponseEntity.ok(sirketService.getAll());
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        sirketService.delete(id);
    }
}
