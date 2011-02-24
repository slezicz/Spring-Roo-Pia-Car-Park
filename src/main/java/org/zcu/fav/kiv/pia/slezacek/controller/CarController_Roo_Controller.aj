// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.zcu.fav.kiv.pia.slezacek.controller;

import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;
import org.zcu.fav.kiv.pia.slezacek.model.Car;
import org.zcu.fav.kiv.pia.slezacek.reference.CarBody;
import org.zcu.fav.kiv.pia.slezacek.reference.CarManufacturer;

privileged aspect CarController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String CarController.create(@Valid Car car, BindingResult result, Model model, HttpServletRequest request) {
        if (result.hasErrors()) {
            model.addAttribute("car", car);
            return "cars/create";
        }
        car.persist();
        return "redirect:/cars/" + encodeUrlPathSegment(car.getId().toString(), request);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String CarController.createForm(Model model) {
        model.addAttribute("car", new Car());
        return "cars/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String CarController.show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("car", Car.findCar(id));
        model.addAttribute("itemId", id);
        return "cars/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String CarController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model model) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            model.addAttribute("cars", Car.findCarEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Car.countCars() / sizeNo;
            model.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            model.addAttribute("cars", Car.findAllCars());
        }
        return "cars/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String CarController.update(@Valid Car car, BindingResult result, Model model, HttpServletRequest request) {
        if (result.hasErrors()) {
            model.addAttribute("car", car);
            return "cars/update";
        }
        car.merge();
        return "redirect:/cars/" + encodeUrlPathSegment(car.getId().toString(), request);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String CarController.updateForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("car", Car.findCar(id));
        return "cars/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String CarController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model model) {
        Car.findCar(id).remove();
        model.addAttribute("page", (page == null) ? "1" : page.toString());
        model.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/cars?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @ModelAttribute("carbodys")
    public Collection<CarBody> CarController.populateCarBodys() {
        return Arrays.asList(CarBody.class.getEnumConstants());
    }
    
    @ModelAttribute("carmanufacturers")
    public Collection<CarManufacturer> CarController.populateCarManufacturers() {
        return Arrays.asList(CarManufacturer.class.getEnumConstants());
    }
    
    String CarController.encodeUrlPathSegment(String pathSegment, HttpServletRequest request) {
        String enc = request.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
