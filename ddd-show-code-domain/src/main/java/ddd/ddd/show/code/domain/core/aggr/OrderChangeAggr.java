package ddd.ddd.show.code.domain.core.aggr;

import ddd.base.domain.Aggr;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

import ddd.base.domain.DomainFactory;
import ddd.ddd.show.code.domain.core.entity.OrderEntity;
import ddd.ddd.show.code.domain.core.entity.OrderGoodsEntity;

/**
 * 订单改价聚合
 * author  wenhe
 * date 2019/5/21
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OrderChangeAggr implements Aggr<String> {

  /**
   * 改价的订单唯一标识
   */
  private String orderId;

  /**
   * 改价的商品唯一标识
   */
  private String orderGoodsId;

  @Override
  public String getAggrRoot() {
    return orderId;
  }

  /**
   * 错误的示范
   */
  //订单改价
  public void changeOrderPrice() {
    OrderEntity orderEntity = OrderEntity.get().getByOrderId(orderId);
    orderEntity.changeOrderPrice();
  }

  //修改订单商品金额
  public void changeGoodsPrice() {
    OrderGoodsEntity orderGoodsEntity = OrderGoodsEntity.get().getByGoodsId(orderGoodsId);
    orderGoodsEntity.changeGoodsPrice();
  }


  /**
   * 推荐的示范
   */
  //订单改价
  public void changePriceByOrder() {
    //step 1：更新订单的总价
    OrderEntity orderEntity = OrderEntity.get().getByOrderId(orderId);
    orderEntity.changeOrderPrice();

    //step 2：更新被影响的商品价格
    List<OrderGoodsEntity> orderGoodsEntities = OrderGoodsEntity.get().getByOrderId(orderId);
    OrderGoodsEntity.get().batchChangeGoodsPrice(orderGoodsEntities);
  }

  //商品改价
  public void changePriceByGoods() {
    //step 1：更新被修改商品的价格
    OrderGoodsEntity orderGoodsEntity = OrderGoodsEntity.get().getByGoodsId(orderGoodsId);
    orderGoodsEntity.changeGoodsPrice();

    //step 1：更新订单的总价
    OrderEntity orderEntity = OrderEntity.get().getByOrderId(orderId);
    orderEntity.changeOrderPrice();
  }

  public void closedOrder() {
    //关单
  }

  public static OrderChangeAggr get() {
    return DomainFactory.get(OrderChangeAggr.class);
  }
}
