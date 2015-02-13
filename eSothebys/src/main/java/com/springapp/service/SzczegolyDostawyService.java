package com.springapp.service;

import com.springapp.dto.SposobDostawyTO;
import com.springapp.dto.SzczegolyDostawyTO;

/**
 * Created by Internet on 2015-02-08.
 */
public interface SzczegolyDostawyService {
    SzczegolyDostawyTO getSzczegolyDostawyBySposobDostawy(long sposobDostawyId);
}
