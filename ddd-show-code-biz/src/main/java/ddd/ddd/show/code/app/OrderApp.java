package ddd.ddd.show.code.app;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import ddd.ddd.show.code.domain.core.entity.OrderEntity;
import ddd.ddd.show.code.domain.core.factory.OrderEntityFactory;

/**
 * OrderApp
 * author  wenhe
 * date 2019/5/18
 */
@Component
public class OrderApp {

  /**
   * 第一种实现方式 ： 直接在应用服务中调用工厂，在调用实体持久化
   */
  @Resource
  private OrderEntityFactory orderEntityFactory;

  public void createOrderUseFactory() {
    OrderEntity orderEntity = orderEntityFactory.perfect(null);
    orderEntity.insert();
  }


  /**
   * 第二种实现方式 ： 直接让实体创建自己，实体自己去调用工厂来创建自己
   */
  public void createOrderUseEntity() {
    OrderEntity.get().createOrder(null);
  }


}
