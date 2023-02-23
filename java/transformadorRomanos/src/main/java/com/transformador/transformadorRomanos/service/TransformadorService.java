package com.transformador.transformadorRomanos.service;

import org.springframework.stereotype.Service;

@Service
public class TransformadorService {
    
    public String transformador(Integer numero){
        return numero.toString();
    }

}
