package daothuan.web.com.travelsocial.repository.repositoryIpm;

import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.repository.DestinationCustomRepository;
import daothuan.web.com.travelsocial.repository.DestinationRepository;
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
public class DestinationRepositoryIpm implements DestinationCustomRepository {


  @PersistenceContext
  private EntityManager entityManager;

  /**

   Finds a list of destinations by name, with pagination support.
   @param nameDestination the name of the destination to search for
   @param offset the index of the first result to retrieve
   @param limit the maximum number of results to retrieve
   @return a list of Destination objects matching the specified name, limited by the given offset and limit
   */

  public List<Get_List_Destination_By_Name_DTO> findListDestination(String nameDestination, int offset, int limit) {

    int startPosition = offset * limit;

    String jpql = "SELECT NEW daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO(d.codeTour, d.name, d.description, p.price)"
        + " FROM Destination d "
        + "left  join Price p "
        + "on d.id   = p.idDestination "
        + "left join  Post  p2 "
        + "on p2.postId  = d.id where d.name like :nameDestination";

    TypedQuery<Get_List_Destination_By_Name_DTO>
        query = entityManager.createQuery(jpql, Get_List_Destination_By_Name_DTO.class);
    query.setParameter("nameDestination", nameDestination);
    query.setFirstResult(offset);
    query.setMaxResults(limit);
    List<Get_List_Destination_By_Name_DTO> resultList = query.getResultList();

    entityManager.clear();
    return resultList;
  }





}





