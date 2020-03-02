/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DynamicEnum.EnumElement;

/**
 *
 * @author xavi
 */
public interface OptionElement extends EnumElement <Boolean,EnumElement> {
    public String getTitle();
    
    public Boolean doOption(EnumElement op);
    
    @Override
    public default Boolean doWith(EnumElement el) {
        return doOption(el);
    }
}
