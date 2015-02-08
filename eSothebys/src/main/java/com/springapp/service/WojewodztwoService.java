package com.springapp.service;

import com.springapp.dto.WojewodztwoTO;

import java.util.List;

/**
 * Created by Internet on 2015-02-08.
 */
public interface WojewodztwoService {
    WojewodztwoTO getWojewodztwoById(long id);

    List<WojewodztwoTO> getWojewodztwaByKrajId(long krajId);
}
