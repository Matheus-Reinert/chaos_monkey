package colors.example.color.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ColorService {
    public List<String> getColors() {
        return Arrays.asList("Violet","Indigo","Blue"
                ,"Green","Yellow","Orange","Red");
    }
}
