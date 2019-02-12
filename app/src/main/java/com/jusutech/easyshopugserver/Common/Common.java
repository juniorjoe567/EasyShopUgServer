package com.jusutech.easyshopugserver.Common;

import com.jusutech.easyshopugserver.Model.Request;
import com.jusutech.easyshopugserver.Model.User;

/**
 * Created by Junior Joseph on 1/8/2019.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;
    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "Currently being shipped";
        else
            return "Shipped";
    }
}
