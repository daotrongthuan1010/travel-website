/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.repository.repositoryIpm;

import daothuan.web.com.travelsocial.domain.entity.Destination;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * Class DestinationRepositoryIpm use query table Destination.
 *
 * @author thuandao
 * @version 1.0
 */
@Repository
@Transactional
public class DestinationRepositoryIpm {


  @PersistenceContext
  private EntityManager entityManager;

  /**
   * Retrieves a list of destinations with the given name.
   *
   * @param nameDestination the name of the destination to search for
   * @return a list of destinations with the given name
   * @author thuandao
   */

  public List<Destination> findListDestination(String nameDestination) {
    TypedQuery<Destination> query = entityManager.createQuery("SELECT u FROM Destination u WHERE u.name = :nameDestination", Destination.class);
    query.setParameter("nameDestination", nameDestination);
    List<Destination> resultList = query.getResultList();
    entityManager.clear();
    return resultList;
  }


  @Transactional
  public void saveOrUpdate(Destination destination) {
    Optional<Destination> optional = Optional.ofNullable(destination.getId())
        .flatMap(id -> Optional.ofNullable(entityManager.find(Destination.class, id)));

    if (optional.isPresent()) {
      Destination existingDestination = optional.get();
      existingDestination = Destination.builder()
          .id(destination.getId())
          .name(destination.getName())
          .description(destination.getDescription())
          .locationId(destination.getLocationId())
          .build();
      entityManager.merge(existingDestination);
    } else {
      entityManager.persist(destination);
    }
    entityManager.flush();
  }





}





