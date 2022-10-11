package orthesis.orthesis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository {
    @Autowired ScoreCrudRepository scoreCrudRepository;
}
