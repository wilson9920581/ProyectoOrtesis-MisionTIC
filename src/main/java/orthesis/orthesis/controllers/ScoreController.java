package orthesis.orthesis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import orthesis.orthesis.models.Score;
import orthesis.orthesis.services.ScoreService;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/Score")
//@CrossOrigin(origins ="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    //@GetMapping("/all")
    //public List<Score> getAll(){
        //return scoreService.getAll();
    //}

    //@GetMapping("/{id}")
    //public Optional<Score> getScore(@PathVariable("id") int id){
        //return scoreService.getScore(id);
    //}

    //@PostMapping("/save")
    //@ResponseStatus(HttpStatus.CREATED)
    //public Score save(@RequestBody Score score){
      //  return scoreService.save(score)
}


