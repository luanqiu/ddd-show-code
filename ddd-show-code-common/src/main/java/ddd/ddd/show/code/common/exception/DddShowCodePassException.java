package ddd.ddd.show.code.common.exception;

/**
 * 无需预警
 */
public class DddShowCodePassException extends DddShowCodeException {

  public DddShowCodePassException() {
    super();
  }

  public DddShowCodePassException(int code, String msg) {
    super(code, msg);
  }

  public DddShowCodePassException(Errors errors) {
    super(errors.getCode(), errors.getMessage());
  }

  public DddShowCodePassException(Errors errors, Throwable cause) {
    super(errors, cause);
  }

  public DddShowCodePassException(Throwable cause) {
    super(cause);
  }

  public DddShowCodePassException(String msg) {
    super(msg);
  }

  public DddShowCodePassException(String msg, Errors errors) {
    super(msg, errors);
  }
}
