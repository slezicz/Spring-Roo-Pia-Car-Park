package org.zcu.fav.kiv.pia.slezacek.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.zcu.fav.kiv.pia.slezacek.reference.CarManufacturer;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import org.zcu.fav.kiv.pia.slezacek.reference.CarBody;

@RooJavaBean
@RooToString
@RooEntity
public class Car {

    @Enumerated
    private CarManufacturer manufacturer;

    @NotNull
    private String model;

    @Enumerated
    private CarBody carBody;

    @NotNull
    private Float maxTankCapacity;
}
