package org.zcu.fav.kiv.pia.slezacek.controller;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.RooConversionService;
import org.zcu.fav.kiv.pia.slezacek.model.Authorities;
import org.zcu.fav.kiv.pia.slezacek.model.Car;
import org.zcu.fav.kiv.pia.slezacek.model.Repair;
import org.zcu.fav.kiv.pia.slezacek.model.Tank;
import org.zcu.fav.kiv.pia.slezacek.model.Trip;
import org.zcu.fav.kiv.pia.slezacek.model.UserVehicleRights;
import org.zcu.fav.kiv.pia.slezacek.model.Users;
import org.zcu.fav.kiv.pia.slezacek.model.Vehicle;
        
/**
 * A central place to register application Converters and Formatters. 
 */
@RooConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

	@Override
	protected void installFormatters(FormatterRegistry registry) {
		super.installFormatters(registry);
		// Register application converters and formatters
	}
	

	Converter<Authorities, String> getAuthoritiesConverter() {
        return new Converter<Authorities, String>() {
            public String convert(Authorities source) {
                return new StringBuilder().append(source.getUserEntry()).toString();
            }
        };
    }

	Converter<Car, String> getCarConverter() {
        return new Converter<Car, String>() {
            public String convert(Car source) {
                return new StringBuilder().append(source.getManufacturer()).append(" ").append(source.getModel()).append(" ").append(source.getCarBody()).toString();
            }
        };
    }

	Converter<Trip, String> getTripConverter() {
        return new Converter<Trip, String>() {
            public String convert(Trip source) {
                return new StringBuilder().append(source.getTripDate()).append(" ").append(source.getDistance()).toString();
            }
        };
    }

	Converter<UserVehicleRights, String> getUserVehicleRightsConverter() {
        return new Converter<UserVehicleRights, String>() {
            public String convert(UserVehicleRights source) {
                return new StringBuilder().append(source.toString()).toString();
            }
        };
    }

	Converter<Tank, String> getTankConverter() {
        return new Converter<Tank, String>() {
            public String convert(Tank source) {
                return new StringBuilder().append(source.getTankDate()).append(" ").append(source.getAmount()).append(" ").append(source.getPricePerLiter()).toString();
            }
        };
    }

	Converter<Repair, String> getRepairConverter() {
        return new Converter<Repair, String>() {
            public String convert(Repair source) {
                return new StringBuilder().append(source.getReapirDate()).append(" ").append(source.getCost()).append(" ").append(source.getDescription()).toString();
            }
        };
    }

	Converter<Users, String> getUsersConverter() {
        return new Converter<Users, String>() {
            public String convert(Users source) {
                return new StringBuilder().append(source.getUsername()).append(" ").append(source.getEmail()).toString();
            }
        };
    }

	Converter<Vehicle, String> getVehicleConverter() {
        return new Converter<Vehicle, String>() {
            public String convert(Vehicle source) {
                return new StringBuilder().append(source.getCar().getManufacturer()).append(" ").append(source.getCar().getModel()).append(" ").append(source.getNumberPlate()).toString();
            }
        };
    }

	public void installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAuthoritiesConverter());
        registry.addConverter(getCarConverter());
        registry.addConverter(getTripConverter());
        registry.addConverter(getUserVehicleRightsConverter());
        registry.addConverter(getTankConverter());
        registry.addConverter(getRepairConverter());
        registry.addConverter(getUsersConverter());
        registry.addConverter(getVehicleConverter());
    }

	public void afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
}
