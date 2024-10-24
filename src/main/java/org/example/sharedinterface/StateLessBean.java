package org.example.sharedinterface;

import javax.ejb.Remote;

@Remote
public interface StateLessBean {
    String sayHello(String name);
}
