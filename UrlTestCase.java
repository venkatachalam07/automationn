package Completed;

public class UrlTestCase {
  private   String url;

  private String status;

  public  void setURL(String URL){
      this.url=URL;
  }

    public  void setStatus(String Status){
        this.status=Status;
    }

    public  String getUrl(){
      return  this.url;
    }

    public  String getStatus(){
        return  this.status;
    }


    public UrlTestCase(){

    }


    public UrlTestCase(String url, String status) {
        this.url = url;
        this.status = status;
    }

    @Override
    public String toString() {
        return "UrlTestCase{" +
                "url='" + url + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
