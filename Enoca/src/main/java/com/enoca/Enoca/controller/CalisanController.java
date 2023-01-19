package com.enoca.Enoca.controller;

import com.enoca.Enoca.dto.CalisanDto;
import com.enoca.Enoca.service.CalisanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calisan")
@RequiredArgsConstructor
public class CalisanController {
    private final CalisanService calisanService;
    @PostMapping("/add")
    public ResponseEntity<CalisanDto> add(@RequestBody CalisanDto calisanDto) {
        return ResponseEntity.ok(calisanService.add(calisanDto));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<CalisanDto>> getAll() {
        return ResponseEntity.ok(calisanService.getAll());
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        calisanService.delete(id);
    }
}
