/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.vinicius.garagem.service;

import br.eti.vinicius.garagem.DTO.VeiculoMinDTO;
import br.eti.vinicius.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import br.eti.vinicius.garagem.repositories.VeiculoRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author digma
 */
@Service
public class Garagem99Service {
    
    @Autowired
    private VeiculoRepository veiculoRepository;
    
    public List<VeiculoMinDTO> findAll() {
        
        List<Veiculo> result = veiculoRepository.findAll();
        List<VeiculoMinDTO> resultDTO = result.stream().map(x -> new VeiculoMinDTO(x)).toList();
        return resultDTO;
    
    }
    
    public List<VeiculoMinDTO> findByCorIgnoreCase (String cor) {
        
        List<Veiculo> result = veiculoRepository.findByCorIgnoreCase(cor);
        List<VeiculoMinDTO> resultDTO = result.stream().map(x -> new VeiculoMinDTO(x)).toList();
        return resultDTO;
    }
    
    
    
    
}
