package ddd.ddd.show.code.common.exception;

public class DddShowCodeSpiException extends DddShowCodeException {

  public DddShowCodeSpiException() {
    super();
  }

  public DddShowCodeSpiException(int code, String msg) {
    super(code, msg);
  }

  public DddShowCodeSpiException(Errors errors) {
    super(errors.getCode(), errors.getMessage());
  }

  public DddShowCodeSpiException(Throwable cause) {
    super(cause);
  }

  public DddShowCodeSpiException(String msg, Errors errors) {
    super(msg, errors);
  }
}
