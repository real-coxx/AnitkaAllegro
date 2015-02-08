package com.springapp.service;

import com.springapp.dto.ParametrTO;

import java.util.Map;

/**
 * Created by Internet on 2015-02-08.
 */
public interface ParametrService {
    Map<Long,ParametrTO> getAllParametersForCategoryId(long idKategorii);
}
