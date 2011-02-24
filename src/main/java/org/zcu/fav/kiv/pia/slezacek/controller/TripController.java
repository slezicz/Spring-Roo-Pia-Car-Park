package org.zcu.fav.kiv.pia.slezacek.controller;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zcu.fav.kiv.pia.slezacek.model.Trip;

@RooWebScaffold(path = "trips", formBackingObject = Trip.class)
@RequestMapping("/trips")
@Controller
public class TripController {
}
