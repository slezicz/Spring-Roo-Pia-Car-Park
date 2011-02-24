package org.zcu.fav.kiv.pia.slezacek.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;
import org.zcu.fav.kiv.pia.slezacek.model.UserVehicleRights;

import security.UserContextService;
import service.UserVehicleRightsService;

@RooWebScaffold(path = "uservehiclerights", formBackingObject = UserVehicleRights.class)
@RequestMapping("/uservehiclerights")
@Controller
public class UserVehicleRightsController {

	@Autowired
	private UserVehicleRightsService userVehicleRightsService;

	@RequestMapping(method = RequestMethod.POST)
	public String create(@Valid UserVehicleRights userVehicleRights,
			BindingResult result, Model model, HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("userVehicleRights", userVehicleRights);
			return "uservehiclerights/create";
		}
		userVehicleRightsService.create(userVehicleRights);
		return "redirect:/uservehiclerights/"
				+ encodeUrlPathSegment(userVehicleRights.getId().toString(),
						request);
	}

	String encodeUrlPathSegment(String pathSegment, HttpServletRequest request) {
		String enc = request.getCharacterEncoding();
		if (enc == null) {
			enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
		}
		try {
			pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
		} catch (UnsupportedEncodingException uee) {
		}
		return pathSegment;
	}
}
