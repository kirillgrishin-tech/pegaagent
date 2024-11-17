package org.grishin.patch;

import javassist.CtMethod;

public interface MethodProcesor {
    void process(CtMethod method);
}