package tn.esprim.gestionfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tn.esprim.gestionfoyer.services.IChambreService;

@Controller
public class ChambreRestController {

    @Autowired
    private IChambreService chambreService;
}
