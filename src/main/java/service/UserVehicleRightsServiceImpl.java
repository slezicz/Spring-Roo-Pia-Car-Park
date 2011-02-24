package service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zcu.fav.kiv.pia.slezacek.model.UserVehicleRights;
import org.zcu.fav.kiv.pia.slezacek.model.Users;

import security.UserContextService;

@Service
public class UserVehicleRightsServiceImpl implements UserVehicleRightsService{

	
	@Autowired
	private transient UserContextService userContextService;
	
	@Override
	public void create(UserVehicleRights uvr) {
		Users currentUser = Users.findUsersesByUsername(userContextService.getCurrentUser()).getSingleResult();
		uvr.setDelegate(currentUser);
		uvr.persist();
	}
}
