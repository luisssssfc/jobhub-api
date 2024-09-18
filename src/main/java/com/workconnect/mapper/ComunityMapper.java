package com.workconnect.mapper;

import com.workconnect.dto.ComunityCreateUpdateDTO;
import com.workconnect.dto.ComunityDetailsDTO;
import com.workconnect.model.entity.Community;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComunityMapper {

    private ModelMapper modelMapper;

    public  ComunityMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public ComunityDetailsDTO toComunityDetailsDTO (Community community){
        return modelMapper.map(community, ComunityDetailsDTO.class);
    }

    public ComunityDetailsDTO toComunityDetailsDTO (ComunityCreateUpdateDTO communityCreateUpdateDTO){
        return modelMapper.map(communityCreateUpdateDTO, ComunityDetailsDTO.class);
    }


}
