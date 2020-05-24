package com.test.timezone.controller;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.test.timezone.services.TimezoneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jose Ortiz
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private TimezoneServices timezoneServices;
    @CrossOrigin
    @PostMapping(value="/get")
    public String getTimeZone( @RequestBody String requestJson) {
        JsonObject object = new JsonParser().parse(requestJson).getAsJsonObject();
        //@RequestParam String hour, @RequestParam String timezone

        return timezoneServices.getTimeZone(object.get("hour").getAsString(),object.get("timezone").getAsString());
    }
}
