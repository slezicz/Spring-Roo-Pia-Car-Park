// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.zcu.fav.kiv.pia.slezacek.model;

import java.lang.String;

privileged aspect UserVehicleRights_Roo_ToString {
    
    public String UserVehicleRights.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Person: ").append(getPerson()).append(", ");
        sb.append("Vehicle: ").append(getVehicle()).append(", ");
        sb.append("Delegate: ").append(getDelegate()).append(", ");
        sb.append("CanDrive: ").append(getCanDrive()).append(", ");
        sb.append("CanTank: ").append(getCanTank()).append(", ");
        sb.append("CanRepair: ").append(getCanRepair());
        return sb.toString();
    }
    
}
