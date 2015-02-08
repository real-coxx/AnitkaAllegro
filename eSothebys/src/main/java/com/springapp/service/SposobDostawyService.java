package com.springapp.service;

import com.springapp.dto.SposobDostawyTO;

import java.util.List;
import java.util.Map;

/**
 * Created by Internet on 2015-02-08.
 */
public interface SposobDostawyService {
    Map<Long,SposobDostawyTO> getAllSposobyDostawy();
}
