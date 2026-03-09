/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.vinicius.garagem.controllers;

import br.eti.vinicius.garagem.DTO.VeiculoMinDTO;
import br.eti.vinicius.garagem.entities.Veiculo;
import br.eti.vinicius.garagem.service.Garagem99Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */
@RestController
public class VeiculoController {
    
    @Autowired
    private Garagem99Service garagem99Service;
    
    /**
     * Endpoint /airports/airport
     * Retorna TODOS os aeroportos da base de dados
     * @return
     */
    @GetMapping("/forsale")
    public List<VeiculoMinDTO>findAll() {
        List<VeiculoMinDTO> resultDTO = garagem99Service.findAll();
        return resultDTO;
    }
}
