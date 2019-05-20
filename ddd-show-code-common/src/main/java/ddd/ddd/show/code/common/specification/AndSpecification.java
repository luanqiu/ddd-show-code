package ddd.ddd.show.code.common.specification;

/**
* AndSpecification
*date May 20, 2019 8:32:41 PM
*/
public class AndSpecification<T> extends CompositeSpecification<T>{

  private ISpecification<T> leftSpecification;
  private ISpecification<T> rightSpecification;

  public AndSpecification(ISpecification<T> leftSpecification,ISpecification<T> rightSpecification){
    this.leftSpecification=leftSpecification;
    this.rightSpecification =rightSpecification;
  }

  @Override
  public boolean isSatisfied(T candidate) {
    return leftSpecification.isSatisfied(candidate) && rightSpecification.isSatisfied(candidate);
  }
}
