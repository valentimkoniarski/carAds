package com.example.api.controller;

import com.example.api.dto.VeiculoDto;
import com.example.api.model.Veiculo;
import com.example.api.repository.UsuarioRepository;
import com.example.api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

    @Autowired
    VeiculoRepository veiculoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/home")
    public List<Veiculo> home() {

        List<Veiculo> veiculo = veiculoRepository.findAll();

        return veiculo;
    }

    @PostMapping("/create")
    public Veiculo create(@RequestBody @Valid VeiculoDto veiculoDto) {

        Veiculo veiculo = veiculoDto.toVeiculo();

        veiculoRepository.save(veiculo);

        return veiculo;

    }

    @GetMapping(value = "/{id}")
    public VeiculoDto detalhesVeiculo(@PathVariable("id") Long id) {

        Veiculo veiculo = veiculoRepository.getById(id);

        return new VeiculoDto(veiculo);
    }


}
