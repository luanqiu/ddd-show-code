package ddd.ddd.show.code.domain.core.entity;

import ddd.base.domain.DomainFactory;
import ddd.base.domain.Entity;
import ddd.base.domain.VO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

import ddd.ddd.show.code.common.exception.DddShowCodeDomainException;
import ddd.ddd.show.code.common.exception.DddShowCodeSpiException;
import ddd.ddd.show.code.common.exception.Errors;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * OrderGoodsEntity
 * !!!important 禁止直接注入该对象，强烈建议get方法
 * date 2019/4/6
 */
@Slf4j
@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OrderGoodsEntity implements Entity<String> {

  public OrderGoodsEntity createOrder(VO vo) {
    try {
      return null;
    } catch (DddShowCodeSpiException e) {
      throw new DddShowCodeDomainException(Errors.DEFAULT_PARAM_VALID_ERROR.getCode(),
                                           e.getMessage());
    } catch (DddShowCodeDomainException e) {
      throw e;
    } catch (Exception e) {
      throw new DddShowCodeDomainException(Errors.DEFAULT_PARAM_VALID_ERROR.getCode(),
                                           e.getMessage());
    }
  }

  public void insert() {
    //持久化
  }

  /**
   * 最简单的得到自己新的实例
   * 复杂的请使用Factory
   */
  public static final OrderGoodsEntity get() {
    return DomainFactory.get(OrderGoodsEntity.class);
  }

  @Override
  public String getUniqueId() {
    return null;
  }

  public void changeGoodsPrice() {
  }

  public List<OrderGoodsEntity> getByOrderId(String orderId) {
    return null;
  }

  public void batchChangeGoodsPrice(List<OrderGoodsEntity> orderGoodsList) {
  }

  public OrderGoodsEntity getByGoodsId(String orderGoodsId) {
    return null;
  }
}
