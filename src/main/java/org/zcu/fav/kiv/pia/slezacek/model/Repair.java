package org.zcu.fav.kiv.pia.slezacek.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.beans.factory.annotation.Value;
import org.zcu.fav.kiv.pia.slezacek.model.Users;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity
public class Repair extends AbstractAction {

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date reapirDate;

    @NotNull
    private Float cost;

    @Value("true")
    private Boolean repaired;

    private String description;

    @ManyToOne
    private Users mechanic;
}
