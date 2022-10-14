package orthesis.orthesis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import orthesis.orthesis.models.Ortesis;
import orthesis.orthesis.services.OrtesisService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Ortopedic")
@CrossOrigin(origins ="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class OrtesisController {
   @Autowired
   private OrtesisService ortesisService;

   @GetMapping("/all")
   public List<Ortesis> getAll(){
      return ortesisService.getAll();
   }

   //@GetMapping("/{id}")
   //public Optional<Ortesis> getOrtesis(@PathVariable("id") int id){
   // return ortesisService.getOrtesis(id); //error
   //}

   @PostMapping("/save")
   @ResponseStatus(HttpStatus.CREATED)
   public Ortesis save(@RequestBody Ortesis ortesis){
       return ortesisService.save(ortesis);
   }

}
