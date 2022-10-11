package orthesis.orthesis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import orthesis.orthesis.services.ScoreService;

@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;
}
