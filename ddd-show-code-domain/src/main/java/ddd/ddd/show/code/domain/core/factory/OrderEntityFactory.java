package ddd.ddd.show.code.domain.core.factory;

import ddd.base.domain.DomainFactory;
import ddd.base.domain.VO;
import org.springframework.stereotype.Component;

import ddd.ddd.show.code.domain.core.entity.OrderEntity;

/**
 * perfect 简单的构造示范
 * date 2019/4/6
 */
@Component
public class OrderEntityFactory implements DomainFactory<VO, OrderEntity> {

  @Override
  public OrderEntity perfect(VO vo) {
    OrderEntity entity = OrderEntity.get();
    return entity;
  }
}
