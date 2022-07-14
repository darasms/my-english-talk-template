package com.ciandt.template.controller;


import com.ciandt.template.dto.BemVindoDto;
import com.ciandt.template.service.BemVindoService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BemVindoController {

    private final BemVindoService bemVindoService;

    @GetMapping("/{id}")
    public ResponseEntity<BemVindoDto> bemVindo(@PathVariable @NotNull Long id){
        BemVindoDto dto = bemVindoService.obterMensagem(id);
        return ResponseEntity.ok(dto);
    }
}
