package com.astrocode.api_monitoring.services;


import com.astrocode.api_monitoring.dtos.NaveDto;
import com.astrocode.api_monitoring.models.NaveModel;
import com.astrocode.api_monitoring.repository.NaveRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NaveService {
    @Autowired
    NaveRepository naveRepository;

    public Optional<NaveModel> getNaveById(Long id){
        return this.naveRepository.findById(id);
    }

    public NaveModel addNave(NaveDto dto){
        NaveModel newNave = new NaveModel();
        BeanUtils.copyProperties(dto, newNave);
        NaveModel savedNave = naveRepository.save(newNave);

        return newNave;
    }

    public List<NaveModel> getAllNaves(){
        return this.naveRepository.findAll();
    }


}
