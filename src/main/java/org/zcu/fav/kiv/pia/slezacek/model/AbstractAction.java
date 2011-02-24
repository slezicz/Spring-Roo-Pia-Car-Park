package org.zcu.fav.kiv.pia.slezacek.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.zcu.fav.kiv.pia.slezacek.model.Users;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import org.zcu.fav.kiv.pia.slezacek.model.Vehicle;

@RooJavaBean
@RooToString
@RooEntity
public abstract class AbstractAction {

    @NotNull
    @ManyToOne
    private Users person;

    @ManyToOne
    private Vehicle vehicle;
}
