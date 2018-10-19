package IntranetForms_HAI/src/main/java/com/aws/codestar/projecttemplates/controller/entity;

public class BasicResponse {

  public enum Code {
    OK
  }

  private Code code;

  public BasicResponse() {
    this.code = Code.OK;
  }

  public Code getCode() {
    return code;
  }

  public void setCode(Code code) {
    this.code = code;
  }

}
