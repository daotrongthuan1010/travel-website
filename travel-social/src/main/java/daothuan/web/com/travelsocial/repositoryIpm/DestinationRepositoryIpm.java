/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.repositoryIpm;

import daothuan.web.com.travelsocial.domain.entity.Destination;
import daothuan.web.com.travelsocial.repository.DestinationRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Class DestinationRepositoryIpm use query table Destination.
 *
 * @author thuandao
 * @version 1.0
 */
@Repository
@Transactional
public class DestinationRepositoryIpm implements DestinationRepository {


  @PersistenceContext
  private EntityManager entityManager;

  /**
   * Retrieves a list of destinations with the given name.
   *
   * @param nameDestination the name of the destination to search for
   * @return a list of destinations with the given name
   * @author thuandao
   */
  @Override
  public List<Destination> findListDestination(String nameDestination) {
    TypedQuery<Destination> query = entityManager.createQuery("SELECT u FROM Destination u WHERE u.name = :nameDestination", Destination.class);
    query.setParameter("nameDestination", nameDestination);
    List<Destination> resultList = query.getResultList();
    entityManager.clear();
    return resultList;
  }




}





