/**
 * JehanatServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jehanat;

public class JehanatServiceLocator extends org.apache.axis.client.Service implements com.jehanat.JehanatService {

    public JehanatServiceLocator() {
    }


    public JehanatServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JehanatServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Jehanat
    private java.lang.String Jehanat_address = "http://192.168.1.37:8091/SOAPWebServiceDemo2/services/Jehanat";

    public java.lang.String getJehanatAddress() {
        return Jehanat_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JehanatWSDDServiceName = "Jehanat";

    public java.lang.String getJehanatWSDDServiceName() {
        return JehanatWSDDServiceName;
    }

    public void setJehanatWSDDServiceName(java.lang.String name) {
        JehanatWSDDServiceName = name;
    }

    public com.jehanat.Jehanat getJehanat() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Jehanat_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJehanat(endpoint);
    }

    public com.jehanat.Jehanat getJehanat(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jehanat.JehanatSoapBindingStub _stub = new com.jehanat.JehanatSoapBindingStub(portAddress, this);
            _stub.setPortName(getJehanatWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJehanatEndpointAddress(java.lang.String address) {
        Jehanat_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jehanat.Jehanat.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jehanat.JehanatSoapBindingStub _stub = new com.jehanat.JehanatSoapBindingStub(new java.net.URL(Jehanat_address), this);
                _stub.setPortName(getJehanatWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Jehanat".equals(inputPortName)) {
            return getJehanat();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jehanat.com", "JehanatService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jehanat.com", "Jehanat"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Jehanat".equals(portName)) {
            setJehanatEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
