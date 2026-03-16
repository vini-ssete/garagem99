/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.vinicius.garagem.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import br.eti.vinicius.garagem.entities.Veiculo;
import java.util.List;

/**
 *
 * @author digma
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long>  {
    List<Veiculo> findByCorIgnoreCase (String cor);
    List<Veiculo> findByAno(int ano);
    
}
