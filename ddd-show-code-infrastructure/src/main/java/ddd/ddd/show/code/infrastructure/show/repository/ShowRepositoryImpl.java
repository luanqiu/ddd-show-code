package ddd.ddd.show.code.infrastructure.show.repository;

import org.ddd.base.domain.VO;
import ddd.ddd.show.code.domain.core.entity.ShowEntity;
import ddd.ddd.show.code.domain.core.repository.ShowRepository;
import org.springframework.stereotype.Repository;

/**
* ShowRepositoryImpl
*date May 18, 2019 5:33:57 PM
*/
@Repository
public class ShowRepositoryImpl implements ShowRepository {

  @Override
  public Boolean createShow(VO vo) {
    return null;
  }

  @Override
  public void insert(ShowEntity showEntity) {

  }

  @Override
  public ShowEntity getByShow(String show) {
    return null;
  }

}
