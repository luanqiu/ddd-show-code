package ddd.ddd.show.code.common.specification;

/**
* AndSpecification
*date May 18, 2019 5:33:57 PM
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
