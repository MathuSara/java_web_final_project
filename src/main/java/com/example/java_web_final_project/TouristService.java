package com.example.java_web_final_project;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService {
    private final TouristRespository touristRespository;

    public TouristService(TouristRespository touristRespository){
        this.touristRespository = touristRespository;
    }


    public List<Tourist> getAll(){
        return touristRespository.findAll();
    }
    public void add(Tourist tourist){
        touristRespository.save(tourist);
    }
    public boolean delete(int id){
        touristRespository.deleteById(id);
        return true;
    }
    public void update(Tourist tourist, int id){

        Optional<Tourist> tourist1 = touristRespository.findById(id);

        if(tourist1.isPresent()){
            Tourist touristToUpdate = tourist1.get();

            touristToUpdate.setName(tourist.getName());
            touristToUpdate.setPlace(tourist.getPlace());
            touristRespository.save(touristToUpdate);
            
            
        }
    }
}
