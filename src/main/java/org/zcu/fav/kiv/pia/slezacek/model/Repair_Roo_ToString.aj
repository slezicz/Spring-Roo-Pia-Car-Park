// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.zcu.fav.kiv.pia.slezacek.model;

import java.lang.String;

privileged aspect Repair_Roo_ToString {
    
    public String Repair.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Person: ").append(getPerson()).append(", ");
        sb.append("Vehicle: ").append(getVehicle()).append(", ");
        sb.append("ReapirDate: ").append(getReapirDate()).append(", ");
        sb.append("Cost: ").append(getCost()).append(", ");
        sb.append("Repaired: ").append(getRepaired()).append(", ");
        sb.append("Description: ").append(getDescription()).append(", ");
        sb.append("Mechanic: ").append(getMechanic());
        return sb.toString();
    }
    
}
