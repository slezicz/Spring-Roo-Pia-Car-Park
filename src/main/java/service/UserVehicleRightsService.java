package service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.zcu.fav.kiv.pia.slezacek.model.UserVehicleRights;

public interface UserVehicleRightsService {
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void create(UserVehicleRights uvr);
}
