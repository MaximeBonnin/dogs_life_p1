package service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

public class DogHandler {

    private DogsRepository itsDogRepo;

    public DogHandler() {}
    public DogHandler(DogsRepository itsDogRepo) {
        this.itsDogRepo = itsDogRepo;
    }

    public long addDog(Dog theDog) {
        return itsDogRepo.save(theDog);
    }

    public long getNoOfDogs() {
        return itsDogRepo.count();
    }
}
