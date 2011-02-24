package org.zcu.fav.kiv.pia.slezacek.model;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Authorities {

    @NotNull
    @ManyToOne
    private Users userEntry;

    @NotNull
    private String authority;
}
