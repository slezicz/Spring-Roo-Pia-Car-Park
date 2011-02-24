package org.zcu.fav.kiv.pia.slezacek.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.zcu.fav.kiv.pia.slezacek.model.Car;
import javax.persistence.ManyToOne;
import org.zcu.fav.kiv.pia.slezacek.model.Users;
import org.springframework.beans.factory.annotation.Value;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;

@RooJavaBean
@RooToString
@RooEntity
public class Vehicle {

    @ManyToOne
    private Car car;

    @ManyToOne
    private Users owner;

    @Value("0")
    private Float tankState;

    @NotNull
    private Float fuelConsumptionTo100Km;

    @NotNull
    private Float mileage;

    @Value("0")
    private Float price;

    @Value("true")
    private Boolean isMobile;

    @NotNull
    @Column(unique = true)
    private String numberPlate;

    private String photoFile;

    private String comment;
}
