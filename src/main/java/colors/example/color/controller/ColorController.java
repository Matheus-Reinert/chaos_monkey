package colors.example.color.controller;

import colors.example.color.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColorController {

    @Autowired
    private ColorService service;

    @GetMapping("/getColors")
    public List<String> getColors(){
        return service.getColors();
    }
}
