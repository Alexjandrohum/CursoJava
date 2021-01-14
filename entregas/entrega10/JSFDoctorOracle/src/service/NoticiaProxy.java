package service;

public class NoticiaProxy implements service.Noticia {
  private String _endpoint = null;
  private service.Noticia noticia = null;
  
  public NoticiaProxy() {
    _initNoticiaProxy();
  }
  
  public NoticiaProxy(String endpoint) {
    _endpoint = endpoint;
    _initNoticiaProxy();
  }
  
  private void _initNoticiaProxy() {
    try {
      noticia = (new service.NoticiaServiceLocator()).getNoticiaPort();
      if (noticia != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)noticia)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)noticia)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (noticia != null)
      ((javax.xml.rpc.Stub)noticia)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  
  
  public service.NoticiaDomain getNoticia() throws java.rmi.RemoteException{
    if (noticia == null)
      _initNoticiaProxy();
    return noticia.getNoticia();
  }
  
  
}