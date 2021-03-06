// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.zcu.fav.kiv.pia.slezacek.model;

import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;
import org.zcu.fav.kiv.pia.slezacek.model.Repair;

privileged aspect Repair_Roo_Entity {
    
    declare @type: Repair: @Entity;
    
    public static long Repair.countRepairs() {
        return entityManager().createQuery("select count(o) from Repair o", Long.class).getSingleResult();
    }
    
    public static List<Repair> Repair.findAllRepairs() {
        return entityManager().createQuery("select o from Repair o", Repair.class).getResultList();
    }
    
    public static Repair Repair.findRepair(Long id) {
        if (id == null) return null;
        return entityManager().find(Repair.class, id);
    }
    
    public static List<Repair> Repair.findRepairEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Repair o", Repair.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
