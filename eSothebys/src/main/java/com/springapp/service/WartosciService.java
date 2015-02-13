package com.springapp.service;

import com.springapp.dto.WartoscTO;

import java.util.List;

/**
 * Created by Internet on 2015-02-08.
 */
public interface WartosciService {
    WartoscTO getWartoscById(Long id);

    List<WartoscTO> getWartościByIdArray(String[] indices);
}
