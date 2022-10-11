package orthesis.orthesis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import orthesis.orthesis.models.Ortesis;
import orthesis.orthesis.services.OrtesisService;

import java.util.List;

@RestController
@RequestMapping("/api/Ortopedic")

public class OrtesisController {
   @Autowired
   private OrtesisService ortesisService;

   @GetMapping("/all")
   public List<Ortesis> getOrtesis(){
       return ortesisService.getAll();
   }
   @PostMapping("/save")
   @ResponseStatus(HttpStatus.CREATED)
   public Ortesis save(@RequestBody Ortesis ortesis){
       return ortesisService.save(ortesis);
   }

}
