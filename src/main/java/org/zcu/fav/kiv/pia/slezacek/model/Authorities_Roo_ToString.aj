// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.zcu.fav.kiv.pia.slezacek.model;

import java.lang.String;

privileged aspect Authorities_Roo_ToString {
    
    public String Authorities.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserEntry: ").append(getUserEntry()).append(", ");
        sb.append("Authority: ").append(getAuthority());
        return sb.toString();
    }
    
}
