package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {
    private final TouristService touristService;

    public TouristController(TouristService touristService){
        this.touristService = touristService;
    }

    @GetMapping
    public List<Tourist> getTourist(){
        return touristService.getAll();

    }
    @PostMapping
    public void addTourist(@RequestBody Tourist tourist){
    touristService.add(tourist);
    }

    @PutMapping("/{id}")
    public void updateTourist(@RequestParam(value = "id") Integer id,@RequestBody Tourist tourist){
    touristService.update(tourist, id);

    }
    @DeleteMapping("/{id}")
    public void deleteBook(Integer id){
     touristService.delete(id);
    }

}
