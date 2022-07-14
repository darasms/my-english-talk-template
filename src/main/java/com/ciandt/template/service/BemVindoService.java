package com.ciandt.template.service;

import com.ciandt.template.dto.BemVindoDto;
import com.ciandt.template.model.BemVindo;
import com.ciandt.template.repository.BemVindoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class BemVindoService {

    private final BemVindoRepository bemVindoRepository;
    private final ModelMapper modelMapper;

    public BemVindoDto obterMensagem(Long id){
        BemVindo bemVindo = bemVindoRepository.findById(id)
                .orElseThrow( () -> new EntityNotFoundException("Mensagem não encontrada"));
        return modelMapper.map(bemVindo, BemVindoDto.class);
    }
}
