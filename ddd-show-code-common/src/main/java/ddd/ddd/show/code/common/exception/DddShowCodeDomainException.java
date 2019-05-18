package ddd.ddd.show.code.common.exception;

public class DddShowCodeDomainException extends DddShowCodeException {

  public DddShowCodeDomainException() {
    super();
  }

  public DddShowCodeDomainException(int code, String msg) {
    super(code, msg);
  }

  public DddShowCodeDomainException(Errors errors) {
    super(errors.getCode(), errors.getMessage());
  }

  public DddShowCodeDomainException(Errors errors, Throwable cause) {
    super(errors, cause);
  }

  public DddShowCodeDomainException(String msg, Errors errors) {
    super(msg, errors);
  }
}
