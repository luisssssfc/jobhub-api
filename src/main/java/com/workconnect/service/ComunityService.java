package com.workconnect.service;

import com.workconnect.dto.ComunityCreateUpdateDTO;
import com.workconnect.dto.ComunityDetailsDTO;
import org.springframework.stereotype.Service;


public interface ComunityService {
    ComunityDetailsDTO createComunity(ComunityCreateUpdateDTO comunityCreateUpdateDTO);


}
