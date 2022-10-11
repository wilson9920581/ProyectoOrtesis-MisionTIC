package orthesis.orthesis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import orthesis.orthesis.models.Category;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    //Get
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    //post
    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }

}
