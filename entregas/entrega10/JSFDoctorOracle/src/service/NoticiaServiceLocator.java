/**
 * NoticiaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class NoticiaServiceLocator extends org.apache.axis.client.Service implements service.NoticiaService {

    public NoticiaServiceLocator() {
    }


    public NoticiaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NoticiaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NoticiaPort
    private java.lang.String NoticiaPort_address = "http://localhost:8080/WebServiceNoticia/noticia";

    public java.lang.String getNoticiaPortAddress() {
        return NoticiaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NoticiaPortWSDDServiceName = "NoticiaPort";

    public java.lang.String getNoticiaPortWSDDServiceName() {
        return NoticiaPortWSDDServiceName;
    }

    public void setNoticiaPortWSDDServiceName(java.lang.String name) {
        NoticiaPortWSDDServiceName = name;
    }

    public service.Noticia getNoticiaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NoticiaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNoticiaPort(endpoint);
    }

    public service.Noticia getNoticiaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.NoticiaPortBindingStub _stub = new service.NoticiaPortBindingStub(portAddress, this);
            _stub.setPortName(getNoticiaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNoticiaPortEndpointAddress(java.lang.String address) {
        NoticiaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.Noticia.class.isAssignableFrom(serviceEndpointInterface)) {
                service.NoticiaPortBindingStub _stub = new service.NoticiaPortBindingStub(new java.net.URL(NoticiaPort_address), this);
                _stub.setPortName(getNoticiaPortWSDDServiceName());
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
        if ("NoticiaPort".equals(inputPortName)) {
            return getNoticiaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "NoticiaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "NoticiaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NoticiaPort".equals(portName)) {
            setNoticiaPortEndpointAddress(address);
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
