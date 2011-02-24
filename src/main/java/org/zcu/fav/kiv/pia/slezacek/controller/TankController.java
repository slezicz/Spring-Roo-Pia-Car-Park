package org.zcu.fav.kiv.pia.slezacek.controller;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zcu.fav.kiv.pia.slezacek.model.Tank;

@RooWebScaffold(path = "tanks", formBackingObject = Tank.class)
@RequestMapping("/tanks")
@Controller
public class TankController {
}
