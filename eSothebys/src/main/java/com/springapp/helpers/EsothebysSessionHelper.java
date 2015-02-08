package com.springapp.helpers;

import com.springapp.dto.UzytkownikTO;
import com.springapp.model.UzytkownikEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by Internet on 2015-02-07.
 */
@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = "session")
public class EsothebysSessionHelper implements IEsothebysSessionHelper {

    UzytkownikEntity currentUser;

    public EsothebysSessionHelper(){

    }

    private static EsothebysSessionHelper instance = null;

    public static EsothebysSessionHelper getInstance(){
        if(instance == null) {
            instance = new EsothebysSessionHelper();
        }
        return instance;
    }

    @Override
    public long getCurrentUserId(){
        return currentUser.getId();
    }

    @Override
    public UzytkownikTO getCurrentUserForWystawPrzedmiot() {
        return null;
    }

}
