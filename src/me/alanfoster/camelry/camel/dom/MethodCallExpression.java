//
// Note - This file was automatically generated
// Generation spawned by 'class me.alanfoster.camelry.codegen.ScalateGenerator$'
// Creation Date - 12 August 2013
// Please do not manually modify this class.
//
package me.alanfoster.camelry.camel.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.*;
import java.util.List;


/**
 * @author Alan
 */
//@SubTag("method")
public interface MethodCallExpression extends ExpressionDefinition, DomElement  {
                    @NotNull
        GenericAttributeValue<String> getBean();
                    @NotNull
        GenericAttributeValue<String> getRef();
                    @NotNull
        GenericAttributeValue<String> getMethod();
                    @NotNull
        GenericAttributeValue<String> getBeanTypeName();
    
    
    }