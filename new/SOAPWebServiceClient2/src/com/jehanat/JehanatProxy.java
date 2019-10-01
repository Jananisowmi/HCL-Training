package com.jehanat;

public class JehanatProxy implements com.jehanat.Jehanat {
  private String _endpoint = null;
  private com.jehanat.Jehanat jehanat = null;
  
  public JehanatProxy() {
    _initJehanatProxy();
  }
  
  public JehanatProxy(String endpoint) {
    _endpoint = endpoint;
    _initJehanatProxy();
  }
  
  private void _initJehanatProxy() {
    try {
      jehanat = (new com.jehanat.JehanatServiceLocator()).getJehanat();
      if (jehanat != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jehanat)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jehanat)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jehanat != null)
      ((javax.xml.rpc.Stub)jehanat)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jehanat.Jehanat getJehanat() {
    if (jehanat == null)
      _initJehanatProxy();
    return jehanat;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (jehanat == null)
      _initJehanatProxy();
    return jehanat.getName();
  }
  
  
}