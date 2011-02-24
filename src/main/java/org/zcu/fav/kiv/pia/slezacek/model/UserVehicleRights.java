package org.zcu.fav.kiv.pia.slezacek.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.zcu.fav.kiv.pia.slezacek.model.Users;
import javax.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Value;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findUserVehicleRightsesByPersonAndVehicleAndCanDrive", "findUserVehicleRightsesByPersonAndVehicleAndCanTank", "findUserVehicleRightsesByPersonAndVehicleAndCanRepair" })
public class UserVehicleRights extends AbstractAction {

    @ManyToOne
    private Users delegate;

    @Value("false")
    private Boolean canDrive;

    @Value("false")
    private Boolean canTank;

    @Value("false")
    private Boolean canRepair;
}
